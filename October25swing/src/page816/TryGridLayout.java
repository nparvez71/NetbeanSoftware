package page816;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
public class TryGridLayout {
     static JFrame aWindow=new JFrame("This is Grid layout");
       public static void main(String[] args) {
        Toolkit theKit=aWindow.getToolkit();
        Dimension windSize=theKit.getScreenSize();
        aWindow.setBounds(windSize.width/4, windSize.height/4, 
                            windSize.width/2, windSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    GridLayout grid=new GridLayout(2,3,30,20);
         Container content=aWindow.getContentPane();
        content.setLayout(grid);
        EtchedBorder edge=new EtchedBorder(EtchedBorder.RAISED);
        JButton button=null;
         for(int i=1;i<=6;i++){
          content.add(button=new JButton("Enter"+i));
           button.setBorder(edge);}
         aWindow.pack();
         aWindow.setVisible(true);
       }
}
