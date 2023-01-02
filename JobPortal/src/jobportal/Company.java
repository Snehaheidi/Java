package jobportal;

import java.util.*;

public class Company implements ProfileView{
	private String mail_id,com_name,place,pass,role,date,experience,skils,no_of_vacancy;
	private AdminPage a = new AdminPage();
	public void companyJobPortal() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)Login \t2)Register \t3)Exit");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the Mail_id : ");
			scanner.nextLine();
			mail_id = scanner.nextLine();
			System.out.println("Enter the Password : ");
			pass = scanner.nextLine();
			CompanyPojo c = new CompanyPojo(mail_id,pass);
			if(a.companyLogin(c)) {
				login(mail_id,pass);
			}else {
				System.out.println("enter the correct password & mailid");
				companyJobPortal();
			}
			companyJobPortal();
			break;
		case 2:
			register();
			companyJobPortal();
			break;
		case 3:
			MainClass m= new MainClass();
			m.start();
			break;	
		default:
			System.out.println("Enter Correct Option..");
			companyJobPortal();
		}
	}
	private void addJobPost() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Company Name : ");
		com_name = scanner.nextLine();
		System.out.println("Mail id : ");
		mail_id = scanner.nextLine();
		System.out.println("Job Role : ");
		role= scanner.nextLine();
		System.out.println("Date (yy-mm-dd) :");
		date = scanner.nextLine();
		System.out.println("Skils : ");
		skils = scanner.nextLine();
		System.out.println("Experience : ");
		experience = scanner.nextLine();
		System.out.println("No Of Vacanacy");
		no_of_vacancy = scanner.nextLine();
		CompanyPojo com = new CompanyPojo(com_name,mail_id,role,date,skils,experience,no_of_vacancy);
		if(a.postJob(com)) {
			System.out.println("success post..");
		}
		else {
			System.out.println("Enter Proper Details");
			addJobPost();
		}
	}
	@Override
	public void login(String mail_id,String pass) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)ViewProfile  \t2)Post Job \t3)Feedback \t4).LogOut");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			viewProfile(mail_id);
			login(mail_id,pass);
			break;
		case 2:
			addJobPost();
			login(mail_id,pass);
		case 3:
			feedback();
			login(mail_id,pass);
			break;
		case 4:
			System.out.println("logout success");
			companyJobPortal();
		default:
			System.out.println("Enter Correct Option..");
			login(mail_id,pass);
		}
	}
	@Override
	public void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Mail_id :");
		scanner.nextLine();
		mail_id = scanner.nextLine();
		System.out.println("Enter the Company Name : ");
		com_name = scanner.nextLine();
		System.out.println("Enter the Place : ");
		place = scanner.nextLine();
		System.out.println("Enter the New Password : ");
		pass = scanner.nextLine();
		System.out.println("Enter the Confirm Password : ");
		String conpass = scanner.nextLine();
		if(pass.equals(conpass)) {
			CompanyPojo c = new CompanyPojo(mail_id,com_name,place,pass);
			if(a.addPermissionCompany(c)) {
				System.out.println("Register Successful..");
			}
			else {
				System.out.println("Try Again...");
				register();
			}
		}
		else {
			System.out.println("Enter the Correct Password");
			register();
		}
	}
	@Override
	public void viewProfile(String mail_id) {		

	}
	@Override
	public void feedback() {

	}
}