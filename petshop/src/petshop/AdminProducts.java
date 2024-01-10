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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author MSI-NB
 */
public class AdminProducts extends javax.swing.JFrame {
    private final String dbUrl = "jdbc:postgresql://localhost/petset";
    private final String dbUsername = "postgres";
    private final String dbPassword = "mudafer69";
    Connection conn;
    /**
     * Creates new form my_ads
     */
    public AdminProducts() throws SQLException {
        initComponents();
        displayProducts();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        products_btn = new javax.swing.JButton();
        ads_btn = new javax.swing.JButton();
        users_btn = new javax.swing.JButton();
        apandor_btn = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        username_Label = new javax.swing.JLabel();
        username_Label1 = new javax.swing.JLabel();
        username_Label4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        username_Label5 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        oosTable = new javax.swing.JTable();
        username_Label6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameField.setBackground(new java.awt.Color(245, 245, 245));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(1204, 163));

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

        users_btn.setBackground(new java.awt.Color(255, 204, 204));
        users_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/customer.png"))); // NOI18N
        users_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                users_btnbilling_btn(evt);
            }
        });

        apandor_btn.setBackground(new java.awt.Color(255, 204, 204));
        apandor_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        apandor_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apandor_btnActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel44.setText("PRODUCTS");

        logout_btn.setBackground(new java.awt.Color(255, 204, 204));
        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnlogout_btn(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel48.setText("ADS");

        jLabel49.setFont(new java.awt.Font("Imprint MT Shadow", 1, 10)); // NOI18N
        jLabel49.setText("APPLICATIONS  AND ORDERS");

        jLabel50.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel50.setText("LOG OUT");

        jLabel52.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel52.setText("USERS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(224, 224, 224))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(45, 45, 45)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
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
                                    .addComponent(users_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(122, 122, 122))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel52)
                                    .addGap(145, 145, 145)))
                            .addComponent(apandor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(69, 69, 69)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(218, 218, 218)))
                    .addGap(45, 45, 45)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(products_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ads_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(users_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apandor_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        amountField.setBackground(new java.awt.Color(245, 245, 245));

        priceField.setBackground(new java.awt.Color(245, 245, 245));

        deleteButton.setBackground(new java.awt.Color(255, 204, 204));
        deleteButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(255, 204, 204));
        editButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        editButton.setText("EDIT");
        editButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        username_Label.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label.setText("Amount");

        username_Label1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label1.setText("Price");

        username_Label4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label4.setText("Product Name");

        productTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Amount", "Price"
            }
        ));
        productTable.setRowHeight(30);
        productTable.setRowMargin(2);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        username_Label5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label5.setText("Products");

        addButton.setBackground(new java.awt.Color(255, 204, 204));
        addButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        addButton.setText("ADD");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        oosTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        oosTable.setFont(new java.awt.Font("UD Digi Kyokasho NP-R", 0, 25)); // NOI18N
        oosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Product Name", "Amount", "Price"
            }
        ));
        oosTable.setRowHeight(30);
        oosTable.setRowMargin(2);
        oosTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oosTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(oosTable);

        username_Label6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 22)); // NOI18N
        username_Label6.setText("Out of Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username_Label4)
                    .addComponent(username_Label)
                    .addComponent(username_Label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(username_Label5)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(username_Label6)
                        .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(username_Label5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_Label4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(username_Label)
                            .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username_Label1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(username_Label6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        try {
            PreparedStatement deleteStatement = (PreparedStatement) conn.prepareStatement("delete from products where name = ?");
            
            int selectedRowIndex = productTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                String productName = (String) productTable.getValueAt(selectedRowIndex, 1).toString();
                deleteStatement.setString(1, productName);
                deleteStatement.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product deleted.");
                displayProducts();
            } else {
                JOptionPane.showMessageDialog(this, "You have to choose a product to delete.");
            }
            deleteStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        try {
            String updateQuery = "Update products Set name = ? , count = ?, price = ? where name = ?";
            PreparedStatement updateStatement = (PreparedStatement) conn.prepareStatement(updateQuery);

            int selectedRowIndex = productTable.getSelectedRow();
            if (selectedRowIndex != -1) {
                String oldProductName = (String) productTable.getValueAt(selectedRowIndex, 1).toString();
                
                if (nameField.getText().isEmpty() || priceField.getText().isEmpty() || amountField.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please enter all required fields.");
                
                } else {
                    String counttxt = amountField.getText();
                    int count = Integer.parseInt(counttxt);
                    String pricetxt = priceField.getText();
                    int price = Integer.parseInt(pricetxt);
                    updateStatement.setString(1, nameField.getText());
                    updateStatement.setInt(2, count);
                    updateStatement.setInt(3, price);
                    updateStatement.setString(4, oldProductName);
                    updateStatement.executeUpdate();
                    
                    JOptionPane.showMessageDialog(this, "You updated product " + oldProductName);
                }
            } else {
                JOptionPane.showMessageDialog(this, "You have to choose a product to update.");
            }
            updateStatement.close();
            displayProducts();
        } catch (SQLException ex) {
            Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        int selectedRowIndex = productTable.getSelectedRow();
        nameField.setText((String) productTable.getValueAt(selectedRowIndex, 1).toString());
        amountField.setText((String) productTable.getValueAt(selectedRowIndex, 0).toString());
        priceField.setText((String) productTable.getValueAt(selectedRowIndex, 2).toString());
        
    }//GEN-LAST:event_productTableMouseClicked

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if (priceField.getText().isEmpty() || nameField.getText().isEmpty() || amountField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all required values.");
        } else {
            try {
                String checkQuery = "SELECT COUNT(*) FROM products WHERE name = ?";
                PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
                checkStatement.setString(1, nameField.getText());
                
                ResultSet resultSet = checkStatement.executeQuery();
                resultSet.next();
                int cnt = resultSet.getInt(1);
                
                if(cnt == 0){
                    String insertQuery = "insert into Products(name, count, price) VALUES(?,?,?)";
                    PreparedStatement insertStatement = (PreparedStatement) conn.prepareStatement(insertQuery);
                    String countString = amountField.getText();
                    int count = Integer.parseInt(countString);
                    String priceString = priceField.getText();
                    int price = Integer.parseInt(priceString);
                    insertStatement.setString(1, nameField.getText());
                    insertStatement.setInt(2, count);
                    insertStatement.setInt(3, price);
                    insertStatement.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Product added.");
                    displayProducts();
                }
                else{
                    JOptionPane.showMessageDialog(this, "This product already exist.");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void products_btnusers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btnusers_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AdminProducts().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_products_btnusers_btn

    private void ads_btncustomers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ads_btncustomers_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AdminAds().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_ads_btncustomers_btn

    private void users_btnbilling_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_users_btnbilling_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Users().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_users_btnbilling_btn

    private void apandor_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apandor_btnActionPerformed
        try {
            // TODO add your handling code here:
            new AP_OR().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_apandor_btnActionPerformed

    private void logout_btnlogout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnlogout_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }//GEN-LAST:event_logout_btnlogout_btn

    private void oosTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oosTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_oosTableMouseClicked

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
            java.util.logging.Logger.getLogger(AdminProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminProducts().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton ads_btn;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton apandor_btn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logout_btn;
    private javax.swing.JTextField nameField;
    private javax.swing.JTable oosTable;
    private javax.swing.JTextField priceField;
    private javax.swing.JTable productTable;
    private javax.swing.JButton products_btn;
    private javax.swing.JLabel username_Label;
    private javax.swing.JLabel username_Label1;
    private javax.swing.JLabel username_Label4;
    private javax.swing.JLabel username_Label5;
    private javax.swing.JLabel username_Label6;
    private javax.swing.JButton users_btn;
    // End of variables declaration//GEN-END:variables

    private void displayProducts() throws SQLException {
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        Statement selectStatement = conn.createStatement();
        String SelectQuery = "SELECT name,count,price FROM get_all_products()";
        ResultSet resultSet = selectStatement.executeQuery(SelectQuery);
        
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        Object[] row ;
        
        while (resultSet.next()) {
            row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
        }
        
        productTable.setModel(tableModel);
        
        selectStatement.close();
        resultSet.close();

    }
    void displayOutOfStock() throws SQLException{
         try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        Statement selectStatement = conn.createStatement();
        String SelectQuery = "SELECT name,count,price FROM products EXCEPT SELECT * FROM products where count<1";
        ResultSet resultSet = selectStatement.executeQuery(SelectQuery);
        
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();
        String[] columnNames = new String[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            columnNames[i - 1] = metaData.getColumnName(i);
        }
        
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);
        Object[] row ;
        
        while (resultSet.next()) {
            row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
                row[i - 1] = resultSet.getObject(i);
            }
            tableModel.addRow(row);
        }
        
        oosTable.setModel(tableModel);
        
        selectStatement.close();
        resultSet.close();
    }
}
