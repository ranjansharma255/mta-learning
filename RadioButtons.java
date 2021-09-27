package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtons {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}
class Demo extends JFrame implements ItemListener, ActionListener {
    JTextField t1;
    JButton b;
    JRadioButton r1, r2;
    JLabel l;
    JCheckBox c1, c2;
    public void init() {
        setVisible(true);
        setSize(500,500);
        setTitle("Radio buttons Examples");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Demo() {
        t1 = new JTextField(15);
        b = new JButton("Ok");
        r1 = new JRadioButton("Female");
        r2 = new JRadioButton("Male");
        l = new JLabel("Greeting");
        c1 = new JCheckBox("Java");
        c2 = new JCheckBox("Python");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        add(t1);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);
        b.addActionListener(this);
        c1.addItemListener(this);
        init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = t1.getText();
        String language;
        if(r2.isSelected()) {
            name = "Mr. " + name;
        } else {
            name = "Ms. " + name;
        }
        if(c1.isSelected()) {
            language = "Java";
        } else {
            language = "Python";
        }
        l.setText(name + " selected Language " + language);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
