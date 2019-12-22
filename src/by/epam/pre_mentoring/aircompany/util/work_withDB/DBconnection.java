package by.epam.pre_mentoring.aircompany.util.work_withDB;


import by.epam.pre_mentoring.aircompany.bean.Airplane;

import java.sql.*;
import java.util.ArrayList;

public class DBconnection {
    final String url = "jdbc:postgresql://localhost:5432/postgres";
    final String user = "postgres";
    final String password = "4815162342";

    public void showAllDB(){
        try{

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from airplanes");

            while(resultSet.next()){
                System.out.println(resultSet.getString("plane_model")+ ", "+ resultSet.getString("plane_tonnage")+ ", "+ resultSet.getString("plane_speed")+ ", "+ resultSet.getString("plane_country"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void addToDB(ArrayList<Airplane> company){
        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeQuery("INSERT INTO airplanes VALUES (12,432,42345,346)");
            System.out.println("Value has been added to DataBase");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Incorrect input values");
        }
    }
    public void remoteFromDB(String value,String column){
        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeQuery("DELETE FROM airplanes WHERE"+ column +"=" + value);
            System.out.println("Value has been removed");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Incorrect input values");

        }
    }
}
