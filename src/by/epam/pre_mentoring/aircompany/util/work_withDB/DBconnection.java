package by.epam.pre_mentoring.aircompany.util.work_withDB;


import by.epam.pre_mentoring.aircompany.bean.Airplane;
import org.json.simple.JSONObject;

import java.sql.*;
import java.util.ArrayList;

public class DBconnection {
    final String url = "jdbc:postgresql://localhost:5432/postgres";
    final String user = "postgres";
    final String password = "4815162342";

    public void createDB(){
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            statement.executeQuery("CREATE TABLE Airplanes (\n" +
                    "plane_id SERIAL PRIMARY KEY NOT NULL,\n" +
                    "plane_body varchar (255)\n" +
                    ")");

        }catch (SQLException e){
            e.printStackTrace();
        }
        }


    public void showAllDB(){
        createDB();
        try{

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Airplanes");

            while(resultSet.next()){
                String column1 = "plane_id: \b ";
                String column2 = ", plane_body: \b ";
                System.out.print(column1+ resultSet.getString("plane_id")+ column2 + resultSet.getString("plane_body"));
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void addToDB(JSONObject plane){
        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO airplanes(plane_body) VALUES("+ "'" + plane.toJSONString()+"'" + ")");
            System.out.println("Values has been added to DataBase");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Incorrect input values");
        }
    }
    public void remoteFromDB(String value,String column){
        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("DELETE FROM airplanes WHERE " + column + " = " + value);
            System.out.println("Value has been removed");
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Incorrect input values");

        }
    }
}
