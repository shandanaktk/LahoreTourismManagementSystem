 package smartcity.tourism.management.system;
 
 import javax.swing.*;
 import java.awt.*;
 import java.awt.event.*;
 import java.sql.*;
 
public class BookHotel extends JFrame implements ActionListener {
    
    Choice chotel,cac, cfood;
    JTextField tfpersons,tfdays;
    JTextField labelusername , labelId , labelnumber ,labelphone, labelprice;
    JButton BookHotel , CheckPrice , Back;
    String username;
    
    BookHotel(String username)throws SQLException {
        
        this.username= username;
        setBounds(10,10, 600,620 );
//        setBackground(new Color(190,90,40));
        setLayout(null);
        getContentPane().setBackground(new Color(190,90,40));
        
        JLabel text = new JLabel ("Book Hotel");
        text.setFont(new Font ("Tahoma" , Font.BOLD,20));
        text.setBounds(200,10,200,30);
        add(text);
        
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        lblusername.setBounds(40,70,100,20);
        add(lblusername);
        
        labelusername = new JTextField();
        labelusername.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        labelusername.setBounds(250,70,200,20);
        add(labelusername);
        
        JLabel lblpackage = new JLabel("Select Hotel");
        lblpackage.setFont(new Font("Tahoma", Font.PLAIN,16)) ;
        lblpackage.setBounds(40,110,150,20);
        add(lblpackage);
        
        chotel = new Choice();
        chotel.setBounds(250,110,200,20);
        add(chotel);
        
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from hotel");
            while(rs.next()){
                chotel.add(rs.getString("name"));
                
            }
        
        }
        catch(Exception e){
            e.printStackTrace();
            
        }
        
        JLabel lblpersons = new JLabel("Total persons");
        lblpersons.setFont(new Font("Tahoma", Font.PLAIN,16)) ;
        lblpersons.setBounds(40,150,150,25);
        add(lblpersons);
        
        tfpersons = new JTextField("1");
        tfpersons.setBounds(250,150,200,25);
        add(tfpersons);
        
        JLabel lbldays = new JLabel("Number of days");
        lbldays.setFont(new Font("Tahoma", Font.PLAIN,16));
        lbldays.setBounds(40,190,150,25);
        add(lbldays);
        
        tfdays = new JTextField("1");
        tfdays.setBounds(250,190,200,25);
        add(tfdays);
        
        JLabel lblac = new JLabel("AC/Non-AC");
        lblac.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblac.setBounds(40,230,150,25);
        add(lblac);
        
        cac = new Choice();
        cac.add("AC");
        cac.add("Non-AC");
        cac.setBounds(250,230,200,20);
        add(cac);
        
        JLabel lblfood = new JLabel("Food Included");
        lblfood.setFont(new Font("Tahoma", Font.PLAIN,16));
        lblfood.setBounds(40,270,150,25);
        add(lblfood);
        
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(250,270,200,20);
        add(cfood);
        
        JLabel lblid = new JLabel("Id");
        lblid.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        lblid.setBounds(40,310,100,20);
        add(lblid);
        
        labelId = new JTextField();
        labelId.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        labelId.setBounds(250,310,200,20);
        add(labelId);
        
        JLabel lblnumber = new JLabel("Number");
        lblnumber.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        lblnumber.setBounds(40,350,100,20);
        add(lblnumber);
        
        labelnumber = new JTextField();
        labelnumber.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        labelnumber.setBounds(250,350,200,20);
        add(labelnumber);
        
        JLabel lblphone = new JLabel("Phone");
        lblphone.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        lblphone.setBounds(40,390,100,20);
        add(lblphone);
        
        labelphone = new JTextField();
        labelphone.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        labelphone.setBounds(250,390,200,20);
        add(labelphone);
        
        JLabel lbltotal = new JLabel("Total price");
        lbltotal.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        lbltotal.setBounds(40,430,100,20);
        add(lbltotal);
        
        labelprice = new JTextField();
        labelprice.setFont(new Font ("Tahoma" , Font.PLAIN,16));
        labelprice.setBounds(250,430,200,20);
        add(labelprice);
        
        try{
                    Conn c = new Conn();
                    ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
                    if(rs.next()){
                        labelusername.setText(rs.getString(1));  
                        labelId.setText(rs.getString(2));
                        labelphone.setText(rs.getString(8));  
                        labelnumber.setText(rs.getString(3));
                    }
                }catch(Exception e){ }
        
        CheckPrice = new JButton("Check Price");
        CheckPrice.setBackground(Color.BLACK);
        CheckPrice.setForeground(Color.WHITE);
        CheckPrice.setBounds(60,490,120,25);
        CheckPrice.addActionListener(this);
        add(CheckPrice);
        
        BookHotel = new JButton("Book Hotel");
        BookHotel.setBackground(Color.BLACK);
        BookHotel.setForeground(Color.WHITE);
        BookHotel.setBounds(200,490,120,25);
        BookHotel.addActionListener(this);
        add(BookHotel);
        
        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(Color.WHITE);
        Back.setBounds(350,490,120,25);
        Back.addActionListener(this);
        add(Back);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/BOOKHotels.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500,50,600,300);
        add (image);
        
        setVisible(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == CheckPrice){
        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("Select * from hotel where name = '"+ chotel.getSelectedItem()+"'"); 
            
            while(rs.next()){
                int cost = Integer.parseInt(rs.getString("costperperson"));
                int food = Integer.parseInt(rs.getString("foodincluded"));
                int ac = Integer.parseInt(rs.getString("acroom"));
                
                int persons = Integer.parseInt(tfpersons.getText());
                int days = Integer.parseInt(tfdays.getText());
                
                String acselected = cac.getSelectedItem();
                String foodselected = cfood.getSelectedItem();
                
                if((persons*days)>0){
                    int total = 0;
                    total += acselected.equals("AC")? ac:0;
                    total += foodselected.equals("Yes")? food:0;
                    total += cost;
                    total = total * persons * days;
                    labelprice.setText("Rs" + total);
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
                                
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
     }
        else if(ae.getSource()==BookHotel){
            try{
                Conn c = new Conn();
                c.s.executeUpdate("insert into bookhotel values ('" + labelusername.getText() + "' , '" + chotel.getSelectedItem()+ "'  , '" + tfpersons.getText() + "'  ,  '" + tfdays.getText()+ "'  ,  '" + cac.getSelectedItem() + "'  ,  '"+ cfood.getSelectedItem() + "'  ,  '" + labelId.getText() + "'  ,  '" + labelnumber.getText() + "'  ,  '" + labelphone.getText() + "'  ,  '" + labelprice.getText() + "')" );
                JOptionPane.showMessageDialog(null, "Hotel Booked Successfully");
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
    public static void main(String[] args){
        new BookHotel ("");
    }
}
