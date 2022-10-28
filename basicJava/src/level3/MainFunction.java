package level3;

import java.util.Scanner;

public class MainFunction {
	public static void main(String[] args) {
		System.out.println(">>>>>>>START GAME<<<<<<<<<<<");
		Scanner scanner = new Scanner(System.in);
		AbstractClass task;
		InputUser i = new InputUser();
		boolean flag =  true;
		while(flag) {
			System.out.println("1)Task-1 \n2)Task-2 \n3)Task-3 \n4)Task-4 \n5)Task-5 \n6)Exit");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
			    task = new Task_One();
			    i.findMatrix(task); 
				break;
			case 2:
				System.out.println("---Task-2---");
				task = new Task_Two();
				i.findMatrix(task);
				break;
			case 3:
				System.out.println("---Task-3---");
				task = new Task_Three();
				i.findMatrix(task);
				break;
			case 4:
				System.out.println("---Task-4---");
				task = new Task_Four();
				i.findMatrix(task);
				break;
			case 5:
				System.out.println("---Task-5---");
				task = new Task_Five();
				i.findMatrix(task);
				break;
			case 6:
				System.out.println("<<<<<<GAME FINISH<<<<<<<<");
			    flag = false;
			    break;
			default:
				System.out.println("Enter the correct option- :-( !!!!");
				break;
			}
		}
		scanner.close();
	}
}
