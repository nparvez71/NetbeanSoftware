
package TryMenu30;

import javax.swing.JFrame;
import javax.swing.*;

public class MenuCreating extends JFrame{
    JMenuBar mb=new JMenuBar();
    
    JMenu file=new JMenu("file");
      JMenu help=new JMenu("help");
    MenuCreating(){
    JFrame f=new JFrame("NEW WINDOW");
    f.setJMenuBar(mb);
    mb.add(file);
     mb.add(help);
    f.setLayout(null);
    f.setSize(200, 300);
    f.setVisible(true);
    f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new  MenuCreating();
    }
    
}
