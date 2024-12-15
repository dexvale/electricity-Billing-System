/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billingsystem;
import java.awt.Color;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author dexte
 */
public class CustomerDashboard extends javax.swing.JFrame {

    private String Name;
    private String meterNumber; 
    public CustomerDashboard(String name, String meterNumber) {
        this.Name = name; 
        this.meterNumber = meterNumber;
        initComponents();
        parent.removeAll();
        parent.add(home);
        parent.repaint();
        parent.revalidate();
        
        
    }
    
    String sUrl = "jdbc:MYSQL://localhost:3306/ewb";
    String sUser = "root";
    String sPass = "";

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UPDATE = new javax.swing.JButton();
        VI = new javax.swing.JButton();
        PB = new javax.swing.JButton();
        BD = new javax.swing.JButton();
        G = new javax.swing.JButton();
        H = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        parent = new javax.swing.JPanel();
        updatePNL = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Uaddress = new javax.swing.JTextField();
        Uname = new javax.swing.JTextField();
        UmeterN = new javax.swing.JLabel();
        Uprovince = new javax.swing.JTextField();
        Uemail = new javax.swing.JTextField();
        Uphone = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        Umuni = new javax.swing.JTextField();
        view = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        meterN = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        muni = new javax.swing.JLabel();
        province = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        pay = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Pname = new javax.swing.JLabel();
        PmeterN = new javax.swing.JLabel();
        Punits = new javax.swing.JLabel();
        Pstatus = new javax.swing.JLabel();
        PtotalB = new javax.swing.JLabel();
        Pmonth = new javax.swing.JComboBox<>();
        payB = new javax.swing.JButton();
        billD = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableB = new javax.swing.JTable();
        genrate = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        paytime = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        j = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(71, 102, 59));

        UPDATE.setBackground(new java.awt.Color(232, 236, 215));
        UPDATE.setForeground(new java.awt.Color(0, 0, 0));
        UPDATE.setText("Update Information");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        VI.setBackground(new java.awt.Color(232, 236, 215));
        VI.setForeground(new java.awt.Color(0, 0, 0));
        VI.setText("View Information");
        VI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VIActionPerformed(evt);
            }
        });

        PB.setBackground(new java.awt.Color(232, 236, 215));
        PB.setForeground(new java.awt.Color(0, 0, 0));
        PB.setText("Pay  Bills");
        PB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PBActionPerformed(evt);
            }
        });

        BD.setBackground(new java.awt.Color(232, 236, 215));
        BD.setForeground(new java.awt.Color(0, 0, 0));
        BD.setText("Bills Details");
        BD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDActionPerformed(evt);
            }
        });

        G.setBackground(new java.awt.Color(232, 236, 215));
        G.setForeground(new java.awt.Color(0, 0, 0));
        G.setText("Generate");
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GMouseClicked(evt);
            }
        });
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        H.setBackground(new java.awt.Color(232, 236, 215));
        H.setForeground(new java.awt.Color(0, 0, 0));
        H.setText("Home");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(232, 236, 215));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Log-out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Italic_IV50", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("AmpereLink");

        jLabel10.setFont(new java.awt.Font("Italic_IV50", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/salut-logo-ezgif.com-resize.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(VI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UPDATE, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(VI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BD, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        parent.setBackground(new java.awt.Color(255, 255, 255));
        parent.setLayout(new java.awt.CardLayout());

        updatePNL.setBackground(new java.awt.Color(232, 236, 215));

        jLabel11.setFont(new java.awt.Font("Italic_IV50", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(71, 102, 59));
        jLabel11.setText("UPDATE YOUR INFORMATION");

        jLabel12.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Meter Number");

        jLabel14.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Address");

        jLabel15.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Municipality");

        jLabel16.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Province");

        jLabel17.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Email");

        jLabel18.setFont(new java.awt.Font("Italic_IV50", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Phone Number");

        Uaddress.setBackground(new java.awt.Color(255, 255, 255));
        Uaddress.setForeground(new java.awt.Color(0, 0, 0));

        Uname.setBackground(new java.awt.Color(255, 255, 255));
        Uname.setForeground(new java.awt.Color(0, 0, 0));

        UmeterN.setBackground(new java.awt.Color(255, 255, 255));
        UmeterN.setForeground(new java.awt.Color(0, 0, 0));

        Uprovince.setBackground(new java.awt.Color(255, 255, 255));
        Uprovince.setForeground(new java.awt.Color(0, 0, 0));

        Uemail.setBackground(new java.awt.Color(255, 255, 255));
        Uemail.setForeground(new java.awt.Color(0, 0, 0));

        Uphone.setBackground(new java.awt.Color(255, 255, 255));
        Uphone.setForeground(new java.awt.Color(0, 0, 0));

        update.setBackground(new java.awt.Color(71, 102, 59));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Umuni.setBackground(new java.awt.Color(255, 255, 255));
        Umuni.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout updatePNLLayout = new javax.swing.GroupLayout(updatePNL);
        updatePNL.setLayout(updatePNLLayout);
        updatePNLLayout.setHorizontalGroup(
            updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePNLLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePNLLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePNLLayout.createSequentialGroup()
                        .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(updatePNLLayout.createSequentialGroup()
                                .addComponent(UmeterN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(2, 2, 2))
                            .addComponent(Uaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(Umuni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                        .addGap(37, 37, 37)))
                .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(updatePNLLayout.createSequentialGroup()
                        .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Uemail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uprovince, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(updatePNLLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Uphone, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(109, 109, 109))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatePNLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(270, 270, 270))
            .addGroup(updatePNLLayout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updatePNLLayout.setVerticalGroup(
            updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatePNLLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel11)
                .addGap(51, 51, 51)
                .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uprovince, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UmeterN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uemail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Uphone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Uaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(83, 83, 83)
                .addGroup(updatePNLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Umuni, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(62, 62, 62))
        );

        parent.add(updatePNL, "card2");

        view.setBackground(new java.awt.Color(232, 236, 215));

        jLabel1.setFont(new java.awt.Font("Italic_IV50", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 69, 41));
        jLabel1.setText("VIEW CUSTOMER INFORMATION ");

        jLabel2.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Meter Number:");

        jLabel4.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Address:");

        jLabel5.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Municipality:");

        jLabel6.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Province:");

        jLabel7.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Italic_IV50", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Phone:");

        jButton2.setBackground(new java.awt.Color(71, 102, 59));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");

        name.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));

        meterN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        meterN.setForeground(new java.awt.Color(0, 0, 0));

        address.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        address.setForeground(new java.awt.Color(0, 0, 0));

        muni.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        muni.setForeground(new java.awt.Color(0, 0, 0));

        province.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        province.setForeground(new java.awt.Color(0, 0, 0));

        email.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));

        phone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        phone.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(muni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                        .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(meterN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(165, Short.MAX_VALUE))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(viewLayout.createSequentialGroup()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jButton2)))
                .addGap(72, 72, 72))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(viewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(70, 70, 70)
                                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                                    .addGroup(viewLayout.createSequentialGroup()
                                        .addComponent(province, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))
                                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(viewLayout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(meterN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(viewLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(viewLayout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(muni, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(72, 72, 72))
        );

        parent.add(view, "card7");

        pay.setBackground(new java.awt.Color(232, 236, 215));

        jLabel19.setFont(new java.awt.Font("Italic_IV50", 2, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("ELECTRICITY BILL");

        jLabel20.setFont(new java.awt.Font("Italic_IV50", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Meter Number");

        jLabel21.setFont(new java.awt.Font("Italic_IV50", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Name");

        jLabel22.setFont(new java.awt.Font("Italic_IV50", 2, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Month");

        jLabel23.setFont(new java.awt.Font("Italic_IV50", 2, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Units");

        jLabel24.setFont(new java.awt.Font("Italic_IV50", 2, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Total Bill");

        jLabel25.setFont(new java.awt.Font("Italic_IV50", 2, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Status");

        Pstatus.setForeground(new java.awt.Color(255, 51, 51));

        Pmonth.setBackground(new java.awt.Color(232, 236, 215));
        Pmonth.setForeground(new java.awt.Color(0, 0, 0));
        Pmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May ", "June", "July", "August", "September", "October", "November", "December" }));
        Pmonth.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PmonthItemStateChanged(evt);
            }
        });

        payB.setBackground(new java.awt.Color(71, 102, 59));
        payB.setText("Pay");
        payB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout payLayout = new javax.swing.GroupLayout(pay);
        pay.setLayout(payLayout);
        payLayout.setHorizontalGroup(
            payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(payB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(payLayout.createSequentialGroup()
                        .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Pmonth, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Punits, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                            .addComponent(PmeterN, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PtotalB, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        payLayout.setVerticalGroup(
            payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PmeterN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(payLayout.createSequentialGroup()
                        .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Punits, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PtotalB, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(payB)
                .addGap(45, 45, 45))
        );

        parent.add(pay, "card4");

        billD.setBackground(new java.awt.Color(232, 236, 215));

        tableB.setBackground(new java.awt.Color(232, 236, 215));
        tableB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableB.setForeground(new java.awt.Color(0, 0, 0));
        tableB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableB);

        javax.swing.GroupLayout billDLayout = new javax.swing.GroupLayout(billD);
        billD.setLayout(billDLayout);
        billDLayout.setHorizontalGroup(
            billDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        billDLayout.setVerticalGroup(
            billDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        parent.add(billD, "card5");

        genrate.setBackground(new java.awt.Color(232, 236, 215));

        javax.swing.GroupLayout genrateLayout = new javax.swing.GroupLayout(genrate);
        genrate.setLayout(genrateLayout);
        genrateLayout.setHorizontalGroup(
            genrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        genrateLayout.setVerticalGroup(
            genrateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        parent.add(genrate, "card6");

        home.setBackground(new java.awt.Color(255, 255, 255));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/energy-power.jpg"))); // NOI18N
        jLabel27.setText("jLabel27");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light-bulb-3104355__480.jpg"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/light-bulb-3104355__480.jpg"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/power-energy-ryu-shin-woo.jpg"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        parent.add(home, "card7");

        paytime.setBackground(new java.awt.Color(255, 255, 255));

        j.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(j);

        javax.swing.GroupLayout paytimeLayout = new javax.swing.GroupLayout(paytime);
        paytime.setLayout(paytimeLayout);
        paytimeLayout.setHorizontalGroup(
            paytimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        paytimeLayout.setVerticalGroup(
            paytimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        parent.add(paytime, "card8");

        getContentPane().add(parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1000, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDActionPerformed
        parent.removeAll();
        parent.add(billD);
        parent.repaint();
        parent.revalidate();
        //-------------------------------------------------------
        String query = "SELECT meter_number, month, units, total_bill, status FROM bills_info WHERE meter_number = '"+meterNumber+"'";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
            Statement st = con.createStatement(); 
            ResultSet rs = st.executeQuery(query);
            tableB.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_BDActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
       parent.removeAll();
        parent.add(home);
        parent.repaint();
        parent.revalidate();
        
        
    }//GEN-LAST:event_HActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        parent.removeAll();
        parent.add(updatePNL);
        parent.repaint();
        parent.revalidate();
        //------------------------------------------------------
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer where meter_number = '"+meterNumber+"'");
            while(rs.next()) {
                Uname.setText(rs.getString("name"));
                UmeterN.setText(rs.getString("meter_Number"));
                Uaddress.setText(rs.getString("address"));
                Umuni.setText(rs.getString("Municipality"));
                Uprovince.setText(rs.getString("Province"));
                Uemail.setText(rs.getString("email"));
                Uphone.setText(rs.getString("phone_No"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    

    
    }//GEN-LAST:event_UPDATEActionPerformed

    private void VIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VIActionPerformed
        
        parent.removeAll();
        parent.add(view);
        parent.repaint();
        parent.revalidate();
        //-------------------------------------------------------
        
        
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from customer where meter_number = '"+meterNumber+"'");
            while(rs.next()) {
                name.setText(rs.getString("name"));
                meterN.setText(rs.getString("meter_Number"));
                address.setText(rs.getString("address"));
                muni.setText(rs.getString("Municipality"));
                province.setText(rs.getString("Province"));
                email.setText(rs.getString("email"));
                phone.setText(rs.getString("phone_No"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    

    
        
    }//GEN-LAST:event_VIActionPerformed

    private void PBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PBActionPerformed
        parent.removeAll();
        parent.add(pay);
        parent.repaint();
        parent.revalidate();
        
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customer where meter_number = '"+meterNumber+"'");
        while(rs.next()){
            PmeterN.setText(meterNumber);
            Pname.setText(rs.getString("name"));
            
             
        }
        rs = st.executeQuery("SELECT * FROM bills_info WHERE meter_number = '"+meterNumber+ "' AND month = 'January' ORDER BY meterID DESC LIMIT 1");
        while(rs.next()){
            Punits.setText(rs.getString("units"));
            PtotalB.setText(rs.getString("total_bill"));
            Pstatus.setText(rs.getString("status"));
            
            
        }
        
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_PBActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        
        
        Bills b = new Bills(meterNumber);
        b.setVisible(true);
        b.setLocationRelativeTo(this);
        
        
        parent.removeAll();
        parent.add(genrate);
        parent.repaint();
        parent.revalidate();
        //-----------------------------------------------------------
        
        
        
        
        
        
    }//GEN-LAST:event_GActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        if (evt.getSource() == update) {
        String FName = Uname.getText().trim();
        String Address = Uaddress.getText().trim();
        String Muni = Umuni.getText().trim();
        String Province = Uprovince.getText().trim();
        String Email = Uemail.getText().trim();
        String Phone = Uphone.getText().trim();

        

        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        Statement st = con.createStatement();
        st.executeUpdate("UPDATE customer SET name = '"+FName+"', address = '"+Address+"', Municipality = '"+Muni+"', Province = '"+Province+"', email = '"+Email+"', phone_No = '"+Phone+"' "
                + "WHERE meter_number = '"+meterNumber+"'");
        st.executeUpdate("UPDATE user SET name = '"+FName+"' WHERE meter_number = '"+meterNumber+"'");
            JOptionPane.showMessageDialog(new JFrame(), "Information Added Succesfully");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
        
        
    }//GEN-LAST:event_updateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LOGIN login = new LOGIN();
       login.setVisible(true);
       login.setLocationRelativeTo(this);
       this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void PmonthItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PmonthItemStateChanged
        String m = (String) Pmonth.getSelectedItem();
       try { 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);
        
        // Using a PreparedStatement to fetch data dynamically
        String query = "SELECT * FROM bills_info WHERE meter_number = ? AND LOWER(month) = ? AND status = 'Not paid' ORDER BY meterID DESC LIMIT 1";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, PmeterN.getText().trim()); // Get the meter number dynamically
        pst.setString(2, Pmonth.getSelectedItem().toString().toLowerCase()); // Get selected month
        
        ResultSet rs = pst.executeQuery();

        // Clear previous results before setting new ones
        Punits.setText(""); 
        PtotalB.setText("");
        Pstatus.setText("");

        if (rs.next()) {
            Punits.setText(rs.getString("units"));
            PtotalB.setText(rs.getString("total_bill"));
            Pstatus.setText(rs.getString("status"));
            
            // Check the status and set the color
            if ("Paid".equalsIgnoreCase(rs.getString("status").trim())) {
            Pstatus.setForeground(Color.BLUE);
            } else {
            Pstatus.setForeground(Color.RED);
            }
        } else {
            
        }
        

        rs.close(); // Close ResultSet
        pst.close(); // Close PreparedStatement
        con.close(); // Close Connection
    } catch (Exception e) {
        e.printStackTrace();
    }
       
       
    }//GEN-LAST:event_PmonthItemStateChanged

    private void updateStatusToPaid(String meterNumber, String month) {
    try {
        // Load database driver and connect
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(sUrl, sUser, sPass);

        // SQL query to update the status to 'Paid'
        String query = "UPDATE bills_info SET status = 'Paid' WHERE meter_number = ? AND LOWER(month) = ? AND status = 'Not paid'";
        PreparedStatement pst = con.prepareStatement(query);
        pst.setString(1, meterNumber); // Dynamic meter number
        pst.setString(2, month.toLowerCase()); // Dynamic month

        // Execute the update
        int rowsUpdated = pst.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Payment successful! Status updated to Paid.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No matching record found or already paid.", "Error", JOptionPane.WARNING_MESSAGE);
        }

        // Close resources
        pst.close();
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error updating status: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

   
    private void payBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBActionPerformed
        String m = (String) Pmonth.getSelectedItem(); 
        Pay p = new Pay(meterNumber, m);
         p.setVisible(true);
         p.setLocationRelativeTo(this);
        
        //parent.removeAll();
       // parent.add(paytime);
        //parent.repaint();
       // parent.revalidate();
        
        j.setEditable(false);
        
        try {
            j.setPage("https://paytm.com/online-payments");
        } catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load<html>");
            
        }
         
    }//GEN-LAST:event_payBActionPerformed

    private void GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseClicked
        
    }//GEN-LAST:event_GMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BD;
    private javax.swing.JButton G;
    private javax.swing.JButton H;
    private javax.swing.JButton PB;
    private javax.swing.JLabel PmeterN;
    private javax.swing.JComboBox<String> Pmonth;
    private javax.swing.JLabel Pname;
    private javax.swing.JLabel Pstatus;
    private javax.swing.JLabel PtotalB;
    private javax.swing.JLabel Punits;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField Uaddress;
    private javax.swing.JTextField Uemail;
    private javax.swing.JLabel UmeterN;
    private javax.swing.JTextField Umuni;
    private javax.swing.JTextField Uname;
    private javax.swing.JTextField Uphone;
    private javax.swing.JTextField Uprovince;
    private javax.swing.JButton VI;
    private javax.swing.JLabel address;
    private javax.swing.JPanel billD;
    private javax.swing.JLabel email;
    private javax.swing.JPanel genrate;
    private javax.swing.JPanel home;
    private javax.swing.JEditorPane j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel meterN;
    private javax.swing.JLabel muni;
    private javax.swing.JLabel name;
    private javax.swing.JPanel parent;
    private javax.swing.JPanel pay;
    private javax.swing.JButton payB;
    private javax.swing.JPanel paytime;
    private javax.swing.JLabel phone;
    private javax.swing.JLabel province;
    private javax.swing.JTable tableB;
    private javax.swing.JButton update;
    private javax.swing.JPanel updatePNL;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
