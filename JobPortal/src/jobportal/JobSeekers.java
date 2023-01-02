package jobportal;

import java.util.*;

public class JobSeekers implements ProfileView{
	private String name,dob,collegeName,degree,companyName=null,role=null,mail;
	private int exp;
	private AdminPage a = new AdminPage();;
	private Scanner scanner = new Scanner(System.in);
	public void jobSeekers() {
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
		System.out.println("Enter the Your Name : ");
		scanner.nextLine();
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
			System.out.println("Enter the Company Name");
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
			Seekers j = new Seekers(name,mail);
			if(a.loginSeeker(j)) {
				login(name,mail);
			}			
		}
		else{
			System.out.println("Enter correct details..");
			register();
		}
	}
	@Override
	public void login(String name,String mail) {
		System.out.println(" 1)Search Job \t 2)ViewProfile \t3)FeedBack \t4)Logout");
		int ch = scanner.nextInt();
		switch(ch) {
		case 1:
			relatedJob(mail);
		case 2:
			viewProfile(mail);
			login(name,mail);
			break;
		case 3:
			feedback();
			login(name,mail);
			break;
		case 4:
			MainClass m = new MainClass();
			m.start();
			break;
		default :
			System.out.println("Enter the Correct Option...");
			login(name,mail);
		}
	}
	private void relatedJob(String mail) {
		AdminPojo admin = a.realtedJob(mail);
       if(admin!=null) {
    	   System.out.println("--------Related Job----------");
    	   System.out.println("Company Name : "+admin.getCom_name());
    	   System.out.println("Role : "+admin.getRole());
    	   System.out.println("Skils : "+admin.getSkils());
    	   System.out.println("Experience : "+admin.getExperience());
    	   System.out.println("No Of Vacancy : "+admin.getNo_of_vacancy());
    	   System.out.println("Posted Date : "+admin.getDate());
       }
       System.out.println("1)Apply Job \t 2)Back");
       int ch = scanner.nextInt();
       switch(ch) {
       case 1:
    	   applyJob();
    	   relatedJob(mail);
       case 2:
    	   login(name,mail);
       default:
    	   System.out.println("Enter Correct Option..");
    	   relatedJob(mail);
       }
       
	}
	private void applyJob() {
		
	}
	@Override
	public void viewProfile(String mail) {
		if(a.viewJobSeekerProfile(mail)) {
			System.out.println("view profile");
		}
	}
	@Override
	public void feedback() {
		System.out.println("Enter the Rating 1 to 5 ");
		int rate = scanner.nextInt();
		System.out.println("Enter the feedback : ");
		scanner.next();
		String feedback = scanner.nextLine();
	}
}