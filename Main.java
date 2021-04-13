
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mano
 */
public class Main {
    public static void main(String args[])throws SQLException {
        

try {
  
    
    
  Connection con = DriverManager.getConnection(url, "myUserName", "mySecretPassword");
} catch(SQLException e) {
  System.err.println("Cannot connect to DB: " + e);
  Database.rollback();
} finally {
 Database.closeConnection();
    }
    }
}
