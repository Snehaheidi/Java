package jobportal;

public class CompanyPojo {
	private String mail_id=null,com_name=null,place=null,pass = null;
	private String date=null,skils=null,experience=null,no_of_vacancy=null,role=null;
	public CompanyPojo(String mail_id,String com_name,String place,String pass) {
		this.mail_id = mail_id;
		this.com_name = com_name;
		this.place = place;
		this.pass = pass;
	}
	public CompanyPojo(String mail_id, String pass) {
		this.mail_id = mail_id;
		this.pass = pass;
	}
	public CompanyPojo(String com_name, String mail_id,String role, String date, String skils, String experience,String no_of_vacancy) {
		this.com_name = com_name;
		this.mail_id = mail_id;
		this.role = role;
		this.date = date;
		this.skils = skils;
		this.experience = experience;
		this.no_of_vacancy = no_of_vacancy;
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
	public String getRole() {
		return role;
	}
	public String getMail_id() {
		return mail_id;
	}
	public String getCom_name() {
		return com_name;
	}
	public String getPlace() {
		return place;
	}
	public String getPass() {
		return pass;
	}
}