package com.google;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ToolTip {

    public ToolTip() {
        JFrame f = new JFrame();

        JLabel tooltipLabel = new JLabel("User_Name");
        tooltipLabel.setToolTipText("Enter your user_name");
        JTextField tooltiptextField = new JTextField(10);
        //(tex will show in pane like place holde)
        tooltiptextField.setText("Enter Userna......");
        tooltiptextField.setToolTipText("Enter your user name over here, that other things");
        JButton tooltipButton = new JButton("Click me");
        tooltipButton.setToolTipText("click this for show something");
        f.getContentPane().setLayout(new FlowLayout());
        f.add(tooltipLabel);
        f.add(tooltiptextField);
        f.add(tooltipButton);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        //(design window)
          f.setSize(400, 600);
    f.setLayout(null);
    }

    public static void main(String[] args) {
        new ToolTip();
    }

}
