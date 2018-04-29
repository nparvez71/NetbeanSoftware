package CreatingToolBar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Main {

    Main() {
        JFrame frame = new JFrame("JToolBar Demo");
        JToolBar toolbar = new JToolBar("Application");
        JButton btnCalender = new JButton(new ImageIcon(getClass().getResource("\"/constance/Blue.gif\"")));

        JButton btnCloock = new JButton(new ImageIcon(getClass().getResource("\"/constance/Green.gif\"")));
        JButton btnconstant = new JButton(new ImageIcon(getClass().getResource("\"/constance/Red.gif\"")));
        JButton btnMail=new JButton(new ImageIcon(getClass().getResource("\"/constance/Yellow.gif\"")));
        JButton btnMessage=new JButton(new ImageIcon(getClass().getResource("\"/constance/Blue.gif\"")));

    }

}
