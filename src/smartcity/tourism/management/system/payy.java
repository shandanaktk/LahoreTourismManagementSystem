/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartcity.tourism.management.system;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Shano
 */
public class payy extends javax.swing.JFrame {
    public payy() {
        initComponents();
        tfpasss.setVisible(false);
        tfacc.setVisible(false);
        lblacc.setVisible(false);
        lblpass.setVisible(false);
        btnpay.setVisible(false);
        getContentPane().setBackground(new Color(190,90,40));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblopt = new javax.swing.JLabel();
        lblacc = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnselect = new javax.swing.JButton();
        tfpasss = new javax.swing.JPasswordField();
        tfacc = new javax.swing.JTextField();
        btnpay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblopt.setBackground(new java.awt.Color(0, 0, 0));
        lblopt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblopt.setText("Options:");
        getContentPane().add(lblopt, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 91, 123, -1));

        lblacc.setBackground(new java.awt.Color(0, 0, 0));
        lblacc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblacc.setText("Account Number:");
        getContentPane().add(lblacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 164, 123, -1));

        lblpass.setBackground(new java.awt.Color(0, 0, 0));
        lblpass.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpass.setText("Password:");
        getContentPane().add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 198, 123, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Jazz Cash", "Easy Paisa", "Askari Online", "Debit Card" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 88, 140, -1));

        btnselect.setBackground(new java.awt.Color(0, 0, 0));
        btnselect.setForeground(new java.awt.Color(255, 255, 255));
        btnselect.setText("Select");
        btnselect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectActionPerformed(evt);
            }
        });
        getContentPane().add(btnselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 88, -1, -1));
        getContentPane().add(tfpasss, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 198, 194, -1));
        getContentPane().add(tfacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 164, 194, -1));

        btnpay.setBackground(new java.awt.Color(0, 0, 0));
        btnpay.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnpay.setForeground(new java.awt.Color(255, 255, 255));
        btnpay.setText("Pay");
        btnpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayActionPerformed(evt);
            }
        });
        getContentPane().add(btnpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/smartcity/tourism/management/system/cash.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnselectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectActionPerformed
        // TODO add your handling code here:
         tfpasss.setVisible(true);
         tfacc.setVisible(true);
         lblacc.setVisible(true);
         lblpass.setVisible(true);
         btnpay.setVisible(true);

    }//GEN-LAST:event_btnselectActionPerformed

    private void btnpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(btnpay, "Are you sure you want to pay right now?", "Payment Confirmation",
              JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
                if(result == JOptionPane.YES_OPTION){
               JOptionPane.showMessageDialog(null,"The Payment has been made.");
                new Payment().setVisible(true);
    }//GEN-LAST:event_btnpayActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payy().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpay;
    private javax.swing.JButton btnselect;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblacc;
    private javax.swing.JLabel lblopt;
    private javax.swing.JLabel lblpass;
    private javax.swing.JTextField tfacc;
    private javax.swing.JPasswordField tfpasss;
    // End of variables declaration//GEN-END:variables
}
