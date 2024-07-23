package smartcity.tourism.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckPackage extends JFrame implements ActionListener {
    JButton Back = new JButton();
    CheckPackage() {
        setBounds(200, 50, 900, 630);

        String[] package1 = {"GOLD PACKAGE","6 Days and 7 Nights","6 seater Bedroom","A Complementary Meal","Visit to Historical places","Daily Buffet","Free 3-Day Travel in City","Book Package","Special Gold Package","Rs. 20000/-"};
        String[] package2 = {"SILVER PACKAGE","5 Days and 6 Nights","4 seater Bedroom","A Complementary Breakfast ","2 Movie Tickets","2-day Buffet","Free 2-Day Travel in City","Book Package","Special Silver Package","Rs. 12000/-"};
        String[] package3 = {"BRONZE PACKAGE","4 Days and 5 Nights","2 seater Bedroom","Complementary Drinks ","1 Movie Ticket","1-day Buffet","Free 1-Day Travel in City","Book Package","Special Bronze Package","Rs. 8000/-"};

        JTabbedPane tab = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tab.addTab("Package 1", null, p1);

        JPanel p2 = createPackage(package2);
        tab.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3);
        tab.addTab("Package 3", null, p3);
        add(tab);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/package1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 500, 300);
        p1.add(image);
//        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/package2.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image2 = new JLabel(i6);
        image2.setBounds(350, 20, 500, 300);
        p2.add(image2);
//        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("smartcity/tourism/management/system/icons/package3.jpg"));
        Image i8 = i7.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(350, 20, 500, 300);
        p3.add(image3);

        setVisible(true);
    }

    public JPanel createPackage(String[] pack) {

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(190,90,40));

        JLabel labelgold = new JLabel(pack[0]);
        labelgold.setBounds(50, 5, 300, 30);
        labelgold.setForeground(Color.BLACK);
        labelgold.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(labelgold);

        JLabel labelgold1 = new JLabel(pack[1]);
        labelgold1.setBounds(30, 60, 300, 30);
        labelgold1.setForeground(Color.BLACK);
        labelgold1.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(labelgold1);

        JLabel labelgold2 = new JLabel(pack[2]);
        labelgold2.setBounds(30, 110, 300, 30);
        labelgold2.setForeground(Color.BLACK);
        labelgold2.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(labelgold2);

        JLabel labelgold3 = new JLabel(pack[3]);
        labelgold3.setBounds(30, 160, 300, 30);
        labelgold3.setForeground(Color.BLACK);
        labelgold3.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(labelgold3);

        JLabel labelgold4 = new JLabel(pack[4]);
        labelgold4.setBounds(30, 210, 300, 30);
        labelgold4.setForeground(Color.BLACK);
        labelgold4.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(labelgold4);

        JLabel labelgold5 = new JLabel(pack[5]);
        labelgold5.setBounds(30, 260, 300, 30);
        labelgold5.setForeground(Color.BLACK);
        labelgold5.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(labelgold5);

        JLabel labelgold6 = new JLabel(pack[6]);
        labelgold6.setBounds(30, 310, 300, 30);
        labelgold6.setForeground(Color.BLACK);
        labelgold6.setFont(new Font("Tahoma", Font.BOLD, 20));
        p1.add(labelgold6);

        JLabel labelgold8 = new JLabel(pack[7]);
        labelgold8.setBounds(60, 430, 300, 30);
        labelgold8.setForeground(Color.BLACK);
        labelgold8.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(labelgold8);

        JLabel labelgold9 = new JLabel(pack[8]);
        labelgold9.setBounds(80, 480, 300, 30);
        labelgold9.setForeground(Color.BLACK);
        labelgold9.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(labelgold9);

        JLabel labelgold10 = new JLabel(pack[9]);
        labelgold10.setBounds(500, 480, 300, 30);
        labelgold10.setForeground(Color.BLACK);
        labelgold10.setFont(new Font("Tahoma", Font.BOLD, 25));
        p1.add(labelgold10);
        
        Back = new JButton("Back");
        Back.setBackground(Color.BLACK);
        Back.setForeground(new Color(190,90,40));
        Back.setBounds(370,550,100,30);
        Back.addActionListener(this);
        add(Back);
//        
        return p1;
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
    
    }
    
    public static void main(String[] args) {
        
        
    }
}

