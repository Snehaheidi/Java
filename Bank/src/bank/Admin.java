package bank;

import java.util.*;

public class Admin {
	long actNo;
	static int cusID = 0;
	private String cusName, pass , cusPass;
	int transId = 0 , balance = 0 , transamount = 0;
	static Scanner scanner = new Scanner(System.in);
	static ArrayList<Customer> customer = new ArrayList<Customer>();
	public void addNewCusInfo() {
		System.out.println("Enter the Customer Name : ");
		cusName = scanner.next();
		System.out.println("Enter the AccountNo : ");
		actNo = scanner.nextLong();
		System.out.println("Enter the New Password : ");
		cusPass = scanner.next();
		pass = encrypt(cusPass);
		cusID++;
		Customer cus = new Customer(cusName,actNo,cusID,pass);
		//System.out.println("Your Account Number is : " + cus.getActNo());
		customer.add(cus);
	}
	public void display() {
		System.out.println("CusId \t\t  Name  \t\t AccountNo  \t\t Balance \t\tPassword");
		for(int i=0;i<customer.size();i++) {
			print(customer.get(i));
			System.out.println("");
		}
	}
	protected void print(Customer customer) {
		System.out.print(""+customer.getCusId());
		System.out.print("\t\t"+customer.getCusName());
		System.out.print("\t\t\t"+customer.getActNo());
		System.out.print("\t\t\t"+customer.getBalance());
		System.out.print("\t\t"+customer.getCusPass());
	}
	public String encrypt(String cusPass) {
		String p ="";
		char[] ch = cusPass.toCharArray();
		for(int i=0;i<cusPass.length();i++) {
			ch[i]+=1;
			p += ch[i];
		}
		return p;
	}
	public void topCustomer() {
		System.out.println("Enter the Number of Customer : ");
		//int n = scanner.nextInt();
		Comparator<Customer> cm1=Comparator.comparing(Customer::getActNo);  
		Collections.sort(customer,cm1);
		view(customer);
	}

	private void view(ArrayList<Customer> customer) {
		for(Customer c : customer) {
			System.out.print(" "+c.getCusId());
			System.out.print("\t\t "+c.getCusName());
			System.out.print("\t\t "+c.getActNo());
			System.out.print("\t\t "+c.getBalance());
			System.out.print("\t\t "+c.getCusPass());
			System.out.println("");
		}
	}
}
