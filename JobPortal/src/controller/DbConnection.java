package controller;

import java.sql.*;

public class DbConnection {
	private final String USER="root",PASS= "root";
	private String DB_URL="jdbc:mysql://localhost/";
	Connection con = null;
	PreparedStatement statement = null;
	Statement st = null;
	ResultSet rs= null;
	public static void main(String[] args) {
		DbConnection db = new DbConnection();
		//		db.createDataBase();
		//   	db.createTableJobSeeker();
		//   	db.createTableCompany();
		//      db.jobPost();
	    //		db.createApplyJob();
	}

	private void createApplyJob() {
		try {
			DB_URL += "JobPortal";
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			st = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS APPLY_JOBS(Apply_Id INTEGER(10) AUTO_INCREMENT NOT NULL,Job_id INTEGER(20)NOT NULL,Job_seeker_id INTEGER(20)NOT NULL,PRIMARY KEY(Apply_Id),FOREIGN KEY(Job_id) REFERENCES Job_post(Job_Id),FOREIGN KEY(Job_Seeker_id) REFERENCES JobSeekers(JobSeeker_Id))";
			st.executeUpdate(sql);
			System.out.println("table create successfully..");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				con = null;
				st.close();
				st = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	   
		}
		
	}

	private void createDataBase() {
		try {
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			st= con.createStatement();
			String sql = "CREATE DATABASE JobPortal";
			if(st.executeUpdate(sql)==1) {
				System.out.println("DataBase successfully created...");
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
				con = null;
				st.close();
				st = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	   
		}
	}
	private void createTableJobSeeker() {
		DB_URL += "JobPortal";
		try {
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			st = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS JOBSEEKERS(JobSeeker_Id INTEGER(10) AUTO_INCREMENT NOT NULL,NAME VARCHAR(50) NOT NULL,MAIL_ID VARCHAR(50)NOT NULL,DOB DATE NOT NULL,COLLEGE_NAME VARCHAR(50)NOT NULL,DEGREE VARCHAR(10)NOT NULL,EXPERIENCE INTEGER(10)NOT NULL,COMPANY_NAME VARCHAR(40),ROLE VARCHAR(30),PRIMARY KEY(JobSeeker_Id),UNIQUE KEY(MAIL_ID))";
			st.executeUpdate(sql);
			System.out.println("table create successfully..");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private void createTableCompany() {
		DB_URL += "JobPortal";
		try {
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			st = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS COMPANYS_Details(COMPANY_Id INTEGER(10) AUTO_INCREMENT NOT NULL,COMPANY_NAME VARCHAR(60)NOT NULL,MAIL_ID VARCHAR(60)NOT NULL,PLACE VARCHAR(20),PASSWORD VARCHAR(50) NOT NULL,PRIMARY KEY(COMPANY_Id),UNIQUE KEY(MAIL_ID))";
			st.executeUpdate(sql);
			System.out.println("Table created");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private void jobPost() {
		DB_URL += "JobPortal";
		try {
			con = DriverManager.getConnection(DB_URL,USER,PASS);
			st = con.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS JOB_POST (Job_Id INTEGER(10)AUTO_INCREMENT NOT NULL,COMPANY_NAME VARCHAR(60)NOT NULL,MAIL_ID VARCHAR(60)NOT NULL,JOB_ROLE VARCHAR(60)NOT NULL,DATE_OF DATE NOT NULL,SKILS VARCHAR(50),EXPERIENCE VARCHAR(10)NOT NULL,NO_OF_VAC VARCHAR(10)NOT NULL,PRIMARY KEY(Job_Id),FOREIGN KEY (MAIL_ID) REFERENCES COMPANYS_Details(MAIL_ID))";
			st.executeUpdate(sql);
			System.out.println("Job-Post Table created ");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
