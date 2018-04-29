import java.awt.*;
import java.io.Serializable;
import static Constants.SketcherConstants.*;
import java.awt.geom.*;

public abstract class Element implements Serializable{

  public Element(Point position, Color color) {
    this.position = new Point(position);
    this.color = color;
  }

  protected Element(Color color) {
    this.color = color;
  }

  // Returns the color of the element
  public Color getColor() {
    return color;
  }

  // Returns the position of the element
  public Point getPosition() {
    return position;
  }

  // Returns the bounding rectangle enclosing an element boundary
  public java.awt.Rectangle getBounds() {
    AffineTransform at = AffineTransform.getTranslateInstance(position.x, position.y);
    at.rotate(angle);
    at.translate(-position.x, -position.y);
    return  at.createTransformedShape(bounds).getBounds();
  }

  // Set or reset highlight color
  public void setHighlighted(boolean highlighted) {
    this.highlighted = highlighted;
  }

  // Create a new element
  public static Element createElement(int type, Color color, Point start, Point end) {
    switch(type) {
      case LINE:
        return new Element.Line(start, end, color);
      case RECTANGLE:
         return new Rectangle(start, end, color);
      case CIRCLE:
        return new Circle(start, end, color);
      case CURVE:
        return new Curve(start, end, color);
      default:
       assert false;                                                   // We should never get to here
    }
    return null;
  }

  // Draw a geometric element of type Shape
  protected void draw(Graphics2D g2D, Shape element) {
    g2D.setPaint(highlighted ? Color.MAGENTA : color);                 // Set the element color
    AffineTransform old = g2D.getTransform();                          // Save copy of current transform
    g2D.translate((double)position.x, (double)position.y);             // Add a translation to current transform
    g2D.rotate(angle);                                                 // Rotate about position
     g2D.draw(element);                                                // Draw the element
    g2D.setTransform(old);                                             // Restore original transform
  }

  // Move an element
  public void move(int deltaX, int deltaY) {
    position.translate(deltaX, deltaY);
    bounds.translate(deltaX, deltaY);
  }

  // Rotate an element
  public void setRotation(double angle) {
    this.angle = angle;
  }

  // Get the rotation angle
  public double getRotation() {
    return angle;
  }

  // Nested class defining a line
  public static class Line extends Element {
    public Line(Point start, Point end, Color color) {
      super(start, color);
      line = new Line2D.Double(origin.x, origin.y, end.x - position.x, end.y - position.y);
      bounds = new java.awt.Rectangle(
                     Math.min(start.x ,end.x),    Math.min(start.y, end.y),
                     Math.abs(start.x - end.x)+1, Math.abs(start.y - end.y)+1);
    }

    // Change the end point for the line
    public void modify(Point start, Point last) {
      line.x2 = last.x - position.x;
      line.y2 = last.y - position.y;
      bounds = new java.awt.Rectangle(
                   Math.min(start.x ,last.x),    Math.min(start.y, last.y),
                   Math.abs(start.x - last.x)+1, Math.abs(start.y - last.y)+1);
    }

    // Display the line
    public  void draw(Graphics2D g2D) {
      draw(g2D, line);                                                 // Draw the line
    }
    private Line2D.Double line;
    private final static long serialVersionUID = 1001L;
  }

  // Nested class defining a rectangle
  public static class Rectangle extends Element {
    public Rectangle(Point start, Point end, Color color) {
      super(new Point(Math.min(start.x, end.x), Math.min(start.y, end.y)), color);
      rectangle = new Rectangle2D.Double(
        origin.x, origin.y,                                            // Top-left corner
        Math.abs(start.x - end.x), Math.abs(start.y - end.y));         // Width & height
      bounds = new java.awt.Rectangle(
                    Math.min(start.x ,end.x),    Math.min(start.y, end.y),
                    Math.abs(start.x - end.x)+1, Math.abs(start.y - end.y)+1);
    }

    // Display the rectangle
    public  void draw(Graphics2D g2D) {
      draw(g2D, rectangle);                                            // Draw the rectangle
    }

    // Method to redefine the rectangle
    public void modify(Point start, Point last) {
      bounds.x = position.x = Math.min(start.x, last.x);
      bounds.y = position.y = Math.min(start.y, last.y);
      rectangle.width = Math.abs(start.x - last.x);
      rectangle.height = Math.abs(start.y - last.y);
      bounds.width = (int)rectangle.width + 1;
      bounds.height = (int)rectangle.height + 1;
    }

