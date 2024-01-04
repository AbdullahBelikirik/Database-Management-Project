/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package petshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author MÜDAFERKAYMAK
 */
public class deneme {
    public static final String url = "jdbc:postgresql://localhost/petset";
    public static final String userdb = "postgres";
    public static final String password = "mudafer69";

    public static void connect() {
        Connection conn = null;
        try {
            try {
                DriverManager.getConnection(url, userdb, password);
                conn = DriverManager.getConnection(url, userdb, password);
                System.out.println("Connected to the PostgreSQL server successfully.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            
            
            String userName = "askfsdf";
            String name = "kldsfldsfsz";
            String surname = "kldsmnfsd";
            String passwordd = "kldsfds";
            String address = "lksadnfs";
            String phoneNumber = "lkasmdflşksf";
            
            String sql = "INSERT INTO users (ID, name, surname, password, address, telNo, userName) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStmt = conn.prepareStatement(sql);
            
            // Değerleri set et
            preparedStmt.setString(2, name);
            preparedStmt.setString(3, surname);
            preparedStmt.setString(4, passwordd);
            preparedStmt.setString(5, address);
            preparedStmt.setString(6, phoneNumber);
            preparedStmt.setString(7, userName);
            preparedStmt.setInt(1,3);
            
            
            // Sorguyu çalıştır
            preparedStmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(deneme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        connect();
    }

    

}
