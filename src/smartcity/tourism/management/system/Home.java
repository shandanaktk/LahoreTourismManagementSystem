/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcity.tourism.management.system;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Shano
 */
public class Home extends javax.swing.JFrame {

   String username;
    public Home(String username) throws SQLException{
        super("Smartcity Tourism Management System");
	this.username = username;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(190, 90, 40));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton1.setText("About");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 130, 30));

        jButton3.setBackground(new java.awt.Color(190, 90, 40));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 140, 30));

        jButton5.setBackground(new java.awt.Color(190, 90, 40));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton5.setText("Check");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 440, 130, 30));

        jButton9.setBackground(new java.awt.Color(190, 90, 40));
        jButton9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton9.setText("Book");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 30));

        jButton10.setBackground(new java.awt.Color(190, 90, 40));
        jButton10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton10.setText("Check");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 140, 30));

        jButton11.setBackground(new java.awt.Color(190, 90, 40));
        jButton11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton11.setText("Pay");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 130, 30));

        jButton6.setBackground(new java.awt.Color(190, 90, 40));
        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 140, 30));

        jButton7.setBackground(new java.awt.Color(190, 90, 40));
        jButton7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton7.setText("View");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 140, 30));

        jButton8.setBackground(new java.awt.Color(190, 90, 40));
        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton8.setText("Add");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 140, 30));

        jButton12.setBackground(new java.awt.Color(190, 90, 40));
        jButton12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton12.setText("View");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 130, 30));

        jButton2.setBackground(new java.awt.Color(190, 90, 40));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 130, 30));

        jButton4.setBackground(new java.awt.Color(190, 90, 40));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton4.setText("Destinations");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 500, 190, 30));

        jButton13.setBackground(new java.awt.Color(190, 90, 40));
        jButton13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jButton13.setText("Logout");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 150, 40));

        jLabel1.setBackground(new java.awt.Color(190, 90, 40));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartcity/tourism/management/system/dash.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1154, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CheckPackage obj =new CheckPackage();
        obj.setVisible(true);
//        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        BookPackage obj;
//       try {
            new BookPackage(username).setVisible(true);
//       } 
//       catch (SQLException ex) {
//           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
//       }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
UpdateCustomer obj;
       try {
           new UpdateCustomer(username).setVisible(true);        // TODO add your handling code here:
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
ViewCustomer obj;
       try {
           obj = new ViewCustomer(username);
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       try {
           // TODO add your handling code here:
           new AddCustomer(username).setVisible(true);        // TODO add your handling code here:
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
ViewBookedPackage obj;
       try {
           obj = new ViewBookedPackage(username);
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }       
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
try{
                new CheckHotels().setVisible(true);
            }catch(Exception e ){}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
new Payment().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
new About().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       try {
           new ViewBookedHotel(username).setVisible(true);        // TODO add your handling code here:
           // TODO add your handling code here:
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       BookHotel obj;
       try {
           obj = new BookHotel(username);
       } catch (SQLException ex) {
           Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Destinations().setVisible(true); 
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(jButton13, "Are you sure you want to logout?", "Confirmation",
              JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
               new Login().setVisible(true);
        this.setVisible(false);
                }
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Home("").setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
