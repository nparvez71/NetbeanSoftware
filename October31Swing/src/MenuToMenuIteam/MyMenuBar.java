package MenuToMenuIteam;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyMenuBar {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Help");
        JMenu menu3 = new JMenu("Open");
        JMenuItem item3=new JMenuItem("abc");
        JMenuItem item1 = new JMenuItem("New");
        JMenuItem item2 = new JMenuItem("File New");
        
        menu1.add(item1);
        menu1.add(menu3);
        menu3.add(item3);
        menuBar.add(menu1);
        menuBar.add(menu2);
        
        frame.add(menuBar);
        //design//
        frame.setJMenuBar(menuBar);
        frame.setSize(400, 500);
        frame.setVisible(true);
 
    }
    
}
