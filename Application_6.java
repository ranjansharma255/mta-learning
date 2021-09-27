package com.company;

import javax.swing.*;
import java.awt.*;

public class Application_6 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setTitle("Application_6");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel p = new JPanel(new GridBagLayout());

        JButton b1 = new JButton ("Hello");
        JButton b2 = new JButton ("Hello");

        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.gridx = 0;
        c.gridy = 1;
        p.add(b1, c);
        c.gridx = 0;
        c.gridy = 2;
        p.add(b2, c);

        f.add(p);

    }
}
