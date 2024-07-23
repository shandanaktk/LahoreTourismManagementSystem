/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartcity.tourism.management.system;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class About extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    Font f, f1, f2;
    TextArea t1;
    String s;

    public About() {

        setLayout(null);
        JButton b1 = new JButton("Exit");
        add(b1);
        b1.setBounds(260, 430, 120, 20);
        b1.addActionListener(this);

        Font f = new Font("RALEWAY", Font.BOLD, 180);
        setFont(f);

         s =    " Welcome, Dear Users to Smart City Tourism Guide.                                    \n  "
                + "\nSmart City Tourism Management System is a GUI based product that is "
                + "used to store the details of ‘Lahore'. It provide services like viewing the best Hotels in  "
                + "Lahore and their Booking for tourists,and highlights some of the most beautiful places that "
                + "one must visit when in The City of Garden, Lahore.This service can be used by any person who is "
                + "having general knowledge about the internet.\n\n"
                + "All the users will be first consider as anonymous users later if he needs any service then he will be "
                + "treated as a registered user. This system provides a registration form for all who want to get the services\n\n"
                + "After signing in ,you will directly be directed to the main panel where you can view hotels,book them ,"
                + "look for destinations to visit and much more.\n"
                + "This Project has all the necessary functionality including updating users personal details and viewing"
                + "them later for confirmation.\n\n\n"
                + "TOOLS AND TECHNOLOGIES USED:\n"
                + "\nTechnology :-  Java"
                + "\nDatabase  :- Mysql"
                + "\nConcepts :- OOP core concepts including abstraction, Java Swing, JOptionPane etc.";
                
        

        
        
        
        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 625, 300);

        add(t1);

        Font f1 = new Font("RALEWAY", Font.BOLD, 16);
        t1.setFont(f1);

        Container contentPane = this.getContentPane();
         getContentPane().setBackground(Color.BLACK);
        t1 = new TextArea();

        JLabel l1 = new JLabel("About Project");
        add(l1);
        l1.setBounds(260, 10, 150, 80);

        l1.setForeground(new Color(190,90,40));

        Font f2 = new Font("RALEWAY", Font.BOLD, 20);
        l1.setFont(f2);

        setBounds(400, 100, 700, 550);

        setLayout(null);
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}
