package by.epam.pre_mentoring.aircompany.util.work_withDB;
import java.sql.*;
public class DBconnection {
    public static void main(String[]args){
        try{
            //1.Connection
            Connection connection = DriverManager.getConnection("jdbc:postgres://localhost:3306/javaDB","login","pass");

            //2.Statement
            Statement statement = connection.createStatement();

            //3.Execute query
            ResultSet resultSet = statement.executeQuery("select * from employees");

            //4.Process result
            while(resultSet.next()){
                System.out.println((resultSet.getString("column_name")+ "," + resultSet.getString("column_name")));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
