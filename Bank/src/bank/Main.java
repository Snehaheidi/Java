package bank;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("*-*-*-*-*-*- TQ ATM -*-*-*-*-*-*-");
		Main.select();
	}
	public static void select() {
		System.out.println("\n1).Admin \n2).Holder \n3)Exit");
		int ch = scanner.nextInt();
		if(ch==1) {
			admin();
		}
		else if(ch==2) {
			holder();
		}
		else {
			System.exit(0);
		}
	}
	private static void admin() {
		Admin a = new Admin();
		int choice ;
		System.out.println("\n1).Add NewCustomer \n2).Display \n3).Top N Customer \n4).Back");
		choice = scanner.nextInt();
		switch(choice) {
		case 1:		  
			a.addNewCusInfo();
			System.out.println("Add New Customer SucessFully..");
			admin();
			break;
		case 2:
			a.display();
			admin();
			break;
		case 3:
			a.topCustomer();
			admin();
			break;
		case 4:
			select();
			break;
		default:
			System.out.println("Enter the Correct Option!!");
			select();
		}
	}
	private static void holder() {
		Login l = new Login();
		System.out.println("1).Login \n2).Back");
		int choice = scanner.nextInt();
		switch(choice){
		case 1:
			int i = l.login();
			if(i!=-1) {
				System.out.println("__Login SuccessFull :-) !!!");
				Main.loginPage(i);
			}
			else {
				System.out.println(">>>>>>Invalid Account<<<<<<<<");
				select();   
			}
			break;
		case 2:
			System.out.println("Logout Successful..");
			select();
		default: 
			System.out.println("Enter the correct Option...");
		}
	}
	private static void loginPage(int i) {
		DepositWithDraw t = new DepositWithDraw();
		Transfer trans = new Transfer();
		System.out.println("\n1)WithDrawal \n2).CashDeposit \n3).Transfer \n4).History \n5).Back ");
		int choice = scanner.nextInt(); 
		switch(choice) {
		case 1:
			t.withDraw(i);
			System.out.println("\nWithDraw Success");
			loginPage(i);
			break;
		case 2:
			t.deposit(i);
			System.out.println("Deposit");
			loginPage(i);
			break;
		case 3:		
			trans.transfer(i);
			System.out.println("Transfer SuccessFul...");
			loginPage(i);
			break;
		case 4:
			trans.History(i);
			System.out.println("--------------------------");
			loginPage(i);
			break;
		case 5:
			System.out.println("Logout SuccessFully..");
			select();
		default : 
			System.out.println("Enter the Correct Option...");
			loginPage(i);
		}
	}
}
