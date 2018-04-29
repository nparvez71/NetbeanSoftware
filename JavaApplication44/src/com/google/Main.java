/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Main {

    Main() {
        JFrame frame = new JFrame("JToolBar Demo");
        JToolBar toolbar = new JToolBar("Application");
        JButton btnCalender = new JButton(new ImageIcon(getClass().getResource("/com/google/image/Blue.gif")));

        JButton btnCloock = new JButton(new ImageIcon(getClass().getResource("/com/google/image/Red.gif")));
        JButton btnconstant = new JButton(new ImageIcon(getClass().getResource("/com/google/image/Line.gif")));
        JButton btnMail=new JButton(new ImageIcon(getClass().getResource("/com/google/image/New.gif")));
        JButton btnMessage=new JButton(new ImageIcon(getClass().getResource("/com/google/image/Open.gif")));
        toolbar.add(btnCalender);
        toolbar.add(btnCloock);
        toolbar.add(btnconstant);
        toolbar.add(btnMail);
        toolbar.add(btnMessage);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().add(toolbar,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
           frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Main();
    }

}
