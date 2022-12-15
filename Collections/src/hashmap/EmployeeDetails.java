package hashmap;

import java.util.*;

public class EmployeeDetails {
	Scanner scanner = new Scanner(System.in);
	HashMap<Integer,String> empList = new HashMap<>();
	private int empId;
	private String name;
   public static void main(String[] args) {
      EmployeeDetails emp = new EmployeeDetails();
      emp.getDetails();
   }
   public void getDetails() {
	   System.out.println("Number of Employee Details insert : ");
	   int n = scanner.nextInt();
	   for(int i=0;i<n;i++) {
		   empId = scanner.nextInt();
		   name = scanner.next();
		   empList.put(empId, name);
	   }
	   display(empList);
	   deleteRecord(empList);
   }
   private void display(HashMap<Integer, String> empList) {
	   for(Map.Entry m : empList.entrySet()) {
	       	System.out.println("EmpID : "+m.getKey()+" Name : "+m.getValue());
	       }
   }
   private void deleteRecord(HashMap<Integer, String> empList) {
	   System.out.println("Delete the Record : (Y/N)");
	   char ch = scanner.next().charAt(0);
	   if(ch!='N') {
		   System.out.println("Enter the RollNo : ");
		   int rollNo = scanner.nextInt();
		   empList.remove(rollNo);
		   System.out.println("Record Deleted Successfully...");
		   display(empList);
	   }
	   else {
		   display(empList);
	   }
   }
}
