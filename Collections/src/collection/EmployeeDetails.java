package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDetails extends EmployeeMain{
	private String empName;
	private int age;
	private int empId;
	Scanner scanner = new Scanner(System.in);
	public void getEmployeeinfo() {
		System.out.println("Number of Employee Record Insert..");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Employee Name : ");
			empName = scanner.next();
			System.out.println("Enter the Age  : ");
			age = scanner.nextInt();
			System.out.println("Enter the EmpId : ");
			empId = scanner.nextInt();
			Employee emp = new Employee(empName,age,empId);
			empList.add(emp);
		}
		display(empList);
	}
	public void display(ArrayList<Employee> empList) {
		System.out.println("Employee Name \t\t Employee Age \t\t Employee ID");
		for(Employee emp : empList) {
			print(emp);

		}
		System.out.println("-------------------------------------------------------");
	}
	private void print(Employee emp) {
		System.out.print(emp.getEmpName()+"\t\t\t");
		System.out.print(emp.getAge()+"\t\t\t");
		System.out.print(emp.getEmpId()+"\t\t\t");
		System.out.println("");
	}
	public void delete(ArrayList<Employee> empList) {
		System.out.println("Enter the Employee Id : ");
		int id = scanner.nextInt();
			for(Employee emp : empList) {     
				if(id==emp.getEmpId()) {
					empList.remove(emp);
					display(empList);
					break;
				}
			}
	}
}
