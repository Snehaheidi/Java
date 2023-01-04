package jobportal;

public class Seekers {
	private String name,dob,collegeName,degree,companyName,role,mail,mailid;
	private int exp,job_id,seekerId;
	
	public Seekers() {
		
	}
	public Seekers(String name,String mail,String dob, String collegeName, String degree, int exp, String companyName, String role) {
		this.name = name;
		this.mail = mail;
		this.dob = dob;
		this.collegeName = collegeName;
		this.companyName = companyName;
		this.degree = degree;
		this.exp = exp;
		this.companyName = companyName;
		this.role = role;
	}
	public Seekers(String name, String mail) {
		this.name = name;
		this.mail = mail;
	}
	public Seekers(String mailid, int job_id, String mail) {
		this.mailid = mailid;
		this.job_id = job_id;
		this.mail = mail;
	}
	public Seekers(int seekerid, int job_id) {
		this.seekerId = seekerid;
		this.job_id = job_id;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public String getDegree() {
		return degree;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getRole() {
		return role;
	}
	public String getMail() {
		return mail;
	}
	public int getExp() {
		return exp;
	}
	public String getMailid() {
		return mailid;
	}
	public int getJob_id() {
		return job_id;
	}
	public int getSeekerId() {
		return seekerId;
	}
}