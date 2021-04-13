import java.util.*;
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
public class Genres {
    public void create(int idGenre,String name)throws SQLException{
        Connection connect = Database.getConnection();
        try(PreparedStatement preparedStatement = connect.prepareStatement(
                "INSERT INTO genres(id_gen,name) values(?,?) ")){
                prepStmt.setInt(1,idGenres);
                prepStmt.setString(2,name);
                 prepStmt.executeUpdate();
        }
public Integer findByName(String name) throws SQLException {
            Connection conn = Database.getConnection();
            String sql="SELECT id FROM genres WHERE name='"+name+"'";
            Statement statement=conn.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery(sql);
            if(resultSet.next()) {return resultSet.getInt(1);}
            return null;
    }
    }
}

