/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author khalil
 */
public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/clinicdb";
    private final String user = "root";
    private final String pass = "3638";
    public Connection connection;

    DatabaseConnection(){
        try {
            connection  = DriverManager.getConnection(URL, user, pass);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    

}
