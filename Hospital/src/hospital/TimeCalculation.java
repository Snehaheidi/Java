package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeCalculation {
	static String DB_URL = "jdbc:mysql://localhost/Hospital";
	static final String USER = "root";
	static final String PASS = "root";
	
	public static void waitTime(int p_id,String patientName, String phNo, String inTime){
		Scanner scanner = new Scanner(System.in);
		int doctorTime = 0 , min = 0;
		int waitTime = 0 , pharmacy = 5 , reception = 10 ;
		int minDocTime = 2 , maxDocTime = 20;
		//doctorTime = (int) ((Math.random()*maxDocTime-minDocTime+1)+minDocTime);
		//********************************** 
		System.out.println("Enter Doctor Time : ");
		doctorTime = scanner.nextInt();
		 
		//	   System.out.println("Doctor Time : "+doctorTime);
		int totalTimeTaken = reception + doctorTime + pharmacy ; 
		//	   System.out.println("Total Time : "+totalTimeTaken);
		min = maxDocTime/2;
		if(min<doctorTime) {
			waitTime = doctorTime - maxDocTime + min;
			System.out.println("Wait_Time : " + waitTime);
			System.out.println("-*-*Sorry For Late*-*- :-(");
		}
		else {
			System.out.println("Wait_Time : "+waitTime);
		}
		String outtime = outTime(inTime,totalTimeTaken);
		System.out.println("OUT_TIME : "+outtime );
		updateDatas(p_id,inTime,doctorTime,outtime,waitTime);
		isInsertRecordRegister(patientName,phNo,inTime,p_id,inTime,doctorTime,outtime,waitTime);
	}
	
	public static String outTime(String inTime,int totalTimeTaken) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime lt = LocalTime.parse(inTime);
		String outtime=df.format(lt.plusMinutes(totalTimeTaken));
		return outtime;
	}
	public static void updateDatas(int p_id,String inTime, int doctorTime, String outtime, int waitTime) {
		boolean flag = HospitalPaitentRegister.isAlreadyExists(p_id);
		if(flag) {
			try {
				Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement statement = connection.createStatement();
				String sql = "UPDATE PATIENT_DETAILS SET IN_TIME='"+inTime+"' WHERE Patient_ID = "+p_id+" ";
				statement.executeUpdate(sql);
				System.out.println("---------------------------------------------");
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		if(flag) {
			try {
				Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement statement = connection.createStatement();
				String sql = "UPDATE TIME_TABLE SET DOCTOR_TIME='"+doctorTime+"', OUT_TIME= '"+outtime+"' , WAITING_TIME= '"+waitTime+"' WHERE Patient_ID = "+p_id+"";
				statement.executeUpdate(sql);
				System.out.println(">>>>>-------------------------------<<<<<<");
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
	public static void isInsertRecordRegister(String patientName, String phNo, String time, int p_id, String inTime, int doctorTime, String outtime, int waitTime) {
		boolean flag = HospitalPaitentRegister.isAlreadyExists(p_id);
		if(!flag) {
			try {
				Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
				Statement statement = connection.createStatement();
				String sql = "INSERT INTO Hospital.PATIENT_DETAILS (Patient_Name,phNo,In_Time) VALUES ('"+patientName+"','"+phNo+"','"+time+"')";
				statement.executeUpdate(sql);
				System.out.println(">>>>>Add to Record<<<<<<");
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}
       }
		int id=0;
		PreparedStatement statement1;
		try {
			Connection connection1 = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM PATIENT_DETAILS where Patient_Name ='"+patientName+"'";
			statement1 = connection1.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			if(resultSet.next()){
				id = resultSet.getInt("Patient_ID");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	  if(!flag) {
//		  System.out.println(id);
		  try {
		  Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement statement = connection.createStatement();
			String sql1 = "INSERT INTO Hospital.TIME_TABLE (Patient_ID,DOCTOR_TIME,OUT_TIME,WAITING_TIME) VALUES ('"+id+"','"+doctorTime+"','"+outtime+"','"+waitTime+"')";
			statement.executeUpdate(sql1);
			System.out.println(">>>>>-------------------------------<<<<<<");
		  }catch (SQLException e) {
				e.printStackTrace();
			}
	  }
	}
}