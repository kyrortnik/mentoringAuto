package by.epam;

import java.sql.*;

public class Test {

    public static void main(String[]args){
        try{
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","4815162342");
                    //"jdbc:mysql://hostname:port/dbname","username", "password"
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from persons");
            while (resultSet.next()){
                System.out.println(resultSet.getString("political_views"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
