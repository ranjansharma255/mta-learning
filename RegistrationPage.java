package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RegistrationPage {
    public static void main(String[] args) {
        Page p = new Page();
    }
}
class Page extends JFrame implements ActionListener, ItemListener {
    JLabel heading, username, number;
    JTextField name, roll_no;
    JCheckBox a, b, c, d;
    JLabel dname,droll, courses;
    JButton click;
    public void init() {
        setVisible(true);
        setSize(500,500);
        setTitle("Radio buttons Examples");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Page() {
        heading = new JLabel("Registration Form");
        username = new JLabel("Enter your name");
        number = new JLabel("Enter your roll number");
        name = new JTextField(20);
        roll_no = new JTextField(20);
        a = new JCheckBox("Java");
        b = new JCheckBox("Python");
        c = new JCheckBox("JavaScript");
        d = new JCheckBox("Databases");
        click = new JButton("Submit");
        courses = new JLabel();
        dname = new JLabel();
        droll = new JLabel();
        add(heading);
        add(username);
        add(name);
        add(number);
        add(roll_no);
        add(a);
        add(b);
        add(c);
        add(d);
        add(click);
        add(dname);
        add(droll);
        add(courses);
        click.addActionListener(this);
        init();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String n = name.getText();
        String r = roll_no.getText();
        dname.setText("Name : " + n);
        droll.setText("Roll : " + r);
        String text = "Selected Courses are  ";
        if(a.isSelected()) {
            text += " Java ";
        }
        if(b.isSelected()) {
            text += " Python ";
        }
        if(c.isSelected()) {
            text += " JavaScript ";
        }
        if(d.isSelected()) {
            text += " Databases ";
        }
        courses.setText(" " + text);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
