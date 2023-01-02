package jobportal;

public class Seekers {
	private String name,dob,collegeName,degree,companyName,role,mail;
	private int exp;
	
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
}