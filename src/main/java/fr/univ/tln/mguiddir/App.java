package fr.univ.tln.mguiddir;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://postgres_dvdrental:5432/dvdrental", "postgres", "postgres")) {



            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM film");
            while (resultSet.next()) {
                System.out.println("id:"+resultSet.getString("film_id")+"  titre : " + resultSet.getString("title"));
            }

        } catch (SQLException  e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }
}
