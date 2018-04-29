package Page811;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;
public class TryBorderLayout { 
    static JFrame aWindow=new JFrame("This is Border layout");
    public static void main(String[] args) {
        Toolkit theKit=aWindow.getToolkit();
        Dimension windSize=theKit.getScreenSize();
        aWindow.setBounds(windSize.width/4, windSize.height/4, 
                            windSize.width/2, windSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        BorderLayout border=new BorderLayout();
         Container content=aWindow.getContentPane();
        content.setLayout(border);
        EtchedBorder edge=new EtchedBorder(EtchedBorder.RAISED);
        JButton button;
        content.add(button=new JButton("EAST"),BorderLayout.EAST);
        button.setBorder(edge);
         content.add(button=new JButton("WEST"),BorderLayout.WEST);
        button.setBorder(edge);
         content.add(button=new JButton("NORTH"),BorderLayout.NORTH);
        button.setBorder(edge);
         content.add(button=new JButton("SOUTH"),BorderLayout.SOUTH);
        button.setBorder(edge);
         content.add(button=new JButton("CENTER"),BorderLayout.CENTER);
        button.setBorder(edge);
        aWindow.setVisible(true);
    }
}
