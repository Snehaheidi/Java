package hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
//  String DB_URL = "jdbc:mysql://localhost/";
//	String USER = "root";
//	String PASS = "root";
//	String DB_NAME = "HospitalManagement";
//	 Connection connection = DriverManager.getConnection(DB_URL+DB_NAME,USER,PASS);
    public void insert(Patient p) throws ClassNotFoundException, SQLException{
 
    	Connection connection = connectionDataBase();
    		String insertQuery = "INSERT INTO PATIENT_DETAILS (Patient_Name,phNo) VALUES (?,?)";
    		try {
    			PreparedStatement statement = connection.prepareStatement(insertQuery);
    			statement.setString(1, p.getpName());
    			statement.setString(2, p.getPhNo());
    			statement.executeUpdate();
    			System.out.println(">>>>>Add to Record<<<<<<");
    		}
    		catch(SQLException e) {
    			e.printStackTrace();
    		}
//    		int id=0;
//    		PreparedStatement statement1;
//    		try {
//    			
//    			String sql = "SELECT * FROM PATIENT_DETAILS where Patient_Name ='"+p.getpName()+"'";
//    			statement1 = connection.prepareStatement(sql);
//    			ResultSet resultSet = statement1.executeQuery(sql);
//    			if(resultSet.next()){
//    				id = resultSet.getInt("Patient_ID");
//    			}
//    		}catch(SQLException e) {
//    			e.printStackTrace();
//    		}
//    		  try {
//    			
//    				Statement statement = connection.createStatement();
//    				String sql1 = "INSERT INTO TIME_TABLE (Patient_ID) VALUES ("+id+")";
//    				statement.executeUpdate(sql1);
//    				System.out.println(">>>>>-------------------------------<<<<<<");
//    			  }catch (SQLException e) {
//    					e.printStackTrace();
//    			  }
    				
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
    public int findPatientId(String phNo) throws SQLException {
   	 int id = 0;
  	Connection connection = connectionDataBase();
  	try {
  		String sql = "SELECT * FROM PATIENT_DETAILS Where phNo = "+phNo+";";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			if(resultSet.next()){
				id = resultSet.getInt("Patient_ID");
				return id;	
			}
//				Patient p1 = new Patient(id1,p_Name,phNo,inTime);	
  	}
  	catch(SQLException e) {
  		e.printStackTrace();
  	}
     return id;	
    }
     public boolean select(int pId,String phNo) throws SQLException {
    	 System.out.println("----------login success dbms Method-----------");
     	Connection connection = connectionDataBase();
     	try {
     		String sql = "SELECT * FROM PATIENT_DETAILS Where Patient_Id = "+pId+" ";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			ResultSet resultSet = statement1.executeQuery(sql);
			while(resultSet.next()){
				int id = resultSet.getInt("Patient_ID");
				String phNo1 = resultSet.getString("phNo");
				if(id==pId && phNo.equals(phNo1)) {
					return true;
				}
//				Patient p1 = new Patient(id1,p_Name,phNo,inTime);	
     	 } 
		return false;		
     	}
     	catch(SQLException e) {
     		e.printStackTrace();
     	}
     	return false;	 
     }
     public static boolean update(Patient p) throws SQLException {
         boolean flag = true;
    	 Connection connection = connectionDataBase();
 		if(flag) {
 			try {
 				Statement statement = connection.createStatement();
 				String sql = "UPDATE PATIENT_DETAILS SET IN_TIME='"+p.getInTime()+"' WHERE Patient_ID = "+p.getpId()+" ";
 				statement.executeUpdate(sql);
 				System.out.println("----------------table-1 Update Successful-------------------");
 			}
 			catch(SQLException e){
 				e.printStackTrace();
 			}
 			try {
				String sql = "Insert into TIME_TABLE (Patient_ID,DOCTOR_TIME,OUT_TIME,WAITING_TIME) Values (?,?,?,?);";
				PreparedStatement ps=connection.prepareStatement(sql);
				ps.setInt(1,p.getpId());
				ps.setInt(2,p.getDocTime());
				ps.setString(3,p.getOutTime());
				ps.setInt(4,p.getWaitTime());			
				ps.executeUpdate();
				System.out.println(">>>>>------------2nd table update----------------<<<<<<");
				return true;
			}
			catch(SQLException e){
				e.printStackTrace();
			}
 		}
 		return false;
     }
}
