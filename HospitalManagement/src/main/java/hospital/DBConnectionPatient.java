package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionPatient {

	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
       final String PASS = "root";
        try {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE HospitalManagement";
            statement.executeUpdate(sql);
            System.out.println("DataBase successfully created...");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        try {
        	DB_URL +="HospitalManagement";
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
        	DB_URL +="HospitalManagement";
        	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        	Statement statement = connection.createStatement();
        	String sql = "ALTER TABLE PATIENT_DETAILS AUTO_INCREMENT=100";
        	statement.executeUpdate(sql);
        	System.out.println("----------------");
        }catch(SQLException e) {
        	e.printStackTrace();
        }
	}
}
