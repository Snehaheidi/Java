package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection1 {

	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
       final String PASS = "root";
        try {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE Hospital";
            statement.executeUpdate(sql);
            System.out.println("DataBase successfully created...");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        try {
        	DB_URL +="Hospital";
        	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        	Statement statement = connection.createStatement();
        	String sql = "CREATE TABLE IF NOT EXISTS PATIENT_DETAILS(Patient_ID INTEGER(10) NOT NULL AUTO_INCREMENT,Patient_Name VARCHAR(50) NOT NULL,phNo VARCHAR(10) NOT NULL,In_Time VARCHAR(20) NOT NULL,PRIMARY KEY(Patient_ID))";
        	statement.executeUpdate(sql);
        	System.out.println("Table Created Successfully..");
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
        try {
        	DB_URL +="Hospital";
        	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        	Statement statement = connection.createStatement();
        	String sql = "ALTER TABLE PATIENT_DETAILS AUTO_INCREMENT=100";
        	statement.executeUpdate(sql);
        	System.out.println("----------------");
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        try {
        	DB_URL +="Hospital";
        	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        	Statement statement = connection.createStatement();
        	String sql = "CREATE TABLE IF NOT EXISTS TIME_TABLE(TIME_ID INTEGER(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,Patient_ID INTEGER NOT NULL,DOCTOR_TIME VARCHAR(10) NOT NULL,OUT_TIME VARCHAR(10) NOT NULL,WAITING_TIME VARCHAR(20) NOT NULL)";
        	statement.executeUpdate(sql);
        	System.out.println("Table Created Successfully..");
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
	}
}
