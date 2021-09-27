package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class FriendshipCalculator {
    public static void main(String[] args) {
        Calculator c = new Calculator();
    }
}

class Calculator extends JFrame implements ActionListener {
    JTextField t1,t2;
    JButton b;
    JLabel l,text;

    public Calculator() {
        t1 =  new JTextField(20);
        t2 =  new JTextField(20);
        l = new JLabel("FriendShip Calculator");
        b = new JButton("Calculate");
        text = new JLabel("");
        add(l);
        add(t1);
        add(t2);
        add(b);
        add(text);
        b.addActionListener(this);
        setVisible(true);
        setSize(600,500);
        setTitle("Addition");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        String name1 = t1.getText();
        String name2 = t2.getText();
        Random ran = new Random();
        int num = ran.nextInt(100);
        text.setText("Friendship Percentage between " + name1 + " and "+ name2 +" is " + num + "%");
    }
}
