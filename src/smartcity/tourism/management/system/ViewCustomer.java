package smartcity.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class ViewCustomer extends JFrame implements ActionListener{
    JButton back;
    ViewCustomer(String username)throws SQLException {
        
//        JOptionPane.showMessageDialog(null,"hi the username is " + username);
        
        setBounds(10,10,870,620);
         getContentPane().setBackground(new Color(190,90,40));
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);
        
        JTextField labelusername = new JTextField();
        labelusername.setBounds(220,50,150,25);
        add(labelusername);
        
        JLabel lblid = new JLabel("Id");
        lblid.setBounds(30,110,150,25);
        add(lblid);
        
        JTextField labelid = new JTextField();
        labelid.setBounds(220,110,150,25);
        add(labelid);
        
        JLabel lblnum = new JLabel("Number");
        lblnum.setBounds(30,170,150,25);
        add(lblnum);
        
        JTextField labelnum = new JTextField();
        labelnum.setBounds(220,170,150,25);
        add(labelnum);
        
        JLabel lblname = new JLabel("Name");
        lblname.setBounds(30,230,150,25);
        add(lblname);
        
        JTextField labelname = new JTextField();
        labelname.setBounds(220,230,150,25);
        add(labelname);
        
        JLabel lblgender = new JLabel("Gender");
        lblgender.setBounds(30,290,150,25);
        add(lblgender);
        
        JTextField labelgender = new JTextField();
        labelgender.setBounds(220,290,150,25);
        add(labelgender);
        
        JLabel lblcountry = new JLabel("Country");
        lblcountry .setBounds(500,50,150,25);
        add(lblcountry );
        
        JTextField labelcountry = new JTextField();
        labelcountry.setBounds(690,50,150,25);
        add(labelcountry);
        
        JLabel lbladdres = new JLabel("Address");
        lbladdres.setBounds(500,110,150,25);
        add(lbladdres);
        
        JTextField labeladdress = new JTextField();
        labeladdress.setBounds(690,110,150,25);
        add(labeladdress);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setBounds(500,170,150,25);
        add(lblphone);
        
        JTextField labelphone = new JTextField();
        labelphone.setBounds(690,170,150,25);
        add(labelphone);
        
        JLabel lblemail = new JLabel("Email");
        lblemail.setBounds(500,230,150,25);
        add(lblemail);
        
        JTextField labelemail = new JTextField();
        labelemail.setBounds(690,230,150,25);
        add(labelemail);
        
        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(350,350,100,25);
        back.addActionListener(this);
        add(back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,400,600,200);
        add (image);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(600,400,600,200);
        add (image2);
        
         try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    if(rs.next()){
                        labelusername.setText(rs.getString(1));  
                        labelid.setText(rs.getString(2));
                        labelnum.setText(rs.getString(3));  
                        labelname.setText(rs.getString(4));
                        labelgender.setText(rs.getString(5));  
                        labelcountry.setText(rs.getString(6));
                        labeladdress.setText(rs.getString(7));  
                        labelphone.setText(rs.getString(8));
                        labelemail.setText(rs.getString(9));
                    }
                }catch(Exception e){ }
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    
    public static void main(String[] args){
        new ViewCustomer("");
    }
}

