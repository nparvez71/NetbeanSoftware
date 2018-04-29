
package October16;

import javax.swing.*;

public class FramingWindoe {
    static JFrame aWindow=new JFrame("This is the window tItLE");
    public static void main(String[] args) {
        int windowWidth=400;
        int windowHeight=450;
        aWindow.setBounds(50, 400, windowWidth, windowHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
    }
            
    
}
