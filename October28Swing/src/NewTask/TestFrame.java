package NewTask;

import javax.swing.*;


public class TestFrame extends JFrame{
    JMenuBar menuBar;
    JMenu menu1,menu2,menu3,menu4;
    JMenuItem item1,item2,item3,item4,item5;
    TestFrame(){
        JFrame f=new JFrame("Tryframe");
        menuBar=new JMenuBar();
        menu1=new JMenu("File");
        menu1.add(new JMenuItem("new"));
            menu1.add(new JMenuItem("open"));
      
          
          
                menu1.add(new JMenuItem("exit"));
        menu2=new JMenu("Help");
       
        menuBar.add(menu1);
         menuBar.add(menu2);
        
         f.setJMenuBar(menuBar);
      f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    
    }
     public static void main(String[] args) {
        new TestFrame();
        
    }
    
}
