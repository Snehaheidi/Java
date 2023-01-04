package view;

import java.util.Scanner;
import controller.AdminPage;
//main class
public class MainClass {
	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("+      JobPortal      +");
		System.out.println("-----------------------");
		MainClass m = new MainClass();
		m.start();
	}
	public void start() {	 
		Scanner scanner = new Scanner(System.in);
		System.out.println("1)Admin \n2)JobSeekers \n3)Company \n4)Exit");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			AdminPage a = new AdminPage();
			a.admin();
			break;
		case 2:
			JobSeekers j = new JobSeekers();
			j.jobSeekers();
			break;
		case 3:
			Company c = new Company();
			c.companyJobPortal();
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Enter the correct Option...");
			start();
		}
		scanner.close();
	}	
}