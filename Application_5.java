package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application_5 {
    public static void main(String[] args) {
        Call c = new Call();
    }
}
class Call extends JFrame implements ActionListener {
    JProgressBar p;
    Timer t;
    int i = 0;
    public void init() {
        setVisible(true);
        setSize(500,500);
        setTitle("Application 5");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Call() {
        JButton b = new JButton("Add Form");
        p = new JProgressBar(0,20);
        t = new Timer(300, this);
        add(b);
        add(p);
        b.addActionListener(this);
        init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        t.start();
        if( i == 20) {
            new Addition();
        }
        i++;
        p.setValue(i);
    }
}