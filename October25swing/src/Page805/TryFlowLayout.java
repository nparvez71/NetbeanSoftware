package Page805;

import java.awt.*;
import javax.swing.*;
public class TryFlowLayout {
    static JFrame aWindow=new JFrame("This is Flowlay out");
    public static void main(String[] args) {
        Toolkit theKit=aWindow.getToolkit();
        Dimension windSize=theKit.getScreenSize();
        aWindow.setBounds(windSize.width/4, windSize.height/4, 
                            windSize.width/2, windSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout flow=new FlowLayout(FlowLayout.LEFT,50,100);//extra
        Container content=aWindow.getContentPane();
        content.setLayout(flow);
        for(int i=1;i<=20;i++)
        content.add(new JButton("press"+i));
      //  aWindow.pack();//extra
        aWindow.setVisible(true);
    }
}
