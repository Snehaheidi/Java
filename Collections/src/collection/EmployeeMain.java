package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeMain {
	static ArrayList<Employee> empList = new ArrayList<>();
	public static void main(String[] args) {
		System.out.println(" 1).Insert New Employee \n 2).Delete Record \n 3).Exit");
		select();
	}
	public static void select() {
		Scanner scanner = new Scanner(System.in);
		EmployeeDetails emp = new EmployeeDetails();
		System.out.println("Enter your choice...");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			emp.getEmployeeinfo();
			select();
			break;
		case 2:
			emp.delete(empList);
			select();
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Enter the Correct Option...");
            select();
		}
	}
}