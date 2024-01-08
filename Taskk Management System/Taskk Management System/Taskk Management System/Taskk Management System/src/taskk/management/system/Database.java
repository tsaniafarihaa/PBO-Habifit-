package taskk.management.system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.*;
import javax.swing.*;

public class Database {
    static final String URL = "jdbc:mysql://localhost/habifit";
    static final String USER = "root";
    static final String PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public Database() throws SQLException{
        try{
            conn = DriverManager.getConnection(URL,USER,PASS);
            stmt = conn.createStatement();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    public Connection getConnection() {
        return conn;
    }
    
    public ResultSet getData(String SQLString){
        try{
            rs = stmt.executeQuery(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Communication Error", JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }
    
    public void query(String SQLString){
        try{
            stmt.executeUpdate(SQLString);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage(), "Connection Error", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
}
