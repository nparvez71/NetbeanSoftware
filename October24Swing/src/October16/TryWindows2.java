
package October16;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class TryWindows2 {
    static JFrame aWindow=new JFrame("This is Tittle");
    public static void main(String[] args) {
        Toolkit theKit=aWindow.getToolkit();
        Dimension wndSize=theKit.getScreenSize();
        aWindow.setBounds(wndSize.width/4, wndSize.height/4, wndSize.width/2, wndSize.height/2);
        
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //exit hobbbbbbbyyyyyy
        aWindow.setVisible(true);
    }
    
}
