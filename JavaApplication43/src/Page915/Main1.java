
package Page915;

 import java.awt.*;
   import javax.swing.*;
   import java.awt.event.*;
   import java.net.URL;
   import javax.swing.JDesktopPane;
   import javax.swing.JFrame;
   import javax.swing.JInternalFrame;
   import javax.swing.JMenu;
   import javax.swing.JMenuBar;
   import javax.swing.JMenuItem;
   import javax.swing.JOptionPane;
   import javax.swing.SwingUtilities;

   public class Main1 extends JFrame{

   JDesktopPane jdpDesktop;


   public Main1() {

       JFrame frame = new JFrame("MainForm");

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jdpDesktop = new JDesktopPane() {
           @Override
           public Dimension getPreferredSize() {
               return new Dimension(600, 600);
           }
       }; 

       createFrame();

       frame.setContentPane(jdpDesktop);

       frame.setJMenuBar(createMenuBar());
        frame.pack();
       frame.setVisible(true);
   }

    JMenuBar createMenuBar() {
       JMenuBar menuBar = new JMenuBar();
          JMenu menu = new JMenu("Settings");
       JMenuItem menuItem = new JMenuItem("Logout");
       menuItem.setMnemonic(KeyEvent.VK_N);
       menuItem.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                       null,
                       "Thank You",
                       "Logout", JOptionPane.PLAIN_MESSAGE
                       );
           }
       }); 
       menu.add(menuItem);
       menuBar.add(menu);
       return menuBar;
   }

   protected void createFrame() {
       MyInternalFrame frame = new MyInternalFrame();
       frame.setVisible(true); jdpDesktop.add(frame);

   }

   class MyInternalFrame extends JInternalFrame {

       static final int xPosition = 150, yPosition = 140;

       public MyInternalFrame() {
           super("Calculator" ,  true,
                   true, 
                   true, 
                   true);
           setSize(300, 300);
           // Set the window's location.
           setLocation(xPosition , yPosition
                   );

       setLayout(null);
       getContentPane().setBackground(Color.white);

       }   
   }
    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new Main1();
           }
       });
   } }