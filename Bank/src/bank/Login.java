package bank;

import java.util.*;
class Login extends Admin{
	long actNo;
	private String cusName, pass , cusPass , type="";
	int transId, balance, transamount;
	Scanner scanner = new Scanner(System.in);
    static ArrayList<TransferHistory> statement = new ArrayList<TransferHistory>();
	public int login() {
		System.out.println("Enter the Holder Name : ");
		cusName = scanner.next();
		System.out.println("Enter the Password : ");
		cusPass = scanner.next();
		pass = encrypt(cusPass);
		for(int i=0;i<customer.size();i++) {
			 Customer c = customer.get(i);
			 if(c.getCusName().equals(cusName) && c.getCusPass().equals(pass)) {
				transId++;
				//Customer c = new Customer();
				System.out.println("Your ID : "+(i+1));
				return i;
			}
		}		
		return -1;
	}
}
