
package MyProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {
    public static JMenuBar displaymenu(JFrame f) {
        JMenuBar menuBar=new JMenuBar();
        JMenu menu1=new JMenu("File");
        JMenuItem item1=new JMenuItem("Purchase");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new DEshBoard().setVisible(true);
          }
        });
        JMenuItem item2=new JMenuItem("sales");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Purchase().setVisible(true); 
               }
        });
        
        JMenuItem item3=new JMenuItem("Dash");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  f.setVisible(false);
                new SalesProduct().setVisible(true);
               }
        });
        JMenuItem item4=new JMenuItem("Exit");
        
        menuBar.add(menu1); 
        menu1.add(item1);
          menu1.add(item2);
            menu1.add(item3);
              menu1.add(item4);
        return menuBar;
    }
}
