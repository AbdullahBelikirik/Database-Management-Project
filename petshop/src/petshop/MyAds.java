/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-NB
 */
public class MyAds extends javax.swing.JFrame {
    
    private final String dbUrl = "jdbc:postgresql://localhost/petset";
    private final String dbUsername = "postgres";
    private final String dbPassword = "mudafer69";
    Connection conn = null;
    
    public MyAds() throws SQLException {
        initComponents();
        displayMyAds();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit_btn1 = new javax.swing.JButton();
        typeField = new javax.swing.JTextField();
        descriptionField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        products_btn = new javax.swing.JButton();
        ads_btn = new javax.swing.JButton();
        myads_btn = new javax.swing.JButton();
        profile_btn = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        ageField = new javax.swing.JTextField();
        sexField = new javax.swing.JTextField();
        delete_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myAdsTable = new javax.swing.JTable();
        username_Label = new javax.swing.JLabel();
        username_Label1 = new javax.swing.JLabel();
        username_Label2 = new javax.swing.JLabel();
        username_Label3 = new javax.swing.JLabel();
        username_Label4 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        add_button = new javax.swing.JButton();

        edit_btn1.setBackground(new java.awt.Color(255, 204, 204));
        edit_btn1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        edit_btn1.setText("EDIT");
        edit_btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        edit_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btn1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        typeField.setBackground(new java.awt.Color(245, 245, 245));
        typeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeFieldActionPerformed(evt);
            }
        });

        descriptionField.setBackground(new java.awt.Color(245, 245, 245));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(1204, 163));

        jLabel44.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel44.setText("PRODUCTS");

        jLabel48.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel48.setText("ADS");

        jLabel49.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel49.setText("PROFILE");

        jLabel50.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel50.setText("LOG OUT");

        jLabel52.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel52.setText("MY ADS");

        products_btn.setBackground(new java.awt.Color(255, 204, 204));
        products_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1375593-200-removebg-preview 1.png"))); // NOI18N
        products_btn.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1375593-200-removebg-preview 1.png"))); // NOI18N
        products_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_btnusers_btn(evt);
            }
        });

        ads_btn.setBackground(new java.awt.Color(255, 204, 204));
        ads_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pets.png"))); // NOI18N
        ads_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ads_btncustomers_btn(evt);
            }
        });

        myads_btn.setBackground(new java.awt.Color(255, 204, 204));
        myads_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bill.png"))); // NOI18N
        myads_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myads_btnbilling_btn(evt);
            }
        });

        profile_btn.setBackground(new java.awt.Color(255, 204, 204));
        profile_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        profile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_btnActionPerformed(evt);
            }
        });

        logout_btn.setBackground(new java.awt.Color(255, 204, 204));
        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnlogout_btn(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(products_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(ads_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel48)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(myads_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addGap(145, 145, 145)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(889, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(products_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ads_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(myads_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profile_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ageField.setBackground(new java.awt.Color(245, 245, 245));

        sexField.setBackground(new java.awt.Color(245, 245, 245));

        delete_btn.setBackground(new java.awt.Color(255, 204, 204));
        delete_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        delete_btn.setText("DELETE");
        delete_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        delete_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        edit_btn.setBackground(new java.awt.Color(255, 204, 204));
        edit_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        edit_btn.setText("EDIT");
        edit_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        myAdsTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        myAdsTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        myAdsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Age", "Gender", "Address", "Description"
            }
        ));
        myAdsTable.setRowHeight(30);
        myAdsTable.setRowMargin(2);
        myAdsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myAdsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myAdsTable);

        username_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label.setText("Age");

        username_Label1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label1.setText("Sex");

        username_Label2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label2.setText("Address");

        username_Label3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label3.setText("Description");

        username_Label4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label4.setText("Type");

        addressField.setBackground(new java.awt.Color(245, 245, 245));

        add_button.setBackground(new java.awt.Color(255, 204, 204));
        add_button.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        add_button.setText("ADD");
        add_button.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        add_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username_Label4)
                    .addComponent(username_Label)
                    .addComponent(username_Label1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_Label3)
                            .addComponent(username_Label2))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(257, 257, 257)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(typeField, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                        .addComponent(sexField)
                        .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                    .addContainerGap(648, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(username_Label4)
                        .addGap(29, 29, 29)
                        .addComponent(username_Label)
                        .addGap(30, 30, 30)
                        .addComponent(username_Label1)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username_Label2)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username_Label3)
                            .addComponent(descriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(270, 270, 270)
                    .addComponent(typeField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(32, 32, 32)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(33, 33, 33)
                    .addComponent(sexField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(343, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void products_btnusers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btnusers_btn
        // TODO add your handling code here:
         dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new Products().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MyAds.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_products_btnusers_btn

    private void ads_btncustomers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ads_btncustomers_btn
        // TODO add your handling code here:
         dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new Ads().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MyAds.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_ads_btncustomers_btn

    private void myads_btnbilling_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myads_btnbilling_btn
        // TODO add your handling code here:
         dispose();
	    java.awt.EventQueue.invokeLater(() -> {
                try {
                    new MyAds().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MyAds.class.getName()).log(Level.SEVERE, null, ex);
                }
	    });
    }//GEN-LAST:event_myads_btnbilling_btn

    private void logout_btnlogout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnlogout_btn
        // TODO add your handling code here:
          dispose();
	    java.awt.EventQueue.invokeLater(() -> {
		new Login().setVisible(true);
	    });
    }//GEN-LAST:event_logout_btnlogout_btn

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed

        try {
            PreparedStatement deleteStatement = (PreparedStatement) conn.prepareStatement("delete from ad where type = ?, address = ?, description = ?");
            
            int selectedRowIndex = myAdsTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                deleteStatement.setString(1, myAdsTable.getValueAt(selectedRowIndex, 0).toString());
                deleteStatement.setString(2, myAdsTable.getValueAt(selectedRowIndex, 3).toString());
                deleteStatement.setString(3, myAdsTable.getValueAt(selectedRowIndex, 4).toString());
                deleteStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Your ad deleted.");
                displayMyAds();
            } else {
                JOptionPane.showMessageDialog(this, "You have to choose a ad to delete.");
            }
            deleteStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        try {
            String updateQuery = "Update ad Set type = ?, age = ?, sex = ?, address = ?, description = ? where type = ?, address = ?, description = ?";
            PreparedStatement updateStatement = (PreparedStatement) conn.prepareStatement(updateQuery);

            int selectedRowIndex = myAdsTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                
                
                if (ageField.getText().isEmpty() || sexField.getText().isEmpty() || typeField.getText().isEmpty() || addressField.getText().isEmpty() || descriptionField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "You have to enter all required fields");
                
                } else {
                    String agetxt = ageField.getText();
                    int age = Integer.parseInt(agetxt);
                    updateStatement.setString(1, typeField.getText());
                    updateStatement.setInt(2, age);
                    updateStatement.setString(3, sexField.getText());
                    updateStatement.setString(4, addressField.getText());
                    updateStatement.setString(5, descriptionField.getText());
                    updateStatement.setString(6, myAdsTable.getValueAt(selectedRowIndex, 0).toString());
                    updateStatement.setString(7, myAdsTable.getValueAt(selectedRowIndex, 3).toString());
                    updateStatement.setString(8, myAdsTable.getValueAt(selectedRowIndex, 4).toString());
                    updateStatement.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "You updated your ad");
                }
            } else {
                JOptionPane.showMessageDialog(this, "You have to choose a ad to update.");
            }
            updateStatement.close();
            displayMyAds();
        } catch (SQLException ex) {
            Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void myAdsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAdsTableMouseClicked
        int selectedRowIndex = myAdsTable.getSelectedRow();
        typeField.setText((String) myAdsTable.getValueAt(selectedRowIndex, 0).toString());
        ageField.setText((String) myAdsTable.getValueAt(selectedRowIndex, 1).toString());
        sexField.setText((String) myAdsTable.getValueAt(selectedRowIndex, 2).toString());
        addressField.setText((String) myAdsTable.getValueAt(selectedRowIndex, 3).toString());
        descriptionField.setText((String) myAdsTable.getValueAt(selectedRowIndex, 4).toString());
    }//GEN-LAST:event_myAdsTableMouseClicked

    private void edit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_btn1ActionPerformed

    private void add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_buttonActionPerformed
        // TODO add your handling code here:
        try{
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        Date currentDate = new Date();
        DateFormat defaultDateFormat = DateFormat.getDateInstance();
        if (typeField.getText().isEmpty() || ageField.getText().isEmpty() || sexField.getText().isEmpty() || addressField.getText().isEmpty() || descriptionField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all required values.");
        } else {
            try {
        
                // Existing code...

                String selectQuery = "SELECT id FROM users WHERE username = ?";
                PreparedStatement selectStatement = (PreparedStatement) conn.prepareStatement(selectQuery);
                selectStatement.setString(1, Login.userName);
                ResultSet resultSet = selectStatement.executeQuery();

                if (resultSet.next()) {
                    int userId = resultSet.getInt("id");
                    System.out.println(userId);

                    String insertQuery = "INSERT INTO ad (address, description, age, sex, type, date, userid) VALUES (?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement insertStatement = (PreparedStatement) conn.prepareStatement(insertQuery);
                    String ageText = ageField.getText();
                    int age = Integer.parseInt(ageText);
                    insertStatement.setString(1, addressField.getText());
                    insertStatement.setString(2, descriptionField.getText());
                    insertStatement.setInt(3, age);
                    insertStatement.setString(4, sexField.getText());
                    insertStatement.setString(5, typeField.getText());
                    insertStatement.setDate(6, new java.sql.Date(currentDate.getTime()));
                    insertStatement.setInt(7, userId);

                    insertStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Hayvan Eklendi");
                } else {
                    JOptionPane.showMessageDialog(this, "User not found.");
                }

// Existing code...

              //  displayMyAds();
            } catch (SQLException ex) {
                Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_add_buttonActionPerformed

    private void typeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeFieldActionPerformed

    private void profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_btnActionPerformed
        try {
            // TODO add your handling code here:
            new Profile().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MyAds.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profile_btnActionPerformed

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
            java.util.logging.Logger.getLogger(MyAds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAds.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MyAds().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(MyAds.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_button;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton ads_btn;
    private javax.swing.JTextField ageField;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField descriptionField;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton edit_btn1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JTable myAdsTable;
    private javax.swing.JButton myads_btn;
    private javax.swing.JButton products_btn;
    private javax.swing.JButton profile_btn;
    private javax.swing.JTextField sexField;
    private javax.swing.JTextField typeField;
    private javax.swing.JLabel username_Label;
    private javax.swing.JLabel username_Label1;
    private javax.swing.JLabel username_Label2;
    private javax.swing.JLabel username_Label3;
    private javax.swing.JLabel username_Label4;
    // End of variables declaration//GEN-END:variables

    private void displayMyAds() throws SQLException { 
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
            
            String selectIDQuery = "SELECT id FROM users WHERE username = ?";
            PreparedStatement selectIDStatement = conn.prepareStatement(selectIDQuery);
            selectIDStatement.setString(1, Login.userName);
            ResultSet idset = selectIDStatement.executeQuery();
            
            if (idset.next()) {
                int userId = idset.getInt("id");
               
                String selectQuery = "SELECT tpye, age, sex, address, description FROM ad WHERE userid = ?";
                PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
                selectStatement.setInt(1, userId);

                ResultSet resultSet = selectStatement.executeQuery();

                ResultSetMetaData metaData = resultSet.getMetaData();
                int columnCount = metaData.getColumnCount();
                String[] columnNames = new String[columnCount];

                for (int i = 1; i <= columnCount; i++) {
                    columnNames[i - 1] = metaData.getColumnName(i);
                }

                DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
                Object[] row;

                while (resultSet.next()) {
                    row = new Object[columnCount];
                    for (int i = 1; i <= columnCount; i++) {
                        row[i - 1] = resultSet.getObject(i);
                    }
                    tableModel.addRow(row);
                }

                myAdsTable.setModel(tableModel);

                resultSet.close();
                selectStatement.close();
            } else {
                System.out.println("User not found."); 
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); 
        } 
    }
}
