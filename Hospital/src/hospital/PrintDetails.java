package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PrintDetails {
	static String DB_URL = "jdbc:mysql://localhost/Hospital";
	static final String USER = "root";
	static final String PASS = "root";
    public static void display() {
    	try {
    		Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM PATIENT_DETAILS";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			System.out.println("---------------Patient Details----------------------------");
			System.out.format("%5s %15s %15s %10s\n","ID", "PatientName", "PhoneNumber","In_Time");
			System.out.println("-----------------------------------------------------------");
			while(resultSet.next()){
				int id1 = resultSet.getInt("Patient_ID");
				String p_Name = resultSet.getString("Patient_Name");
				String phNo = resultSet.getString("phNo");
				String inTime = resultSet.getString("In_Time");
//				System.out.println(" "+id1+"\t\t "+p_Name+"\t\t "+phNo);
				System.out.format("%5s %15s %15s %10s\n", +id1+ "", ""+p_Name+"", ""+phNo+"",""+inTime+"");
			}
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    	try {
    		Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM TIME_TABLE";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			System.out.println("---------------Patient Details--------------------------------");
			System.out.format("%5s %15s %10s %15s\n","ID", "DOCTOR_TIME", "OUT_TIME" , "WAITING_TIME");
			System.out.println("--------------------------------------------------------------");
			while(resultSet.next()){
				int id1 = resultSet.getInt("Patient_ID");
				String dTime = resultSet.getString("DOCTOR_TIME");
				String oTime = resultSet.getString("OUT_TIME");
				String waitTime = resultSet.getString("WAITING_TIME");
//				System.out.println(" "+id1+"\t\t "+p_Name+"\t\t "+phNo);
				System.out.format("%5s %15s %15s %10s\n", +id1+ "", ""+dTime+"", ""+oTime+"",""+waitTime+"");
			}
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
