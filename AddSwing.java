package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSwing {
    public static void main(String[] args) {
        Addition a = new Addition();
    }
}

class Addition extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton addt, sub, mul, div,mod;
    JLabel l;

    public Addition() {
        t1 =  new JTextField(20);
        t2 =  new JTextField(20);
        addt = new JButton("Add");
        sub = new JButton("Sub");
        mul = new JButton("Mul");
        div = new JButton("Div");
        mod = new JButton("mod");
        l = new JLabel("Result");
        add(t1);
        add(t2);
        add(addt);
        add(sub);
        add(mul);
        add(div);
        add(mod);
        add(l);
        addt.addActionListener(this); //Action Listener is an Interface
        sub.addActionListener(this); //Action Listener is an Interface
        mul.addActionListener(this); //Action Listener is an Interface
        div.addActionListener(this); //Action Listener is an Interface
        mod.addActionListener(this); //Action Listener is an Interface

        setVisible(true);
        setSize(500,500);
        setTitle("Addition");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int value = 0;
        String s = ae.getActionCommand();
        if(s.equals("Add")){
            value = n1 + n2;
        } else if(s.equals("Sub")){
            value = n1 - n2;
        } else if(s.equals("Mul")){
            value = n1 * n2;
        } else if(s.equals("Div")){
            value = n1 / n2;
        } else {
            value = n1 % n2;
        }
        l.setText(" "+ value);
    }
}
