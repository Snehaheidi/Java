package hospital;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoOperation {
	
    
    public static Connection connectionDataBase() throws SQLException {
   	     String DB_URL = "jdbc:mysql://localhost/HospitalManagement";
   		String USER = "root";
   		String PASS = "root";
//   		String DB_NAME = "HospitalManagement";
   		 Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);

   		 return connection; 
    }
    
//	static final String insertQuery = "INSERT INTO PATIENT_DETAILS" +"(Patient_Name,phNo,In_Time) VALUES"+"(?,?,?);";
    //    		String DB_URL = "jdbc:mysql://localhost/";
//	String USER = "root";
//	String PASS = "root";
//	String DB_NAME = "HospitalManagement";
//	 Connection connection = DriverManager.getConnection(DB_URL+DB_NAME,USER,PASS);
    public String insert(Patient p) throws ClassNotFoundException, SQLException{
    	System.out.println("-----------------------------");
    	Connection connection = connectionDataBase();
    		String insertQuery = "INSERT INTO PATIENT_DETAILS (Patient_Name,phNo,In_Time) VALUES (?,?,?)";
    		try {
    			PreparedStatement statement = connection.prepareStatement(insertQuery);
    			statement.setString(1, p.getpName());
    			statement.setString(2, p.getPhNo());
    			statement.setString(3, p.getInTime());
    			statement.executeUpdate();
    			System.out.println(">>>>>Add to Record<<<<<<");
    		}
    		catch(SQLException e) {
    			e.printStackTrace();
    		}
    		return "ksdfdsf";
    }
//    public static void insert1(Patient p) {
//    	try {
//    		String DB_URL = "jdbc:mysql://localhost/HospitalManagement";
//    		String USER = "root";
//    		String PASS = "root";
////    		String DB_NAME = "HospitalManagement";
//    	Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
//		Statement statement = connection.createStatement();
//		String sql = "INSERT INTO PATIENT_DETAILS (Patient_Name,phNo,In_Time) VALUES ('"+p.getpName()+"','"+p.getPhNo()+"','"+p.getInTime()+"')";
//		statement.executeUpdate(sql);
//		System.out.println(">>>>>Add to Record<<<<<<");
//    	}
//    	catch(SQLException e) {
//    		e.printStackTrace();
//    	}
//    }

}
