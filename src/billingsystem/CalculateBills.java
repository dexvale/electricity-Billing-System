/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billingsystem;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author dexte
 */
public class CalculateBills extends javax.swing.JFrame {

    /**
     * Creates new form CalculateBills
     */
    public CalculateBills() {
        
        initComponents();
        loadMeterNumbers();
    }

   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtN = new javax.swing.JLabel();
        txtA = new javax.swing.JLabel();
        txtUnits = new javax.swing.JTextField();
        cmbM = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        cmbMN = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(232, 236, 215));
        jPanel1.setPreferredSize(new java.awt.Dimension(633, 521));

        jPanel2.setBackground(new java.awt.Color(71, 102, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(216, 450));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Calculate Electricity Bills");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Meter Number");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Units Consumed");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Month");

        txtUnits.setBackground(new java.awt.Color(71, 102, 59));
        txtUnits.setForeground(new java.awt.Color(232, 236, 215));
        txtUnits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitsActionPerformed(evt);
            }
        });

        cmbM.setBackground(new java.awt.Color(71, 102, 59));
        cmbM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May ", "June", "July", "August", "September", "October", "November", "December", " ", " " }));
        cmbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(71, 102, 59));
        submit.setForeground(new java.awt.Color(232, 236, 215));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(71, 102, 59));
        cancel.setForeground(new java.awt.Color(232, 236, 215));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        cmbMN.setBackground(new java.awt.Color(71, 102, 59));
        cmbMN.setForeground(new java.awt.Color(232, 236, 215));
        cmbMN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "item1", "item2" }));
        cmbMN.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbMNItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbM, 0, 184, Short.MAX_VALUE)
                                .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUnits)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbMN, 0, 184, Short.MAX_VALUE)))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cmbMN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbM, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(cancel))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUnitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitsActionPerformed

    private void cmbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMActionPerformed

    private void cmbMNItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbMNItemStateChanged
        
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        String selectedMeterNumber = (String) cmbMN.getSelectedItem();
        loadCustomerDetails(selectedMeterNumber); // Load customer details for the selected meter number
    }
    }//GEN-LAST:event_cmbMNItemStateChanged

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        if(evt.getSource() == cancel){
            setVisible(false);
        }
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if (evt.getSource() == submit) {
        String meterN = (String) cmbMN.getSelectedItem();
        String units = txtUnits.getText();
        String month = (String) cmbM.getSelectedItem();
        
        if(units.isEmpty()){
                JOptionPane.showMessageDialog(new JFrame(), "Please Fill All Fields");
                return;
            }

        double totalBill = 0;
        double unit_consumed = Double.parseDouble(units);
        String sUrl = "jdbc:MYSQL://localhost:3306/ewb";
        String sUser = "root";
        String sPass = "";
        String query = "SELECT * FROM billsrate";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            

            if (rs.next()) { // Assuming only one row in billsrate
                double energyCharge = Double.parseDouble(rs.getString("energy_Charge"));
                double transCharge = Double.parseDouble(rs.getString("trans_Charge"));
                double distributionCharge = Double.parseDouble(rs.getString("distribution_Charge"));
                double systemLoss = Double.parseDouble(rs.getString("system_Loss"));
                double otherCharges = Double.parseDouble(rs.getString("other_Charges"));
                double vat = Double.parseDouble(rs.getString("vat"));

                // Calculate the bill
                totalBill = unit_consumed * energyCharge;
                totalBill += unit_consumed * transCharge;
                totalBill += unit_consumed * distributionCharge;
                totalBill += unit_consumed * systemLoss;
                totalBill += unit_consumed * otherCharges;

                // Apply VAT
                totalBill += totalBill * vat / 100;

                // Display total bill
                System.out.println("Total Bill: " + totalBill);
                //JOptionPane.showMessageDialog(this, "Total Bill: " + totalBill);
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error calculating bill: " + e.getMessage());
        }
        
        String query1 = "INSERT INTO bills_info (meter_number, month, units, total_bill, status) values ('"+meterN+"', '"+month+"', '"+units+"', '"+totalBill+"', 'Not paid')";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
            Statement st = con.createStatement();
            
            
            st.execute(query1);
            JOptionPane.showMessageDialog(this, "Customer Bill Updated Successfully ");
            setVisible(false);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }else {
            setVisible(false);
        }
        
    }//GEN-LAST:event_submitActionPerformed

    
 private void loadMeterNumbers() {
    String sUrl = "jdbc:MYSQL://localhost:3306/ewb";
    String sUser = "root";
    String sPass = "";
    String query = "SELECT meter_number, name, address FROM customer";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        // Clear the combo box to avoid duplicates
        cmbMN.removeAllItems();

        // Add meter numbers to combo box
        while (rs.next()) {
            String meterNumber = rs.getString("meter_number");
            cmbMN.addItem(meterNumber);
            
            System.out.println("Loaded meter number: " + meterNumber); // Debug
        }

        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading meter numbers: " + e.getMessage());
    }
    
    
    
    
    
}
 
 

// Method to load customer details for the selected meter number
private void loadCustomerDetails(String meterNumber) {
    String sUrl = "jdbc:MYSQL://localhost:3306/ewb";
    String sUser = "root";
    String sPass = "";
    String query = "SELECT name, address FROM customer WHERE meter_number = ?";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, meterNumber);

        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Update labels with customer details
            txtN.setText(rs.getString("name"));
            txtA.setText(rs.getString("address")); 
        } else {
            txtN.setText("N/A");
            txtA.setText("N/A");
        }

        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading customer details: " + e.getMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cmbM;
    private javax.swing.JComboBox<String> cmbMN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton submit;
    private javax.swing.JLabel txtA;
    private javax.swing.JLabel txtN;
    private javax.swing.JTextField txtUnits;
    // End of variables declaration//GEN-END:variables
}
