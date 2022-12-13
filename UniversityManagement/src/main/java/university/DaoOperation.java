package university;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DaoOperation {	
	public static Connection connectionDataBase() throws SQLException {
		String DB_URL = "jdbc:mysql://localhost/UniversityManagement";
		String USER = "root";
		String PASS = "root";
		Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
		return connection; 
	}
	public static boolean insertStud(Student s) throws SQLException {
		Connection connection = connectionDataBase();
		String insertQuery = "INSERT INTO STUDENTDETAILS (STUDENT_NAME,ROLLNO,DOB,PHONE_NUMBER,EMAIL_ID,CITY) VALUES (?,?,?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, s.getStudName());
			statement.setString(2, s.getStudrollNo());
			statement.setString(3, s.getStuddob());
			statement.setString(4, s.getStudphNo());
			statement.setString(5, s.getStudemail());
			statement.setString(6, s.getStudcity());
			statement.executeUpdate();
			System.out.println(">>>>>Add to Record<<<<<<");
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Boolean insertFac(Faculty f) throws SQLException {
		Connection connection = connectionDataBase();
		String insertQuery = "INSERT INTO FACULTY_DETAILS (FACULTY_NAME,DOB,PHONE_NUMBER,EMAIL_ID,COLLEGE_NAME,COURSE,CITY) VALUES (?,?,?,?,?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(insertQuery);
			statement.setString(1, f.getFacname());
			statement.setString(2, f.getFacdob());
			statement.setString(3, f.getFacphNo());
			statement.setString(4, f.getFacemail());
			statement.setString(5,f.getFacCollege());
			statement.setString(6, f.getFacCourse());
			statement.setString(7, f.getFaccity());
			statement.executeUpdate();
			System.out.println(">>>>>Faculty Add to Record<<<<<<");
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean findId(String name,String pass) {

		return false;
	}

	public static boolean validateStudId(String name, String rollNo) throws SQLException {
		Connection connection = connectionDataBase();
		String selectQuery = "Select * from STUDENTDETAILS where STUDENT_NAME = '"+name+"' AND ROLLNO = '"+rollNo+"' ";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(selectQuery);
			if(rs.next()) {
				System.out.println("login data "+name+" - "+rollNo);
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static boolean validateFacId(String name, String rollNo) throws SQLException {
		Connection connection = connectionDataBase();
		String selectQuery = "Select * from FACULTY_DETAILS where FACULTY_NAME = '"+name+"' AND EMAIL_ID = '"+rollNo+"' ";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(selectQuery);
			if(rs.next()) {
				System.out.println("login data "+name+" - "+rollNo);
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public static ArrayList<Faculty> viewFac() throws SQLException {
		ArrayList<Faculty> fac = new ArrayList<Faculty>();
		Connection connection = connectionDataBase();
		String selectQuery = "SELECT * FROM FACULTY_DETAILS";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(selectQuery);
			while(rs.next()) {
				String fac_name = rs.getString("faculty_name");
				String dob=rs.getString("dob");
				String phNo=rs.getString("phone_number");
				String email =rs.getString("email_id");
				String collegename = rs.getString("college_name");
				String course = rs.getString("course");
				String city =rs.getString("city");
				Faculty f = new Faculty(fac_name,dob,phNo,email,collegename,course,city);
				fac.add(f);
			}
			return fac; 
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return fac;
	}
	public static ArrayList<Student> viewStud() throws SQLException {
		ArrayList<Student> stud = new ArrayList<Student>();
		Connection connection = connectionDataBase();
		String selectQuery = "SELECT * FROM STUDENTDETAILS";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(selectQuery);
			while(rs.next()) {
				String id =rs.getString("student_id");
				String stud_name = rs.getString("student_name");
				String rollNo= rs.getString("rollno");
				String dob=rs.getString("dob");
				String phNo=rs.getString("phone_number");
				String email =rs.getString("email_id");
				String city =rs.getString("city");
				Student s = new Student(id,stud_name,rollNo,dob,phNo,email,city);
				stud.add(s);
			}
			return stud;
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return stud;
	}
	public static boolean studDelete(String pass) throws SQLException {

		Connection connection = connectionDataBase();
		String deleteQuery = "DELETE FROM STUDENTDETAILS where ROLLNO='"+pass+"'";
		String checkQuery="Select * from STUDENTDETAILS WHERE ROLLNO='"+pass+"'";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs=statement.executeQuery(checkQuery);
			if(rs.next()) {
				statement.executeUpdate(deleteQuery);
				System.out.println("Student record Successfully deleted");
		        return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}
	public static boolean facdelete(String pass) throws SQLException {
		Connection connection = connectionDataBase();
		String deleteQuery = "DELETE FROM FACULTY_DETAILS where email_id='"+pass+"'";
		String checkQuery="Select * from FACULTY_DETAILS WHERE email_id='"+pass+"'";
		try {
			Statement statement = connection.createStatement();
			ResultSet rs=statement.executeQuery(checkQuery);
			if(rs.next()) {
				statement.executeUpdate(deleteQuery);
				System.out.println("Faculty record Successfully deleted");
		        return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}
}
