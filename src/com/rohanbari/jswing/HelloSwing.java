package com.rohanbari.jswing;

import javax.swing.*;

public class HelloSwing extends JFrame {

    public HelloSwing() {
        JPanel panel = new JPanel();
        JButton button = new JButton("Click Me");

        // Most fundamental UI configuration
        this.setTitle("Welcome to JSwing");
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        // Adding ActionListener event to JButton
        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,
                    "You can write a better code here to contribute!",
                    "First Step Taken!",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Closes after displaying the message
        });

        panel.add(button);
        this.add(panel);
    }

    public static void main(String[] args) {
        new HelloSwing();
    }
}
