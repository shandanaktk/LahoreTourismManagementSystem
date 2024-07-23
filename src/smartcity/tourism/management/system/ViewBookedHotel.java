/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartcity.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewBookedHotel extends JFrame implements ActionListener{
    JButton back ;
    ViewBookedHotel(String username) throws SQLException {
        setBounds(10,10,400,700);
        getContentPane().setBackground(new Color(190,90,40));
        setLayout(null);
        
        JLabel text = new JLabel("BOOKED HOTEL");
        text.setFont(new Font ("Algerian" , Font.BOLD,24));
        text.setBounds(100,10,400,40);
        add(text);
        
        //---------------------
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(30,50,150,25);
        lblusername.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblusername);
        
        JLabel labelusername = new JLabel("Username");
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
       
        //----------------
        
        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(30,90,150,25);
        lblId.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblId);
        
        JLabel labelid = new JLabel("ID");
        labelid.setBounds(220,90,150,25);
        add(labelid);
        
        //----------------------
        
        JLabel lblpackage = new JLabel("Package: ");
        lblpackage.setBounds(30,130,150, 25);
        lblpackage.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblpackage);
        
        JLabel labelpackage = new JLabel("Package");
        labelpackage.setBounds(220,130,150,25);
        add(labelpackage);
        
        //-----------------------
        
        JLabel lblnumber = new JLabel("Number: ");
        lblnumber.setBounds(30,170,150,25);
        lblnumber.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblnumber);
        
        JLabel labelnumber= new JLabel("Number");
        labelnumber.setBounds(220,170,150,25);
        add(labelnumber);
        
        //-------------------------
        
        JLabel lblpersons = new JLabel("Persons: ");
        lblpersons.setFont(new Font ("Tahoma" , Font.BOLD,15));
        lblpersons.setBounds(30,210,150,25);
        add(lblpersons);
        
        JLabel labelpersons = new JLabel("Persons");
        labelpersons.setBounds(220,210,150,25);
        add(labelpersons);
        
        //-------------------------
        
        JLabel lbldays = new JLabel("Total days:");
        lbldays.setBounds(30,250,150,25);
        lbldays.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lbldays);
        
        JLabel labeldays = new JLabel("Days");
        labeldays.setBounds(220,250,150,25);
        add(labeldays);
        
        //-------------------------
        
        JLabel lblac = new JLabel("AC/NON-AC:");
        lblac.setBounds(30,290,150,25);
        lblac.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblac);
        
        JLabel labelac = new JLabel("AC");
        labelac.setBounds(220,290,150,25);
        add(labelac);
        
        //--------------------------
        
        JLabel lblfood = new JLabel("Food Included: ");
        lblfood.setBounds(30,330,150,25);
        lblfood.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblfood);
        
        JLabel labelfood = new JLabel("Food");
        labelfood.setBounds(220,330,150,25);
        add(labelfood);
        
        //-------------------------
        
        JLabel lblname = new JLabel("Name: ");
        lblname.setBounds(30,370,150,25);
        lblname.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblname);
        
        JLabel labelname= new JLabel("Name");
        labelname.setBounds(220,370,150,25);
        add(labelname);
        
        //------------------------
        
        JLabel lblgender = new JLabel("Gender:");
        lblgender.setBounds(30,410,150,25);
        lblgender.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblgender);
        
        JLabel labelgender= new JLabel("Gender");
        labelgender.setBounds(220,410,150,25);
        add(labelgender);
        
        //--------------------
        
        JLabel lblcountry = new JLabel("Country:");
        lblcountry.setBounds(30,450,150,25);
        lblcountry.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblcountry); 
        
        JLabel labelcountry= new JLabel("Country");
        labelcountry.setBounds(220,450,150,25);
        add(labelcountry);
        
        //------------------
        
        JLabel lblphone = new JLabel("Phone:");
        lblphone.setBounds(30,490,150,25);
        lblphone.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblphone);
        
        JLabel labelphone= new JLabel("Phone");
        labelphone.setBounds(220,490,150,25);
        add(labelphone);
        
        //------------------
        
        JLabel lbladdress = new JLabel("Address:");
        lbladdress.setBounds(30,530,150,25);
        lbladdress.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lbladdress);
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(220,530,150,25);
        add(labeladdress);
        
        //------------------
        
        JLabel lblprice = new JLabel("Price:");
        lblprice.setBounds(30,570,150,25);
        lblprice.setFont(new Font ("Tahoma" , Font.BOLD,15));
        add(lblprice);
        
        JLabel labelprice = new JLabel("Price");
        labelprice.setBounds(220,570,150,25);
        add(labelprice);
        
        //------------------
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(130,600,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/BOOKHotels.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(450,20,500,400);
        add (image);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username = '"+username+"'");
            
            if(rs.next()){
                labelusername.setText(rs.getString(1));
                labelpackage.setText(rs.getString(2));
                labelid.setText(rs.getString(7));
                labelnumber.setText(rs.getString(8));
                labelprice.setText(rs.getString(10));
                labelphone.setText(rs.getString(9));
                labelpersons.setText(rs.getString(3));
                labelfood.setText(rs.getString(6));
                labelac.setText(rs.getString(5));
                labeldays.setText(rs.getString(4));
            }
                 
        }
        catch(Exception e){
            
        }
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    
    }
    
    public static void main(String[] args){
        new ViewBookedHotel ("");
    }
}

