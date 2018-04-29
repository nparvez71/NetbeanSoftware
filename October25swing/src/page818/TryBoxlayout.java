
package page818;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class TryBoxlayout {
    static JFrame aWindow=new JFrame("This is Grid layout");
       public static void main(String[] args) {
        Toolkit theKit=aWindow.getToolkit();
        Dimension windSize=theKit.getScreenSize();
        aWindow.setBounds(windSize.width/4, windSize.height/4, 
                            windSize.width/2, windSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       Box left =Box.createVerticalBox();
       ButtonGroup radioGroup=new ButtonGroup();
           JRadioButton rbutton;
       radioGroup.add(rbutton=new JRadioButton("red"));
       left.add(rbutton);
     //  left.add(Box.createVerticalStrut(80));//extra
        radioGroup.add(rbutton=new JRadioButton("green"));
       left.add(rbutton);
        radioGroup.add(rbutton=new JRadioButton("blue"));
       left.add(rbutton);
        radioGroup.add(rbutton=new JRadioButton("yellow"));
       left.add(rbutton);
       
       Box right=Box.createVerticalBox();
       right.add(new JCheckBox("Dashed"));
       right.add(Box.createGlue());
        right.add(new JCheckBox("Thick"));
         right.add(new JCheckBox("Rounded"));
         
          Box top=Box.createHorizontalBox();
         top.add(left);
          top.add(right);
           JPanel bottomPanel=new JPanel();
          Border edge=BorderFactory.createRaisedBevelBorder();
           JButton button;
          Dimension size=new Dimension(80,20);
          bottomPanel.add(button=new JButton("Defaults"));
          button.setBorder(edge);
          button.setPreferredSize(size);
           bottomPanel.add(button=new JButton("ok"));
            button.setBorder(edge);
          button.setPreferredSize(size);
           bottomPanel.add(button=new JButton("cancel"));
            button.setBorder(edge);
          button.setPreferredSize(size);
          Container content=aWindow.getContentPane();
          content.setLayout(new BorderLayout());
          content.add(top,BorderLayout.CENTER);
            content.add(bottomPanel,BorderLayout.SOUTH);
            aWindow.pack();
            aWindow.setVisible(true);
       }
}
