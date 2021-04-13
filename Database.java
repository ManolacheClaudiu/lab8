
import java.sql.*;
import java.sql.SQLException;
import java.lang.ClassNotFoundException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mano
 */
public class Database {
  private static String url ="jdbc:mysql://localhost:3306/student";
    private static String user ="student";
    private static String password = "STUDENT";
    private static Connection connection=null;
    public static boolean Singleton=false;  
     private Database() {
        Singleton=true;
    }
       public static Connection getConnection() {
        if(connection==null)
            createConnection();
        return connection;
    }
       static void createConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Database.connection=DriverManager.getConnection(url,user,password);
        }catch(ClassNotFoundException exception) {
            System.err.print("ClassNotFoundException: "+exception);
        }catch (SQLException exception) {
            System.err.println("SQLException: "+exception);
        }
         static void closeConnection() throws SQLException {
        connection.close();
    }
    static void commit() throws SQLException {
        connection.commit();
    }
    static void rollback() throws  SQLException {
        connection.rollback();
    }
    }
}
