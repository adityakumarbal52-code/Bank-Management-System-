package bank.management.system;

import java.sql.*;

public class Con {

    //create the connection
    Connection connection;
    Statement statement;

    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Aditya@2005");
            statement = connection.createStatement();


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
