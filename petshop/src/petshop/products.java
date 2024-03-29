/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package petshop;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI-NB
 */
public class Products extends javax.swing.JFrame {
    
    private final String dbUrl = "jdbc:postgresql://localhost/petset";
    private final String dbUsername = "postgres";
    private final String dbPassword = "8703";
    Connection conn = null;
    /**
     * Creates new form products
     */
    public Products() throws SQLException {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        basvur_btn = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        products_btn = new javax.swing.JButton();
        ads_btn = new javax.swing.JButton();
        myads_btn = new javax.swing.JButton();
        profile_btn = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabel15.setFont(new java.awt.Font("Imprint MT Shadow", 1, 25)); // NOI18N
        jLabel15.setText("PRODUCTS");

        basvur_btn.setBackground(new java.awt.Color(255, 204, 204));
        basvur_btn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 20)); // NOI18N
        basvur_btn.setText("BUY");
        basvur_btn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        basvur_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvur_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvur_btnActionPerformed(evt);
            }
        });

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

        jLabel49.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel49.setText("PROFILE");

        jLabel50.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel50.setText("LOG OUT");

        jLabel52.setFont(new java.awt.Font("Imprint MT Shadow", 1, 20)); // NOI18N
        jLabel52.setText("MY ADS");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(460, 460, 460))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1176, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(496, 496, 496)
                .addComponent(basvur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(334, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(323, 323, 323)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                .addComponent(basvur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(278, 278, 278)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(284, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_productTableMouseClicked

    private void basvur_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvur_btnActionPerformed
        int selectedRowIndex = productTable.getSelectedRow();
        System.out.println(selectedRowIndex);

        if (selectedRowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a product to purchase.");
        } else {
            try {
                String selectAppidQuery = "SELECT id FROM users WHERE username = ?";
                PreparedStatement selectAppidStatement = conn.prepareStatement(selectAppidQuery);
                selectAppidStatement.setString(1, Login.userName);
                ResultSet appIdSet = selectAppidStatement.executeQuery();

                // Kontrol et: İlk sonuç setinde bir kayıt var mı?
                if (appIdSet.next()) {
                    int appId = appIdSet.getInt("id");

                    String selectadIDQuery = "SELECT id FROM products WHERE name = ?";
                    PreparedStatement selectadIDStatement = conn.prepareStatement(selectadIDQuery);
                    selectadIDStatement.setString(1, productTable.getValueAt(selectedRowIndex, 1).toString());
                    ResultSet idSet = selectadIDStatement.executeQuery();

                    // Kontrol et: İkinci sonuç setinde bir kayıt var mı?
                    if (idSet.next()) {
                        int productID = idSet.getInt("id");
                        
                        Date date = new Date(System.currentTimeMillis());
                        String insertQuery = "INSERT INTO orders(productID, customerID, date) VALUES(?,?,?)";
                        PreparedStatement insertStatement = conn.prepareStatement(insertQuery);
                        insertStatement.setInt(1, productID);
                        insertStatement.setInt(2, appId);
                        insertStatement.setDate(3, date);
                        insertStatement.executeUpdate();

                        
                        String sql = "UPDATE Products SET count = count - 1 WHERE ID = ?";
                        PreparedStatement preparedStatement = conn.prepareStatement(sql);
                        preparedStatement.setInt(1, productID);
                        preparedStatement.executeUpdate();
                        displayProducts();
                        JOptionPane.showMessageDialog(this, "Your order has been received");
                        
                    } else {
                        JOptionPane.showMessageDialog(this, "Product is not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "User not found.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminProducts.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_basvur_btnActionPerformed

    private void products_btnusers_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_btnusers_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Products().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }//GEN-LAST:event_myads_btnbilling_btn

    private void profile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_btnActionPerformed
        dispose();
        try {
            new Profile().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_profile_btnActionPerformed

    private void logout_btnlogout_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnlogout_btn
        // TODO add your handling code here:
        dispose();
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }//GEN-LAST:event_logout_btnlogout_btn

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
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Products().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ads_btn;
    private javax.swing.JButton basvur_btn;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout_btn;
    private javax.swing.JButton myads_btn;
    private javax.swing.JTable productTable;
    private javax.swing.JButton products_btn;
    private javax.swing.JButton profile_btn;
    // End of variables declaration//GEN-END:variables

    private void displayProducts() throws SQLException {
        try {
            conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        Statement selectStatement = conn.createStatement();
        String SelectQuery = "Select count,name,price from products WHERE count>0";
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
}
