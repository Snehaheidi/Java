package jobportal;

import java.util.*;

public class JobSeekers implements ProfileView{
	private String name,dob,collegeName,degree,companyName=null,role=null,mail;
	private int exp;
	private AdminPage a = new AdminPage();
	public void jobSeekers() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)Login \t2)Register \t3)Exit");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the Name : ");
			scanner.nextLine();
			name = scanner.nextLine();
			System.out.println("Enter the Mail-Id : ");
			mail = scanner.nextLine();
			login(name,mail);
			break;
		case 2:
			register();
			break;	
		case 3:
			MainClass m = new MainClass();
			m.start();	
			break;
		default:
			System.out.println("Enter the Correct Option.");
			jobSeekers();				
		}
	}
	@Override
	public void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Your Name : ");
		name=scanner.nextLine();
		System.out.println("Enter the Mail-Id : ");
		mail = scanner.nextLine();
		System.out.println("Enter the DOB (yy-mm-dd) : ");
		dob = scanner.nextLine();
		System.out.println("Enter the College Name : ");
		collegeName = scanner.nextLine();
		System.out.println("Enter the Degree : ");
		degree = scanner.nextLine();
		System.out.println("Enter Work Experience : ");
		exp = scanner.nextInt();
		if(exp>0) {
			System.out.println("Enter the Company Name : ");
			scanner.next();
			companyName = scanner.nextLine();
			System.out.println("Enter the Role : ");
			role = scanner.nextLine();
		}
		Seekers seeker = new Seekers(name,mail,dob,collegeName,degree,exp,companyName,role);	
		if(a.addPermissionJobSeekers(seeker)) {
			System.out.println("Now Login....");
			System.out.println("Enter the Name : ");
			scanner.nextLine();
			name = scanner.nextLine();
			System.out.println("Enter the Mail-Id : ");
			mail = scanner.nextLine();
			login(name,mail);
		}
		else{
			System.out.println("Enter correct details..");
			register();
		}
	}
	@Override
	public void login(String name,String mail) {
		Seekers j = new Seekers(name,mail);
		int i = a.loginSeeker(j);
		if(i!=0) {
			System.out.println("Login Success...");
            System.out.println("Your Job-Seeker Id : "+i);
			selectProfile();
		}else{
			System.out.println("Enter the Correct Details..");
			jobSeekers();
		}
	}
	private void selectProfile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" 1)Search Job \t 2)ViewProfile \t#)Response Here\t4)FeedBack \t5)Logout");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			relatedJob(mail);
		case 2:
			viewProfile(mail);
			selectProfile();
			break;
		case 3:
			reponseHere();
			selectProfile();
			break;
		case 4:
			feedback();
			selectProfile();
			break;
		case 5:
			MainClass m = new MainClass();
			m.start();
			break;
		default :
			System.out.println("Enter the Correct Option...");
			selectProfile();
		}
	}
	private void reponseHere() {
		// TODO Auto-generated method stub
		
	}
	private void relatedJob(String mail) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<AdminPojo> a1 = a.realtedJob(mail);
		if(!a1.isEmpty()) {
			for(AdminPojo admin:a1) {
				System.out.println("--------Related Job----------");
				System.out.println("Job-Id : "+admin.getJob_id());
				System.out.println("Company Name : "+admin.getCom_name());
				System.out.println("Contact Mail id : "+admin.getMail_id());
				System.out.println("Role : "+admin.getRole());
				System.out.println("Skils : "+admin.getSkils());
				System.out.println("Experience : "+admin.getExperience());
				System.out.println("No Of Vacancy : "+admin.getNo_of_vacancy());
				System.out.println("Posted Date : "+admin.getDate());
			}	   
		}
		a1.clear();
		applyJob();
	}
	private void applyJob() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)Apply Job \t 2)Back");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			apply();
			applyJob();
		case 2:
			selectProfile();
		default:
			System.out.println("Enter Correct Option..");
			applyJob();
		}       
	}
	private void apply() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Seeker-Id :");
		int seeker_id= scanner.nextInt();
		System.out.println("Enter the Job-Id : ");
		int job_id = scanner.nextInt();
		Seekers j = new Seekers(seeker_id,job_id);
		if(a.applyJob(j)) {
			System.out.println("Apply Job..");
		}
		else {
			System.out.println("can't apply");
		}
	}
	@Override
	public void viewProfile(String mail) {
		AdminPojo a1 = a.viewJobSeekerProfile(mail);
		if(a1!=null) {
			System.out.println("Name : "+a1.getSeeker_name());
			System.out.println("Date OF Birth : "+a1.getDob());
			System.out.println("College Name : "+a1.getCollege_name());
			System.out.println("Degree : "+a1.getDegree());
			System.out.println("Experience : "+a1.getExp());
			System.out.println("Company Name : "+a1.getCom_name());
			System.out.println("Role : "+a1.getRole());
		}
		else {
			System.out.println("No record found..");
		}
	}
	@Override
	public void feedback() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Rating 1 to 5 ");
		int rate = scanner.nextInt();
		System.out.println("Enter the feedback : ");
		scanner.next();
		String feedback = scanner.nextLine();
	}
}