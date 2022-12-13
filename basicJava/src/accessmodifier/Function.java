package accessmodifier;

import java.util.Scanner;

public class Function {
	Scanner scanner = new Scanner(System.in);
	UserDetails u = new UserDetails();
	int choice;
	public void start() {
		System.out.println("0)Sign up \t 1)Exit");
	    choice = scanner.nextInt();
		switch(choice){
		case 0:
			u.getInfo();
			System.out.println("You Succesfully Registered...");
			reset();
			break;
		case 1:
			System.exit(0);
		default:
			System.out.println("Enter the Correct Option");
			start();
		}
	}
	private void reset() {
		System.out.println("\n 1)Reset Your PhoneNumber \t 2)Exit");
		choice = scanner.nextInt();
		switch(choice){
		case 1:
			u.change();
			System.out.println("Reset Your PhoneNumber Successfully....");
			reset();
			break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Enter the Correct Option");
			reset();
			
		}
	}
}