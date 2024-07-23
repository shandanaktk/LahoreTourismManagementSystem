package smartcity.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class BookPackage extends JFrame implements ActionListener {

    Choice cpackage;
    JTextField tfpersons, labelusername, labelId, labelnumber, labelphone, labelprice;
    JButton BookPackage, CheckPrice, Back;
    String username;

    BookPackage(String username)  {

        this.username = username;
        setBounds(50, 100, 1100, 500);
        setLayout(null);        getContentPane().setBackground(new Color(190,90,40));


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1100, 500);
        add(image);
        
        JLabel text = new JLabel("Book Package");
        text.setFont(new Font("Tahoma", Font.BOLD, 20));
        text.setBounds(100, 10, 200, 30);
        text.setForeground(Color.BLACK);
        image.add(text);

        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblusername.setBounds(40, 70, 100, 20);
        lblusername.setForeground(Color.BLACK);
        image.add(lblusername);

        labelusername = new JTextField();
        labelusername.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelusername.setBounds(250, 70, 200, 20);
        image.add(labelusername);

        JLabel lblpackage = new JLabel("Select Package");
        lblpackage.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblpackage.setBounds(40, 110, 150, 20);
        lblpackage.setForeground(Color.BLACK);
        image.add(lblpackage);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(250, 110, 200, 20);
        image.add(cpackage);

        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblid.setBounds(40, 150, 150, 25);
        lblid.setForeground(Color.BLACK);
        image.add(lblid);

        labelId = new JTextField();
        labelId.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelId.setBounds(250, 150, 200, 25);
        image.add(labelId);

        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblnumber.setBounds(40, 190, 150, 25);
        lblnumber.setForeground(Color.BLACK);
        image.add(lblnumber);

        labelnumber = new JTextField();
        labelnumber.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelnumber.setBounds(250, 190, 200, 25);
        image.add(labelnumber);

        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblphone.setBounds(40, 230, 150, 25);
        lblphone.setForeground(Color.BLACK);
        image.add(lblphone);

        labelphone = new JTextField();
        labelphone.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelphone.setBounds(250, 230, 200, 25);
        image.add(labelphone);

        JLabel lblpersons = new JLabel("Total persons");
        lblpersons.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblpersons.setBounds(40, 270, 150, 25);
        lblpersons.setForeground(Color.BLACK);
        image.add(lblpersons);

        tfpersons = new JTextField("1");
        tfpersons.setBounds(250, 270, 200, 25);
        image.add(tfpersons);

        JLabel lbltotal = new JLabel("Total price");
        lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbltotal.setBounds(40, 310, 150, 25);
        lbltotal.setForeground(Color.BLACK);
        image.add(lbltotal);

        labelprice = new JTextField();
        labelprice.setFont(new Font("Tahoma", Font.PLAIN, 16));
        labelprice.setBounds(250, 310, 200, 25);
        image.add(labelprice);

        try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    if(rs.next()){
                        labelusername.setText(rs.getString(1));
                labelId.setText(rs.getString(2));
                labelnumber.setText(rs.getString(3));
                labelphone.setText(rs.getString(8));
                
                    }
                }catch(Exception e){ }
        
        CheckPrice = new JButton("Check Price");
        CheckPrice.setBackground(Color.BLACK);
        CheckPrice.setForeground(new Color(190,90,40));
        CheckPrice.setBounds(60, 380, 120, 25);
        CheckPrice.addActionListener(this);
        image.add(CheckPrice);

        BookPackage = new JButton("Book Package");
        BookPackage.setBackground(Color.BLACK);
        BookPackage.setForeground(new Color(190,90,40));
        BookPackage.setBounds(200, 380, 120, 25);
        BookPackage.addActionListener(this);
        image.add(BookPackage);

        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(new Color(190,90,40));
        Back.setBounds(340, 380, 100, 25);
        Back.addActionListener(this);
        image.add(Back);

        setVisible(true);
    }

     public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == CheckPrice){
            String pack = cpackage.getSelectedItem();
            int cost =0;
            
            if(pack.equals("Gold Package")){
                cost += 20000;
            }else if(pack.equals("Silver Package")){
                cost += 12000;
            }else{
                cost += 8000;
            }
            int persons = Integer.parseInt(tfpersons.getText());
            cost *= persons;
            labelprice.setText("Rs." + cost);
        }
        
     else if(ae.getSource()== BookPackage){
        try{
            Conn c = new Conn();
            c.s.executeUpdate("insert into bookpackage values ('" + labelusername.getText() + "' , '" + cpackage.getSelectedItem()+ "'  , '" + tfpersons.getText() + "'  ,  '" + labelId.getText() + "'  ,  '" + labelnumber.getText() + "'  ,  '" + labelphone.getText() + "'  ,  '" + labelprice.getText() + "  ')" );
            JOptionPane.showMessageDialog(null, "Package Booked Successfully");
            setVisible(false);
        }
        catch(Exception e){
            e.printStackTrace();
        }
     }
     else{
        setVisible(false);
     }       
    }

    public static void main(String[] args) {
        new BookPackage("");
    }
}
