/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travelmania;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author dhananji
 */
public class Database_Connector {
    
    //private static String servername = "localhost";
    //private static String username = "root";
    //private static String dbname = "travelmania";
    //private static Integer portnumber = 3306;
    //private static String Password = "";
    
    public static Connection getConnection(){
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmania","root","");
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(Database_Connector.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        return con;
        
    }
    
    
}
