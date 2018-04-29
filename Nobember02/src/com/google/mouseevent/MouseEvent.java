
package com.google.mouseevent;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class MouseEvent extends JFrame implements MouseListener{
    
    Label l;
    MouseEvent(){
    addMouseListener(this);
    l=new Label();
    l.setBounds(20, 50, 100, 20);
    add(l);
        setSize(300, 450);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
       l.setText("Mouse clicked");
       }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
           l.setText("Mouse pressed");
      }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
           l.setText("Mouse Relesed");
       }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
           l.setText("Mouse Entered");
     }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
           l.setText("Mouse Exied");
      }
    public static void main(String[] args) {
        new MouseEvent();
    }
}
