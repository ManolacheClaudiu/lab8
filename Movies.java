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
public class Movies {
    public void create(int idMovie,String title, String releaseDate, int duration, int score)throws SQLException{
        Connection connect = Database.getConnection();
        try(PreparedStatement preparedStatement = connect.prepareStatement(
                "INSERT INTO movies(id_movie,title,release_date,duration,score) values(?,?,?,?,?) ")){
                prepStmt.setInt(1,idMovie);
                prepStmt.setString(2,title);
                 prepStmt.setString(3,releaseDate);
                  prepStmt.setInt(2,duration);
                   prepStmt.setInt(2,score);
                   prepStmt.executeUpdate();
        }
public Integer findByName(String name) throws SQLException {
            Connection conn = Database.getConnection();
            String sql="SELECT id FROM movies WHERE name='"+name+"'";
            Statement statement=conn.prepareStatement(sql);
            ResultSet resultSet=statement.executeQuery(sql);
            if(resultSet.next()) {return resultSet.getInt(1);}
            return null;
    }
    }
}
