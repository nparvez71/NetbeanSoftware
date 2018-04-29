
package Another;

import java.awt.event.InputEvent;
import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import javax.swing.JFrame;
import javax.swing.*;

public class Trymakinmenu extends  JFrame{
    JMenu menu1,exit;
    JMenuItem item1,item2;
    Trymakinmenu(){
    JFrame f=new JFrame("try menu");
    JMenuBar md=new JMenuBar();
    menu1=new JMenu("File");
    item1=new JMenuItem("Exit");
    item1.setAccelerator(KeyStroke.getKeyStroke('E',CTRL_DOWN_MASK));
    menu1.add(item1);
    exit=new JMenu("Exit");
    md.add(menu1);
    md.add(exit);
    f.setJMenuBar(md);
    f.setSize(400, 600);
    f.setLayout(null);
    f.setVisible(true);
            }
    public static void main(String[] args) {
        new Trymakinmenu();
    }
}
