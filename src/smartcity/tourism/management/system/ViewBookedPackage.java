package smartcity.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class ViewBookedPackage extends JFrame implements ActionListener {
    JButton back ;
    ViewBookedPackage(String username) throws SQLException {
        setBounds(200,200,900,450);
        getContentPane().setBackground(new Color(190,90,40));
        setLayout(null);
       

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,450,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,450);
        add (image);
        
        JLabel text = new JLabel("View Booked Package Details");
        text.setFont(new Font ("Tahoma" , Font.BOLD,20));
        text.setForeground(Color.BLACK);
        text.setBounds(60,0,300,30);
        image.add(text);
        
        //-------------
        
        JLabel lblusername = new JLabel("Username:");
        lblusername.setBounds(30,50,150,25);
        lblusername.setForeground(Color.BLACK);
        lblusername.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblusername);
        
        JTextField tfusername = new JTextField (" ");
        tfusername.setBounds(220,50,150,25);
        image.add(tfusername);
        
        //------------------
        
        JLabel lblpackage = new JLabel("Package:");
        lblpackage.setBounds(30,90,150,25);
        lblpackage.setForeground(Color.BLACK);
        lblpackage.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblpackage);
        
        JTextField tfpackage = new JTextField ("");
        tfpackage.setBounds(220,90,150,25);
        image.add(tfpackage);
        
        //--------------------
        
        JLabel lblpersons = new JLabel("Persons:");
        lblpersons.setBounds(30,130,150,25);
        lblpersons.setForeground(Color.BLACK);
        lblpersons.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblpersons);
        
        JTextField  tfpersons = new JTextField("Persons");
        tfpersons.setBounds(220,130,150,25);
        image.add(tfpersons);
        
        //------------------
        
        JLabel lblId = new JLabel("Id:");
        lblId.setBounds(30,170,150,25);
        lblId.setForeground(Color.BLACK);
        lblId.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblId);
        
        JTextField  tfId = new JTextField ("Id");
        tfId.setBounds(220,170,150,25);
        image.add(tfId);
        
        //------------------
        
        JLabel lblnumber = new JLabel("Number:");
        lblnumber.setBounds(30,210,150,25);
        lblnumber.setForeground(Color.BLACK);
        lblnumber.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblnumber);
        
        JTextField  tfnumber = new JTextField ("Number");
        tfnumber.setBounds(220,210,150,25);
        image.add(tfnumber);
        
        //------------------
        
        JLabel lblphone = new JLabel("Phone:");
        lblphone.setBounds(30,250,150,25);
        lblphone.setForeground(Color.BLACK);
        lblphone.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblphone);
        
        JTextField  tfphone = new JTextField ("Phone");
        tfphone.setBounds(220,250,150,25);
        image.add(tfphone);
        
        //------------------
        
        JLabel lblprice = new JLabel("Price:");
        lblprice.setBounds(30,290,150,25);
        lblprice.setForeground(Color.BLACK);
        lblprice.setFont(new Font ("Tahoma" , Font.BOLD,15));
        image.add(lblprice);
        
        JTextField  tfprice = new JTextField ("Price");
        tfprice.setBounds(220,290,150,25);
        image.add(tfprice);
        
        //------------------  
       
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(190,90,40));
        back.setBounds(100,360,100,25);
        back.addActionListener((ActionListener) this);
        image.add(back);
        
        try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from bookpackage where username = '"+username+"'");
                    if(rs.next()){
                tfusername.setText(rs.getString(1));
                tfpackage.setText(rs.getString(2));
                tfpersons.setText(rs.getString(3));
                tfId.setText(rs.getString(4));
                tfnumber.setText(rs.getString(5));
                tfphone.setText(rs.getString(6));
                tfprice.setText(rs.getString(7));
                
                    }
                }catch(Exception e){ }
		
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new ViewBookedPackage("");
    }
}
