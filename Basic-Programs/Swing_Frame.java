package javabasics;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JApplet;

public class Swing_Frame implements ActionListener
{
    JFrame f1;
    JButton b1;
    JTextField t1;
    JLabel l1;
    Swing_Frame()
    {
        f1 = new JFrame("Hello");
        
        b1 = new JButton("click here");
        t1 = new JTextField();
        l1 = new JLabel("Hello");
        f1.setLayout(null);
        f1.setSize(500, 500);
        b1.setBounds(20, 20, 100, 100);
        t1.setBounds(20, 130, 50, 50);
        l1.setBounds(20, 200, 70, 70);
        b1.addActionListener(this);
        f1.add(b1);
        f1.add(t1);
        f1.add(l1);
        
        f1.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == b1)
            new abc();
        
    }
    public static void main(String[] args) 
    {
        new Swing_Frame();
        
        
    }
}

class abc
{
    JFrame f1;
    JButton b1;
    JTextField t1;
    JLabel l1;
    abc()
    {
        f1 = new JFrame("ABC");
        
        b1 = new JButton("click here");
        t1 = new JTextField();
        l1 = new JLabel("ABC");
        f1.setLayout(null);
        f1.setSize(500, 500);
        b1.setBounds(20, 20, 100, 100);
        t1.setBounds(20, 130, 50, 50);
        l1.setBounds(20, 200, 70, 70);
        
        f1.add(b1);
        f1.add(t1);
        f1.add(l1);
        
        f1.setVisible(true);
        
    }
    
}