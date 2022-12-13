package university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoConnection {

	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost/";
        final String USER = "root";
       final String PASS = "root";
        try {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String sql = "CREATE DATABASE UniversityManagement";
            statement.executeUpdate(sql);
            System.out.println("DataBase successfully created...");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        try {
        	DB_URL += "UniversityManagement";
        	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        	Statement statement = connection.createStatement();
        	String sql = "CREATE TABLE IF NOT EXISTS STUDENTDETAILS (STUDENT_ID INTEGER NOT NULL AUTO_INCREMENT,STUDENT_NAME VARCHAR(10) NOT NULL,ROLLNO VARCHAR(10) NOT NULL,DOB VARCHAR(10) NOT NULL,PHONE_NUMBER VARCHAR(10) NOT NULL,EMAIL_ID VARCHAR(50) NOT NULL,CITY VARCHAR(10) NOT NULL,PRIMARY KEY(STUDENT_ID))";
        	statement.executeUpdate(sql);
        	System.out.println("--Student Table Successfully Created--");
        }
        catch(SQLException e) {
        	e.printStackTrace();
        }
        try {
        	DB_URL += "UniversityManagement";
        	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
        	Statement statement = connection.createStatement();
        	String sql = "CREATE TABLE IF NOT EXISTS FACULTY_DETAILS(FACULTY_NAME VARCHAR(10) NOT NULL,DOB VARCHAR(10) NOT NULL,PHONE_NUMBER VARCHAR(10) NOT NULL,EMAIL_ID VARCHAR(20) NOT NULL,COLLEGE_NAME VARCHAR(30) NOT NULL,COURSE VARCHAR(20) NOT NULL,CITY VARCHAR(20) NOT NULL,PRIMARY KEY(EMAIL_ID))";
        	statement.executeUpdate(sql);
        	System.out.println("--Faculty table successfully created--");
        }
        catch(SQLException e) {
          e.printStackTrace();
        }
	}

}