    private Rectangle2D.Double rectangle;
    private final static long serialVersionUID = 1001L;
  }

  // Nested class defining a circle
  public static class Circle extends Element {
    public Circle(Point center, Point circum, Color color) {
      super(color);

      // Radius is distance from center to circumference
      double radius = center.distance(circum);
      position = new Point(center.x - (int)radius, center.y - (int)radius);
      circle = new Ellipse2D.Double(origin.x, origin.y, 2.*radius, 2.*radius);
      bounds = new java.awt.Rectangle(position.x, position.y,
                              1 + (int)circle.width, 1 + (int)circle.height);
    }

    // Display the circle
    public  void draw(Graphics2D g2D) {
      draw(g2D, circle);                                               // Draw the circle
    }

    // Recreate this circle
    public void modify(Point center, Point circum) {
      double radius = center.distance(circum);
      circle.width = circle.height = 2*radius;
      position.x = center.x - (int)radius;
      position.y = center.y - (int)radius;
      bounds = new java.awt.Rectangle(position.x, position.y,
                              1 + (int)circle.width, 1 + (int)circle.height);
    }

    private Ellipse2D.Double circle;
    private final static long serialVersionUID = 1001L;
  }

  // Nested class defining a curve
  public static class Curve extends Element {
    public Curve(Point start, Point next, Color color) {
      super(start, color);
      curve = new GeneralPath();
      curve.moveTo(origin.x, origin.y);                                // Set current position as origin
      curve.lineTo(next.x - position.x, next.y - position.y);          // Add segment
      bounds = new java.awt.Rectangle(
                   Math.min(start.x, next.x),    Math.min(start.y, next.y),
                   Math.abs(next.x - start.x)+1, Math.abs(next.y - start.y)+1);
    }

    // Add another segment
    public void modify(Point start, Point next) {
      curve.lineTo(next.x - position.x, next.y - position.y);          // Add segment
      bounds.add(new java.awt.Rectangle(next.x,next.y, 1, 1));         // Extend bounds
    }


    // Display the curve
    public  void draw(Graphics2D g2D) {
      draw(g2D, curve);                                                // Draw the curve
    }

    private GeneralPath curve;
    private final static long serialVersionUID = 1001L;
  }

  // Nested class defining a Text element
  public static class Text extends Element  {
    public Text(String text, Point start, Color color, FontMetrics fm) {
      super(start, color);
      this.text = text;
      this.font = fm.getFont();
        maxAscent = fm.getMaxAscent();
        bounds = new java.awt.Rectangle(position.x, position.y,
                 fm.stringWidth(text) + 4, maxAscent+ fm.getMaxDescent() + 4);
    }

    public void draw(Graphics2D g2D)  {
      g2D.setPaint(highlighted ? HIGHLIGHT_COLOR : color);
      Font oldFont = g2D.getFont();                                    // Save the old font
      g2D.setFont(font);                                               // Set the new font

      AffineTransform old = g2D.getTransform();                        // Save the current transform
      g2D.translate((double)position.x, (double)position.y);           // Add translation transform to current
      g2D.rotate(angle);                                               // Rotate about position
      // Reference point for drawString() is the baseline of the 1st character
      g2D.drawString(text, origin.x + 2, maxAscent + 2);
      g2D.setTransform(old);                                           // Restore original transform
      g2D.setFont(oldFont);                                            // Restore the old font
    }

    public void modify(Point start, Point last) {
      // No code is required here, but you must supply a definition
    }

    private Font font;                                                 // The font to be used
    private int maxAscent;                                             // Maximum ascent
    private String text;                                               // Text to be displayed
    private final static long serialVersionUID = 1001L;
  }

  // Abstract Element class methods
  public abstract void draw(Graphics2D g2D);
  public abstract void modify(Point start, Point last);

  // Element class fields
  protected Point position;                                            // Position of a shape
  protected Color color;                                               // Color of a shape
  protected java.awt.Rectangle bounds;                                 // Bounding rectangle
  protected static final Point origin = new Point();                   // Origin for elements
  protected boolean highlighted = false;                               // Highlight flag
  protected double angle = 0.0;                                        // Element rotation
  private final static long serialVersionUID = 1001L;
}
