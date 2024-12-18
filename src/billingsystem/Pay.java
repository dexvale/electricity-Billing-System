/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billingsystem;

import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;
/**
 *
 * @author dexte
 */
public class Pay extends javax.swing.JFrame {

    /**
     * Creates new form Pay
     */
    String meterNumber;
    String Month;
    public Pay(String meterNumber, String Month) {
        this.meterNumber = meterNumber;
        this.Month = Month;
        initComponents();
        loadTotalAmount();
    }

     String sUrl = "jdbc:MYSQL://localhost:3306/ewb";
    String sUser = "root";
    String sPass = "";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbP = new javax.swing.JComboBox<>();
        txtP = new javax.swing.JTextField();
        p = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Total Amount");

        total.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Choose a payment method");

        cmbP.setBackground(new java.awt.Color(255, 255, 255));
        cmbP.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cmbP.setForeground(new java.awt.Color(0, 0, 0));
        cmbP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash ", "GCash", "Maya" }));

        txtP.setBackground(new java.awt.Color(255, 255, 255));
        txtP.setForeground(new java.awt.Color(0, 0, 0));

        p.setText("Pay");
        p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(cmbP, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtP, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p)
                    .addComponent(jButton2))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pActionPerformed
      
        String paymentMethod = cmbP.getSelectedItem().toString();
        String paymentAmountText = txtP.getText().trim();

        // Validate the payment amount
        if (paymentAmountText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the payment amount.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double paymentAmount = Double.parseDouble(paymentAmountText);

            // Validate that the payment amount matches the total amount
            double totalAmount = Double.parseDouble(total.getText());

            // Check payment conditions for GCash
            if ("GCash".equalsIgnoreCase(paymentMethod)) {
                if (paymentAmount != totalAmount) {
                    JOptionPane.showMessageDialog(this, "GCash payment must be exactly the total amount.", "Payment Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } else {
                if (paymentAmount < totalAmount) {
                    JOptionPane.showMessageDialog(this, "Insufficient payment amount.", "Payment Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            if (evt.getSource() == p) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
                Statement st = con.createStatement();
                
                
                st.executeUpdate("update bills_info set status = 'Paid' where meter_number = '"+meterNumber+"' AND month = '"+Month+"'");
                JOptionPane.showMessageDialog(new JFrame(), "Paid Successfully");
            } catch (Exception e) {
                e.printStackTrace();
            }
        
         }
            
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid payment amount. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
        
       setVisible(false);
        
        
    }//GEN-LAST:event_pActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

     private void loadTotalAmount() {
         try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        PreparedStatement pst = con.prepareStatement("SELECT total_bill, status FROM bills_info WHERE meter_number = ? AND status = 'Not paid' "
                + "AND month = '"+Month+"'");
        pst.setString(1, meterNumber);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            double totalBill = rs.getDouble("total_bill");
            total.setText(String.format("%.2f", totalBill)); // Set total bill
            if ("Paid".equalsIgnoreCase(rs.getString("status"))) {
                JOptionPane.showMessageDialog(this, "This bill is already paid.", "Information", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Meter number not found.", "Error", JOptionPane.ERROR_MESSAGE);
            dispose();
        }
        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

}
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
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbP;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton p;
    private javax.swing.JLabel total;
    private javax.swing.JTextField txtP;
    // End of variables declaration//GEN-END:variables
}
