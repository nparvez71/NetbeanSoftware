package com.google.focusevent;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class windowFocusEvent {

    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public windowFocusEvent() {
        prepareGUI();

    }

    public static void main(String[] args) {
      windowFocusEvent swinglistenerDemo = new windowFocusEvent();
         swinglistenerDemo.showFocusListenerDemo();
       //  new windowFocusEvent().showFocusListenerDemo();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("java swing example");
        mainFrame.setSize(400, 500);
        mainFrame.setLayout(new GridLayout(3, 1));
        
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 150);
        
        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }

        });
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());
        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);

    }
    private void showFocusListenerDemo(){
    headerLabel.setText("Listener in action:FocusListener");
        JButton okButton=new JButton("ok");
           JButton cancelButton=new JButton("cancel");
           okButton.addFocusListener(new CustomFocusListener());
           cancelButton.addFocusListener(new CustomFocusListener());
           
           controlPanel.add(okButton);
           controlPanel.add(cancelButton);
           mainFrame.setVisible(true);
    }
    class CustomFocusListener implements FocusListener{

        @Override
        public void focusGained(FocusEvent e) {
            statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+"gained focus");
           }

        @Override
        public void focusLost(FocusEvent e) {
             statusLabel.setText(statusLabel.getText()+e.getComponent().getClass().getSimpleName()+"lost focus");
            }
    
    
    }
}
