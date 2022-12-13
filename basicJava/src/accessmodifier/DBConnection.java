package accessmodifier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private static String DB_URL = "jdbc:mysql://localhost/";
	private final static String USER = "root";
	private final static String PASS = "root";
	public static void main(String[] args) throws SQLException {
//		createDatabase();
		createTable();
	}
	public static void createDatabase() {
		try {
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement statement = connection.createStatement();
			String sql = "CREATE DATABASE UserLogin";
			statement.executeUpdate(sql);
			System.out.println("DataBase successfully created...");
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	public static void createTable() throws SQLException {
		DB_URL += "UserLogin";
		Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement statement = connection.createStatement();
		String sql = "CREATE TABLE IF NOT EXISTS User(User_ID INTEGER(10) NOT NULL AUTO_INCREMENT,UserName VARCHAR(10) NOT NULL,PhoneNumber VARCHAR(10) NOT NULL,Email_ID VARCHAR(10),PRIMARY KEY(User_ID))";
		statement.executeUpdate(sql);
		System.out.println("Table created Successfully..");
	}
}
