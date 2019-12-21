package by.epam.pre_mentoring.aircompany.util.work_withDB;


import java.sql.*;
public class DBconnection {
    public static void main(String[]args){
        try{

            //1.Connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "4815162342");

            //2.Statement
            Statement statement = connection.createStatement();

            //3.Execute query
            ResultSet resultSet = statement.executeQuery("select * from airplanes");

            //4.Process result
            while(resultSet.next()){
                System.out.println((resultSet.getString("plane_model")+ "," + resultSet.getString("plane_tonnage")));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
