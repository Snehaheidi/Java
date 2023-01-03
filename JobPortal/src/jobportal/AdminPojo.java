package jobportal;

public class AdminPojo {
	private String com_name,mail_id,role,date,skils,experience,no_of_vacancy,place;
	private int com_id,job_id;
	private String seeker_name,dob,college_name,degree,exp;
	private int seeker_id;
	public AdminPojo(int job_id,String com_name,String mail,String role, String date, String skils, String experience,String no_of_vacancy) {
		this.job_id = job_id;
		this.com_name = com_name;
		this.mail_id = mail;
		this.role = role;
		this.date = date;
		this.skils = skils;
		this.experience = experience;
		this.no_of_vacancy = no_of_vacancy;
	}
	public AdminPojo(int id, String com_name, String mail, String place) {
		this.com_id = id;
		this.com_name = com_name;
		this.mail_id = mail;
		this.place = place;
	}
	public AdminPojo(int id, String seeker_name, String mail, String dob, String college_name, String degree,String exp, String com_name, String role) {
		this.seeker_id = id;
		this.seeker_name = seeker_name;
		this.mail_id = mail;
		this.dob = dob;
		this.college_name = college_name;
		this.degree = degree;
		this.exp = exp;
		this.com_name = com_name;
		this.role = role;
	}
	public AdminPojo(String name, String mail_id, String degree, String exp, String role, String skils) {
		this.seeker_name = name;
		this.mail_id = mail_id;
		this.degree = degree;
		this.exp = exp;
		this.role = role;
		this.skils = skils;
	}
	public int getCom_id() {
		return com_id;
	}
	public String getSeeker_name() {
		return seeker_name;
	}
	public String getDob() {
		return dob;
	}
	public String getCollege_name() {
		return college_name;
	}
	public String getDegree() {
		return degree;
	}
	public String getExp() {
		return exp;
	}
	public int getSeeker_id() {
		return seeker_id;
	}
	public String getPlace() {
		return place;
	}
	public int getComId() {
		return com_id;
	}
	public String getCom_name() {
		return com_name;
	}
	public String getMail_id() {
		return mail_id;
	}
	public String getRole() {
		return role;
	}
	public String getDate() {
		return date;
	}
	public String getSkils() {
		return skils;
	}
	public String getExperience() {
		return experience;
	}
	public String getNo_of_vacancy() {
		return no_of_vacancy;
	}
	public int getJob_id() {
		return job_id;
	}
}
