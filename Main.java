
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
        //I used useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
        //in order to solve an error :
        //the server time zone value 'EEST' is unrecognized or represents more than one time zone. You must configure either the server or JDBC driver (via the 'serverTimezone' configuration property) to use a more specific time zone value if you want to utilize time zone support
           String url = "jdbc:mysql://localhost:3306/databaseScript?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
           String user ="root";
           String password = "password";

   
try {
      Connection connection = DriverManager.getConnection(url,user,password );
      System.out.println("Connected to the database");
    Movies movie = new Movies();
    movie.create(1001,"Movie1001","17/06/2013", 12, 234);
    
    Genres genre = new Genres();
    genre.create(121, "Comedy");
    Database.commit(); 

} catch(SQLException e) {
  System.err.println("Cannot connect to DB: " + e);
 // Database.rollback();
}
    }
}


