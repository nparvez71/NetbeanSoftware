package page824;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class TryBoxLayout {
     static JFrame aWindow=new JFrame("This is Grid layout");
       public static void main(String[] args) {   Toolkit theKit=aWindow.getToolkit();
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
          //from page 818///
          
          
          
           JPanel leftPanel=new JPanel(new BorderLayout());
           leftPanel.setBorder(new TitledBorder(new EtchedBorder(),"Line color"));
           leftPanel.add(left,BorderLayout.CENTER);
           JPanel rightPanel=new JPanel(new BorderLayout());
           rightPanel.setBorder(new TitledBorder(new EtchedBorder(),"Line properties"));
           rightPanel.add(right,BorderLayout.CENTER);
          
           top.add(leftPanel);
             top.add(Box.createHorizontalStrut(5));
             top.add(rightPanel);
             
             JPanel bottomPanel=new JPanel();
             bottomPanel.setBorder(new CompoundBorder(
                     BorderFactory.createLineBorder(Color.yellow, 1),
                      BorderFactory.createBevelBorder(BevelBorder.RAISED)
             ));
             
             Container content=aWindow.getContentPane();
             BoxLayout box =new BoxLayout(content,BoxLayout.Y_AXIS);
             content.setLayout(box);
             content.add(top);
             content.add(bottomPanel);
             aWindow.pack();
              aWindow.setVisible(true);
       }
}
