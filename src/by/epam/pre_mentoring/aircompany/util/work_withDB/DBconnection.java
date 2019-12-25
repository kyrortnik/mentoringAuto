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
                String column1 = "Model: \b ";
                String column2 = ", Tonnage: \b ";
                String column3 = ", Country: \b ";
                String column4 = ", Seats number: \b ";
                String column5 = ", Producer: \b ";
                String column6 = ", Height of flight: \b ";
                String column7 = ", Distance: \b ";
                System.out.print(column1+ resultSet.getString("plane_model")+ column2 + resultSet.getString("plane_tonnage")+ column3 + resultSet.getString("plane_country")+ column4+ resultSet.getString("seats_num") + column5 + resultSet.getString("producer")+ column6 + resultSet.getString("flying_height")+ column7 + resultSet.getString("plane_distance")+ "\n");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void addToDB(Airplane plane){
        try{
            Connection connection = DriverManager.getConnection(url,user,password);
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO airplanes VALUES(" + plane.getPlaneModel() + ", "+ plane.getTonnage()  +", "+  "'" + plane.getCountryOfOrigin() + "'"  +  ", "+ plane.getSeatsNum() + ", " + "'"+ plane.getProducer()+ "'"+   ", " + plane.getHeightOfFlight() + ", "+  plane.getFlightDistance()+")");
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
