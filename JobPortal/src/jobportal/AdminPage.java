package jobportal;

import java.util.*;

public class AdminPage {
	private String admin_name="",admin_pass="";
	private DaoOperation d = new DaoOperation();
	public AdminPage() {

	}
	public AdminPage(String admin_id, String pass) {
		this.admin_name = admin_id;
		this.admin_pass = pass;
	}
	public void admin() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		admin_name= scanner.nextLine();
		System.out.println("Enter the password");
		admin_pass = scanner.nextLine();
		if(!admin_name.equals(" ") || !admin_pass.equals(" ")) {
			if(admin_name.equals("admin") && admin_pass.equals("admin")) {
				option();
			}
		}
		else {
			System.out.println("please Enter the Id & password");
			admin();
		}
	}
	private void option() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)Company \t 2)JobSeekers \t 3)Logout");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			company();
			break;
		case 2:
			seekers();
			break;
		case 3: 
			System.out.println("Logout Succesfully..");
			MainClass m = new MainClass();
			m.start();
		default:
			System.out.println("Enter the Correct Option..");
			option();
		}
	}
	private void seekers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)View ALLJobSeekers \t 2)Back");
		int c = scanner.nextInt();
		switch(c) {
		case 1:
			viewAllJobSeekers();
			seekers();
			break;
		case 2:
			option();
			break;
		default:
			System.out.println("Enter the Correct Option..");
			seekers();
		}
	}
	private void viewAllJobSeekers() {
		ArrayList<AdminPojo> seekers = d.viewAllSeekers();
		if(!seekers.isEmpty()) {
			for(AdminPojo a : seekers) {
				System.out.println("JobSeeker id  : "+a.getSeeker_id());
				System.out.println("Jobseeker Name : "+a.getSeeker_name());
				System.out.println("Mail_id : "+a.getMail_id());
				System.out.println("Date of Birth : "+a.getDob());
				System.out.println("Collge Name : "+a.getCollege_name());
				System.out.println("Degree : "+a.getDegree());
				System.out.println("Experience : "+a.getExp());
				System.out.println("Company Name : "+a.getCom_name());
				System.out.println("Role : "+a.getRole());
				System.out.println("---------------------------------------"); 
			}			
		}
		else {
			System.out.println("No record found...");
			seekers();
		}
	}
	private void company() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)View All CompanyJobPortal \t 2)Back");
		int c = scanner.nextInt();
		switch(c) {
		case 1:	  
			viewAllCompany();
			company();
			break;
		case 2:
			option();
			break;
		}
	}
	private void viewAllCompany() {
		ArrayList<AdminPojo> company =  d.viewAllCompany();
		if(!company.isEmpty()) {
			for(AdminPojo a : company) {
				System.out.println("ComPany Id : "+a.getComId());
				System.out.println("Company Name : "+a.getCom_name());
				System.out.println("Company Mail_id : "+a.getMail_id());
				System.out.println("Place : "+a.getPlace());
				System.out.println("---------------------------------");
			}	   
		}
		else {
			System.out.println("No record found...");
			company();
		}
	}
	public boolean addPermissionJobSeekers(Seekers seeker) {	
		if(d.addPermissionJobSeekers(seeker)) {
			System.out.println("\n ...JobSeeker Account Create Successfully...!");
			return true;
		}
		else{
			return false;
		}
	}
	public int loginSeeker(Seekers j) {
		int i = d.loginSeeker(j);
		if(i!=0) {
			return i;
		}
		return 0;
	}
	public AdminPojo viewJobSeekerProfile(String mail) {
		AdminPojo a = d.viewProfileJobSeeker(mail);
		if(a!=null) {
			return a;
		}
		return a;
	}
	public ArrayList<AdminPojo> realtedJob(String mail) {
		ArrayList<AdminPojo> a = d.realtedJob(mail);
		if(!a.isEmpty()) {
			return a;
		}
		return a;
	}

	public boolean addPermissionCompany(CompanyPojo c) {
		if(d.addPermissionCompany(c)) {
			System.out.println("\n ....Company Account Create Successfully...!");
			return true;
		}
		return false;
	}
	public boolean companyLogin(CompanyPojo c) {
		if(d.loginCompany(c)) {
			System.out.println("..Login Successfully..");
			return true;
		}
		return false;
	}
	public boolean postJob(CompanyPojo com) {
		if(d.addpostJob(com)) {
			System.out.println("\n ....Job Post Successfully...!");
			return true;
		}
		return false;
	}
	public AdminPojo viewCompanyProfile(String mail_id) {
		AdminPojo a = d.viewProfileCompany(mail_id);
		if(a!=null) {
			return a;
		}
		return a;
	}
	public boolean applyJob(Seekers j) {
		if(d.applyJob(j)) {
			return true;
		}
		return false;
	}
	public ArrayList<AdminPojo> appliedJobView(CompanyPojo c) {
		ArrayList<AdminPojo> appliedlist =  d.viewAppliedList(c);
		if(!appliedlist.isEmpty()) {
			return appliedlist;
		}
		return appliedlist;
	}
}