import javax.swing.*;
import javax.swing.SwingUtilities;
import java.awt.*;
import javax.swing.border.EtchedBorder;

public class TryBorderLayout {

  public static void createWindow(){
    JFrame aWindow = new JFrame("This is the Window Title");
    Toolkit theKit = aWindow.getToolkit();                             // Get the window toolkit
    Dimension wndSize = theKit.getScreenSize();                        // Get screen size

    // Set the position to screen center & size to half screen size
    aWindow.setSize(wndSize.width/2, wndSize.height/2);                // Set window size
    aWindow.setLocationRelativeTo(null);                               // Center window
    aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    BorderLayout border = new BorderLayout();                          // Create a layout manager
    Container content = aWindow.getContentPane();                      // Get the content pane
    content.setLayout(border);                                         // Set the container layout mgr
    EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);         // Button border

    // Now add five JButton components and set their borders
    JButton button;
    content.add(button = new JButton("EAST"), BorderLayout.EAST);
    button.setBorder(edge);
    content.add(button = new JButton("WEST"), BorderLayout.WEST);
    button.setBorder(edge);
    content.add(button = new JButton("NORTH"), BorderLayout.NORTH);
    button.setBorder(edge);
    content.add(button = new JButton("SOUTH"), BorderLayout.SOUTH);
    button.setBorder(edge);
    content.add(button = new JButton("CENTER"), BorderLayout.CENTER);
    button.setBorder(edge);

    aWindow.setVisible(true);                                          // Display the window
  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createWindow();
            }
        });
  }
}