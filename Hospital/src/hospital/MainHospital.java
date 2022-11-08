package hospital;

import java.util.Scanner;

public class MainHospital {
	public static void main(String[] args) {
//		MainHospital.mainFun();
		Scanner scanner=new Scanner(System.in);
		boolean check=true;
		int choice;
		while(check) {
			System.out.println("\n *(*_*) 'HEIDI' HOSPITAL (*_*)*\n");
			System.out.println("1) Entry Patient Detail \n2) ViewALlPatient Details \n3) Exit\n");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				HospitalPaitentRegister.entryDetails();
				break;
			case 2:
				PrintDetails.display();
				break;
			case 3:
				System.out.println("Thank You...");
				check = false;
				break;
			default:
				System.out.println("Enter Correct Option!!");
				break;
			}
			
		}
		
	}
	private static void mainFun() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n *(*_*) 'K' HOSPITAL (*_*)*\n");
		System.out.println("1) Entry Patient Detail \n2) ViewALlPatient Details \n3) Exit\n");
		char n = scanner.next().charAt(0);
		switch(n) {
		case '1':
			HospitalPaitentRegister.entryDetails();
			mainFun();
			break;
		case '2':
			PrintDetails.display();
			mainFun();
			break;
		case '3':
			System.out.println("Thank You...");
			System.exit(0);
			break;
		default:
			System.out.println("Enter Correct Option!!");
			mainFun();
			break;
		}
		scanner.close();
	}
	
}