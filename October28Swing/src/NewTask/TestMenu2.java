package NewTask;

import static java.awt.event.InputEvent.CTRL_DOWN_MASK;
import javax.swing.*;

public class TestMenu2 extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu1, menu2, menu3, menu4;
    private JMenuItem item1, item2, item3, item4, item5;

    public TestMenu2() {
    method();
    }

    
    public void method(){
        setLayout(null);
        setSize(600, 300);
        menuBar = new JMenuBar();
        menu1 = new JMenu("File");
        menu2 = new JMenu("New");
        menu1.add(item1);
        menu1.addSeparator();
        menu3 = new JMenu("open");
        item3 = new JMenuItem("From Computer");
        menu3.add(item3);
        item4 = new JMenuItem("From remote");
        menu3.add(item4);
        item5 = new JMenuItem("Exit");
        menu1.add(item2);
        menu2 = new JMenu("Help");
        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);
        menu1.setMnemonic('f');
        menu2.setMnemonic('h');
        menu3.setMnemonic('i');
        menu4.setMnemonic('s');
        item1.setAccelerator(KeyStroke.getKeyStroke('N', CTRL_DOWN_MASK));
        item2.setAccelerator(KeyStroke.getKeyStroke('N', CTRL_DOWN_MASK));
    }
        

    
    public static void main(String[] args) {
        new TestMenu2();
    }
}
