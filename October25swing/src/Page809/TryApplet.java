
package Page809;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class TryApplet extends JApplet{
    public void init(){
    Container content=getContentPane();
    content.setLayout(new FlowLayout(FlowLayout.RIGHT));
    JButton button;
    Font[] font={new Font("Serif",Font.ITALIC,20),
                   new Font("Dialog",Font.PLAIN,14) };
        BevelBorder edge=new BevelBorder(BevelBorder.RAISED);
        for(int i=1;i<=6;i++){
          content.add(button=new JButton("newButton"+i));
          button.setFont(font[i%2]);
           button.setBorder(edge);
        
        }
    
    }
    
}
