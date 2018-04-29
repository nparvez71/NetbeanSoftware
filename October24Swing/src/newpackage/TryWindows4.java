
package newpackage;

import java.awt.*;
import javax.swing.JFrame;

public class TryWindows4 {
    static JFrame aWindow=new JFrame("this is tittle");
    public static void main(String[] args) {
        Toolkit theKit=aWindow.getToolkit();
        Dimension wndSize=theKit.getScreenSize();
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, 
                wndSize.width/2,  wndSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.LIGHT_GRAY);
        aWindow.setVisible(true);
    }
}
