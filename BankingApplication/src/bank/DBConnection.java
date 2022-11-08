package bank;

import java.sql.*;

public class DBConnection
{
    public static void main(String[] args)
    {
        String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
        final String PASS = "root";
        try {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE Bank_Details";
            statement.executeUpdate(sql);
            System.out.println("DataBase successfully created...");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        try{
            DB_URL +="Bank_Details";
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String sql = "CREATE TABLE IF NOT EXISTS user_bank_details(user_id INTEGER(10) NOT NULL AUTO_INCREMENT,Holder_Name VARCHAR(50)NOT NULL,Password INTEGER(10) NOT NULL,Balance VARCHAR(50) NOT NULL,PRIMARY KEY(user_id),UNIQUE KEY(Holder_Name))";
            statement.executeUpdate(sql);
            System.out.println("Table successfully created...");
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
