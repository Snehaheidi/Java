package hospital;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class HospitalPaitentRegister {
	static String DB_URL = "jdbc:mysql://localhost/Hospital";
	static final String USER = "root";
	static final String PASS = "root";		
	
	public static void entryDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Paitent ID : ");
		int id = scanner.nextInt();
		if(!isAlreadyExists(id)) {
			System.out.println("The Patient Id Not Availble..Enter New Entry : ");
			register();	
		}
		else {
			isAlreadyExistsFetchDetails(id);
		}
	}
	public static void isAlreadyExistsFetchDetails(int id) {
		Scanner scanner = new Scanner(System.in);
		int p_id=0;
		String p_Name = null,phNo = null;
		try{
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM PATIENT_DETAILS where Patient_ID ='"+id+"'";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			if(resultSet.next()){
				p_id = resultSet.getInt("Patient_ID");
				p_Name = resultSet.getString("Patient_Name");
				phNo = resultSet.getString("phNo");
				System.out.println("Patient Details");
				System.out.println("ID : "+p_id+"\nPatient Name : "+p_Name+"\nphNo : "+phNo);
			}		
			System.out.println("-----------------------");
			System.out.println("Enter In_Time : ");
			String inTime = scanner.next();
			TimeCalculation.waitTime(p_id,p_Name,phNo,inTime);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static boolean isAlreadyExists(int id) {
		try {
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM PATIENT_DETAILS where Patient_ID ='"+id+"'";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			if(!resultSet.next()){
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	private static void register() {
		Scanner scanner = new Scanner(System.in);
		int patient_id = 0;
		System.out.println("Patient Name : ");
		String patientName = scanner.next();
		System.out.println("Phone Number : ");
		String phNo = scanner.next();
		System.out.println("Patient In-Time (HH:MM):  ");
		String inTime = scanner.next();
		TimeCalculation.waitTime(patient_id,patientName,phNo,inTime);
		boolean flag = true;
		if(flag) {
			patient_id = idGenerate(patientName);
			System.out.println("Your Patient-ID :  "+patient_id);
			System.out.println("------------------------------------------");
		}
		else {
			System.out.println("Register Unsuccessful :-(");
		}
	}
	private static int idGenerate(String patientName) {
		int id=0;
		PreparedStatement statement1;
		try {
			Connection connection1 = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM PATIENT_DETAILS where Patient_Name ='"+patientName+"'";
			statement1 = connection1.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			if(resultSet.next()){
				id = resultSet.getInt("Patient_ID");
				return id;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
}