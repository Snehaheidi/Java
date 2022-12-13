package accessmodifier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoOperation {
	public static Connection connectionDataBase() throws SQLException {
		String DB_URL = "jdbc:mysql://localhost/UserLogin";
		String USER = "root";
		String PASS = "root";
		Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
		return connection; 
	}
	public static boolean insert() {
		
		return true;
	}
}
