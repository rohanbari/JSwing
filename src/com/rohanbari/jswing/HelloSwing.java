package com.rohanbari.jswing;

import javax.swing.*;

public class HelloSwing extends JFrame {

    public HelloSwing() {
        this.setTitle("Welcome to JSwing");
        this.setSize(250, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new HelloSwing();
    }
}
