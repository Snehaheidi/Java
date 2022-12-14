package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.AdminPojo;
import model.CompanyPojo;
import model.SeekersPojo;

public class DaoOperation {
	private final String USER="root",PASS= "root";
	private final String DB_URL="jdbc:mysql://localhost/JobPortal";
	private Connection connection = null;
	private PreparedStatement preparestatement = null;
	private Statement statement = null;
	private ResultSet resultSet= null;
	private ArrayList<AdminPojo> seeker = new ArrayList<AdminPojo>();
	private ArrayList<AdminPojo> company =new ArrayList<AdminPojo>(); 
	private ArrayList<AdminPojo> relatedJob = new ArrayList<AdminPojo>();
	private ArrayList<AdminPojo> applylist = new ArrayList<AdminPojo>();
	public int loginSeeker(SeekersPojo j){
		int id = 0;
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM JOBSEEKERS WHERE MAIL_ID = ?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, j.getMail());
			resultSet = preparestatement.executeQuery();
			if(resultSet.next()) {
				String mail = resultSet.getString("MAIL_ID");
				if(mail.equals(j.getMail())) {
					id = resultSet.getInt("JobSeeker_Id");
					return id;
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return id;
		}
		return id;
	}
	public boolean addPermissionJobSeekers(SeekersPojo seeker) {
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "INSERT INTO JOBSEEKERS (NAME,MAIL_ID,DOB,COLLEGE_NAME,DEGREE,EXPERIENCE,COMPANY_NAME,ROLE) VALUES (?,?,?,?,?,?,?,?)";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, seeker.getName());
			preparestatement.setString(2, seeker.getMail());
			preparestatement.setString(3, seeker.getDob());
			preparestatement.setString(4, seeker.getCollegeName());
			preparestatement.setString(5, seeker.getDegree());
			preparestatement.setInt(6, seeker.getExp());
			preparestatement.setString(7, seeker.getCompanyName());
			preparestatement.setString(8, seeker.getRole());
			if(preparestatement.executeUpdate()==1) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return false;
	}
	public boolean addPermissionCompany(CompanyPojo c) {
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "INSERT INTO COMPANYS_Details (COMPANY_NAME,MAIL_ID,PLACE,PASSWORD) VALUES (?,?,?,?)";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1,c.getCom_name());
			preparestatement.setString(2, c.getMail_id());
			preparestatement.setString(3, c.getPlace());
			preparestatement.setString(4, c.getPass());
			if(preparestatement.executeUpdate()==1) {
				return true;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return false;
	}  
	public boolean loginCompany(CompanyPojo c) {
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);			
			String sql = "SELECT * FROM COMPANYS_Details WHERE MAIL_ID = ?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, c.getMail_id());
			resultSet = preparestatement.executeQuery();
			if(resultSet.next()) {
				String mail = resultSet.getString("MAIL_ID");
				if(mail.equals(c.getMail_id())) {
					return true;
				}
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return false;
	}

	public AdminPojo viewProfileJobSeeker(String mail) {
		AdminPojo a = null;
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM JOBSEEKERS WHERE MAIL_ID = ?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, mail);
			resultSet = preparestatement.executeQuery();
			if(resultSet.next()) {
				int id = resultSet.getInt("JobSeeker_Id");
				String seeker_name = resultSet.getString("NAME");
				String mail1 = resultSet.getString("MAIL_ID");
				String dob = resultSet.getString("DOB");
				String college_name = resultSet.getString("COLLEGE_NAME");
				String degree = resultSet.getString("DEGREE");
				String exp = resultSet.getString("EXPERIENCE");
				String com_name = resultSet.getString("COMPANY_NAME");
				String role = resultSet.getString("ROLE");
				a = new AdminPojo(id,seeker_name,mail1,dob,college_name,degree,exp,com_name,role);
				return a;
			}		
		}
		catch(SQLException e) {
			e.printStackTrace();
			return a;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return a;
	}

	public ArrayList<AdminPojo> realtedJob(String mail) {
		AdminPojo a = null;
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM JOBSEEKERS WHERE MAIL_ID = ?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, mail);
			resultSet = preparestatement.executeQuery();
			if(resultSet.next()) {
				//System.out.println("mail id : "+resultSet.getString("MAIL_ID"));
				int exp = resultSet.getInt("EXPERIENCE");
				if(exp<1) {
					String degree = resultSet.getString("DEGREE");
					if(degree.equals("BCA") || degree.equals("CSE") || degree.equals("BSC IT") || degree.equals("MCA") || degree.equals("BSC CS")){ 
						try {
							connection = DriverManager.getConnection(DB_URL,USER,PASS);
							String sql1 ="SELECT * FROM JOB_POST";
							statement = connection.createStatement();
							resultSet = statement.executeQuery(sql1);
							while(resultSet.next()) {
								String role = resultSet.getString("JOB_ROLE");
								if(role.equals("software developer")){
									int job_id = resultSet.getInt("Job_Id");
									String com_name = resultSet.getString("COMPANY_NAME");
									String mail1 = resultSet.getString("MAIL_ID");
									String jobRole = resultSet.getString("JOB_ROLE");
									String date = resultSet.getString("DATE_OF");
									String skils = resultSet.getString("SKILS");
									String exper = resultSet.getString("EXPERIENCE");
									String no_of_vac = resultSet.getString("NO_OF_VAC");
									a = new AdminPojo(job_id,com_name,mail1,jobRole,date,skils,exper,no_of_vac);
									relatedJob.add(a);
								}		
							}
							return relatedJob;
						}
						catch(SQLException e) {
							e.printStackTrace();
							return relatedJob;
						}
					}
					return relatedJob;
				}
				else {
					try {
						connection = DriverManager.getConnection(DB_URL,USER,PASS);
						String sql1 ="SELECT * FROM JOB_POST";
						statement = connection.createStatement();
						resultSet = statement.executeQuery(sql1);
						while(resultSet.next()) {
							String role = resultSet.getString("JOB_ROLE");
							if(role.equals("software developer")){
								int job_id = resultSet.getInt("Job_Id");
								String com_name = resultSet.getString("COMPANY_NAME");
								String mail1 = resultSet.getString("MAIL_ID");
								String jobRole = resultSet.getString("JOB_ROLE");
								String date = resultSet.getString("DATE_OF");
								String skils = resultSet.getString("SKILS");
								String exper = resultSet.getString("EXPERIENCE");
								String no_of_vac = resultSet.getString("NO_OF_VAC");
								a = new AdminPojo(job_id,com_name,mail1,jobRole,date,skils,exper,no_of_vac);
								relatedJob.add(a);
							}		
						}
						return relatedJob;
					}
					catch(SQLException e) {
						e.printStackTrace();
						return relatedJob;
					}	
				}
			}		
		}
		catch(SQLException e) {
			e.printStackTrace();
			return relatedJob;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return relatedJob;
	}

	public boolean addpostJob(CompanyPojo com) {
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "INSERT INTO JOB_POST (COMPANY_NAME,MAIL_ID,JOB_ROLE,DATE_OF,SKILS,EXPERIENCE,NO_OF_VAC) VALUES (?,?,?,?,?,?,?)";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, com.getCom_name());
			preparestatement.setString(2, com.getMail_id());
			preparestatement.setString(3, com.getRole());
			preparestatement.setString(4, com.getDate());
			preparestatement.setString(5, com.getSkils());
			preparestatement.setString(6, com.getExperience());
			preparestatement.setString(7, com.getNo_of_vacancy());
			if(preparestatement.executeUpdate()==1) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return false;
	}

	public ArrayList<AdminPojo> viewAllCompany() {
		AdminPojo a = null;
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);			
			String sql = "SELECT * FROM COMPANYS_Details";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				int id = resultSet.getInt("COMPANY_ID");
				String com_name = resultSet.getString("COMPANY_NAME");
				String mail = resultSet.getString("MAIL_ID");
				String place = resultSet.getString("PLACE");
				a = new AdminPojo(id,com_name,mail,place);
				company.add(a);
			}
			return company;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return company;
		}
		finally {
			try {
				connection.close();
				connection = null;
				statement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	public ArrayList<AdminPojo> viewAllSeekers() {
		AdminPojo a = null;
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);			
			String sql = "SELECT * FROM JOBSEEKERS";
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				int id = resultSet.getInt("JobSeeker_Id");
				String seeker_name = resultSet.getString("NAME");
				String mail = resultSet.getString("MAIL_ID");
				String dob = resultSet.getString("DOB");
				String college_name = resultSet.getString("COLLEGE_NAME");
				String degree = resultSet.getString("DEGREE");
				String exp = resultSet.getString("EXPERIENCE");
				String com_name = resultSet.getString("COMPANY_NAME");
				String role = resultSet.getString("ROLE");
				a = new AdminPojo(id,seeker_name,mail,dob,college_name,degree,exp,com_name,role);
				seeker.add(a);
			}
			return seeker;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return seeker;
		}
		finally {
			try {
				connection.close();
				connection = null;
				statement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	public AdminPojo viewProfileCompany(String mail_id) {
		AdminPojo a = null;
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM COMPANYS_DETAILS WHERE MAIL_ID = ?";
			preparestatement = connection.prepareStatement(sql);
			preparestatement.setString(1, mail_id);
			resultSet = preparestatement.executeQuery();
			if(resultSet.next()) {
				int id = resultSet.getInt("COMPANY_ID");
				String com_name = resultSet.getString("COMPANY_NAME");
				String mail = resultSet.getString("MAIL_ID");
				String place = resultSet.getString("PLACE");
				a = new AdminPojo(id,com_name,mail,place);
				return a;
			}		
		}
		catch(SQLException e) {
			e.printStackTrace();
			return a;
		}
		finally {
			try {
				connection.close();
				connection = null;
				preparestatement.close();
				preparestatement = null;
			} 
			catch (SQLException e) {
				e.printStackTrace();
			}	
		}
		return a;
	}
	public boolean applyJob(SeekersPojo j) {
		try {
			connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql1 = "INSERT INTO APPLY_JOBS(Job_id,Job_seeker_id) VALUES (?,?)";
			preparestatement = connection.prepareStatement(sql1);
			preparestatement.setInt(1,j.getJob_id());
			preparestatement.setInt(2,j.getSeekerId());
			if(preparestatement.executeUpdate()==1) {
				return true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	return false;
}
    public ArrayList<AdminPojo> viewAppliedList(CompanyPojo c) {
	String name=null,mail_id=null,degree=null,exp=null,role=null,skils=null;
	AdminPojo a = null;
	try {
		connection = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql = "SELECT * FROM JOB_POST WHERE Mail_Id = ?";
		preparestatement = connection.prepareStatement(sql);
		//System.out.println(""+c.getMail_id());
		preparestatement.setString(1, c.getMail_id());
		resultSet = preparestatement.executeQuery();
		if(resultSet.next()) {
			String com_name = resultSet.getString("COMPANY_NAME");
			try {
				String sql1 = "SELECT a.apply_id,j.JOB_ROLE,j.SKILS,s.MAIL_ID,s.DEGREE,s.EXPERIENCE,s.NAME FROM apply_jobs a left join job_post j ON a.Job_id=j.Job_Id  LEFT JOIN jobseekers s ON a.Job_seeker_id=s.JobSeeker_Id WHERE j.COMPANY_NAME=?";
				preparestatement = connection.prepareStatement(sql1);
				preparestatement.setString(1, com_name);
				resultSet = preparestatement.executeQuery();
				while(resultSet.next()) {
					name = resultSet.getString("NAME");
					mail_id = resultSet.getString("MAIL_ID");
					degree = resultSet.getString("DEGREE");
					exp = resultSet.getString("EXPERIENCE");
					role = resultSet.getString("JOB_ROLE");
					skils = resultSet.getString("SKILS");
					a = new AdminPojo(name,mail_id,degree,exp,role,skils); 
					applylist.add(a);
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
				return null;
			}
			return applylist;
		}
		return applylist;
	}
	catch(SQLException e) {
		e.printStackTrace();
		return null;
	}
	finally {
		try {
			connection.close();
			connection = null;
			preparestatement.close();
			preparestatement = null;
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
}
