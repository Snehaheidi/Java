package accessmodifier;

import java.util.Scanner;

public class UserDetails {
	Scanner scanner = new Scanner(System.in);
	String user_name;
	private String ph_no;
	private String email_id;
//	ArrayList<PhoneNumber> user = new ArrayList();
	public void getInfo() {
		System.out.println("Enter the User name: ");
		user_name = scanner.next();
		System.out.println("Enter the PhoneNumber : ");
		ph_no = scanner.next();
		if(ph_no.length()<11) {
			System.out.println("Enter the Email Id : ");
			email_id = scanner.next();
			String ph = encrypt(ph_no);
			this.ph_no = ph;
			display(ph);
		}
		else {
			System.out.println("Phone Number only 10 digit");
			getInfo();
		}
	}
	public void change() {
		System.out.println("Enter the Old PhoneNumber : ");
		String oldphno = scanner.next();
		String temp = encrypt(oldphno);
		changePassWord(temp);
	}
	private void changePassWord(String ph_no) {
		if(this.ph_no.equals(ph_no)) {
			System.out.println("Enter the new PhoneNumber: ");
			String change = scanner.next();
			String phno = encrypt(change);
			display(phno);
		}
		else {
			change();
		}
	}
	private String encrypt(String ph_no) {
		String temp = ph_no.substring(8,10);
		String temp1="";
		for(int i=0;i<ph_no.length()-2;i++) {
			temp1 += '*';
		}
		String result = temp1 + temp ;
		return result;
	}
	private void display(String phno) {
		System.out.println("\n--------------------------------");
		System.out.println("User Name : "+user_name+"\nPhoneNumber :"+phno+"\nEmail ID :"+email_id);
	}
}
