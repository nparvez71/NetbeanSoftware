package NewExample;

import javax.swing.*;
public class TryMenue extends JFrame {
    JMenuBar menuBar;
    JMenu menu1, menu2,subMenu;
    
    JMenuItem item1, item2, item3,h1,h2;
    TryMenue() {
        JFrame f = new JFrame("TryMenue");
        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        menu1.add(new JMenuItem("New"));
       menu1.addSeparator();
       menu1.add(new JMenuItem("Open"));
       menu1.addSeparator();
       menu1.add(new JMenuItem("Exit"));
        menu2 = new JMenu("Help");
        subMenu=new JMenu("subMenu");
        h1=new JMenuItem("new");
          h2=new JMenuItem("old");
          subMenu.add(h1);
          subMenu.add(h2);
        menu2.add(subMenu );
        
        menuBar.add(menu1);
        menuBar.add(menu2);
        f.setJMenuBar(menuBar);
        f.setSize(500, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setSize(500, 400);
        // setLayout(null);
        // setVisible(true);
    }

    public static void main(String[] args) {
        new TryMenue();
    }
}
