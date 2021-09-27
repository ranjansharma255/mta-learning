package com.company;
import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        Abc a = new Abc();
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
//by default frame is card layout, so we need to change the layout.
class Abc extends JFrame {
    public Abc() {
        setLayout(new FlowLayout());
        add(new JLabel("Calculator"));
        setTitle("Frame");
        setVisible(true);
        setSize(400,400);
    }
}

