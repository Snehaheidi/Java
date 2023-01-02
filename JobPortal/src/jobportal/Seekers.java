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
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
}