
package Page845;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

public class SKetchFrame extends JFrame{
    public SKetchFrame(String title){
    setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setJMenuBar(menuBar);
        JMenu fileMenu=new JMenu("File");
        JMenu elementMenu=new JMenu("Elements");
        JMenu helMenu=new JMenu("Help");
        menuBar.add(fileMenu);
        menuBar.add(elementMenu);
          menuBar.add(helMenu);
    }
    private JMenuBar menuBar=new JMenuBar();
}
