package com.rohanbari.jswing;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Various kinds of stuffs related to JTextField and other
 * user-input accepting classes.
 */
public class TextFieldDemo extends JFrame implements KeyListener {

    JPanel jPanel;
    JTextField textField;

    public TextFieldDemo() {
        jPanel = new JPanel();
        textField = new JTextField(20);

        this.setTitle("Various TextField Examples");
        this.setSize(350, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        textField.setToolTipText("Enter your email here to proceed");
        textField.addKeyListener(this);

        jPanel.add(textField);

        this.add(jPanel);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TextFieldDemo();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() != KeyEvent.VK_ENTER) {
            return;
        }

        if (!"rohanbari4@gmail.com".equals(textField.getText())) {
            JOptionPane.showMessageDialog(this, "Incorrect credentials.");
            return;
        }

        if (JOptionPane.showConfirmDialog(this,
                "Welcome back Rohan! Are you sure you want to sign in?",
                "Welcome Confirmation",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.out.println("You're done!");
        } else {
            System.out.println("Sign In was canceled.");
        }

        System.exit(0);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
