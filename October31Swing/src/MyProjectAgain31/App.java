package MyProjectAgain31;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class App {

    public static JMenuBar display(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("File");
        JMenu menu2 = new JMenu("Help");
        JMenuItem item2 = new JMenuItem("Purchase");
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PurchaseProducct().setVisible(true);
            }
        });
        JMenuItem item3 = new JMenuItem("salesproduct");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesProduct().setVisible(true);
            }
        });
        JMenuItem item1 = new JMenuItem("Dasboard");
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Deshboard().setVisible(true);
            }
        });
        JMenuItem item4 = new JMenuItem("Exit");
        item4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }
        });

        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menuBar.add(menu1);
        menuBar.add(menu2);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return menuBar;
    }

}
