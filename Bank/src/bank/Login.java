package bank;

import java.util.*;
class Login extends Admin{
	long actNo;
	private String cusName, pass , cusPass;
	int transId, transamount;
	private int amount , balamt = 0;
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

	public void withDraw(int i) {
		Customer c = customer.get(i);
		print(c);
		System.out.println("\nEnter the Amount (WithDraw): ");
		amount = scanner.nextInt();
		// check balance
		if(c.getBalance()>amount) {
			balamt = c.getBalance();
		}	
		int bal = balamt - amount;
		c.setBalance(bal);
		TransferHistory t = new TransferHistory(transId,bal,c.getActNo(),amount,"WithDraw");
		statement.add(t);
		//System.out.println("Statement 0 :"+statement);
		System.out.println("\n-*-* Thank you , "+c.getCusName()+" your Amount is WithDraw-*-* :  "+amount);
		print(c);
	}
	public void deposit(int i) {
		Customer c = customer.get(i);
		print(c);
		System.out.println("\nEnter the Amount (Deposit): ");
		amount = scanner.nextInt();
		if(c.getBalance()>amount) {
			balamt = c.getBalance();
		}
		int bal = balamt + amount;
		c.setBalance(bal);
		TransferHistory t = new TransferHistory(transId,bal,c.getActNo(),amount,"Deposit");
		statement.add(t);
		//System.out.println("Statement 1 :"+statement);
		System.out.println("\n-*-* Thank you , "+c.getCusName()+" your Amount is Deposit-*-* :  "+amount);
		print(c);		
	}
	public void print(int id) {
		for(Customer c : customer) {
			if(c.getCusId()==id+1) {
				System.out.print(""+c.getCusId());
				System.out.print("\t\t"+c.getCusName());
				System.out.print("\t\t\t"+c.getActNo());
				System.out.print("\t\t\t"+c.getBalance());
				System.out.print("\t\t"+c.getCusPass());
			}
		}
	}
	public void transfer(int id) {
		System.out.println("Enter Transaction Account Number (XXXX000): ");
		long actno2 = scanner.nextInt();
		if(validate(actno2)) {
			transferAmount(customer.get(id),actno2,id);	
		}
		else {
			System.out.println("Enter The Correct Account Number");
			transfer(id);
		}
	}
	private void transferAmount(Customer c,long actno2,int id) {
		balamt = c.getBalance();
		System.out.println("\nYour Account Balance : "+balamt);
		System.out.println("Enter the Amount (Transfer) : ");
		int transamt = scanner.nextInt();
		int custOneamt = balamt - transamt; 
		c.setBalance(custOneamt);
		if(findTranActBal(actno2,transamt)) {
			System.out.println("\nDebited Successfully...");
		}
		TransferHistory t = new TransferHistory(transId,custOneamt,c.getActNo(),transamt,"Transfer");
		statement.add(t);
		print(id);
	}
	private boolean findTranActBal(long actno2,int transamt) {
		int bal=0;
		for(Customer c:customer) {
			if(c.getActNo()==actno2) {
				bal = c.getBalance() + transamt;
				c.setBalance(bal);
				return true;
			}
		}
		return false;
	}
	private boolean validate(long actno2) {
		for(Customer cu : customer) {
			if(cu.getActNo()==actno2) {
				return true;
			}
		}
		return false;
	}
	public void History(int id) {
		for(Customer c: customer) {
			if(c.getCusId()==id+1) {
				long acno = c.getActNo();
				for(TransferHistory i : statement) {
					if(i.getActNo()==acno) {
						System.out.print(i.getTransId());
						System.out.print("\t : "+ i.getActNo());
						System.out.print("\t :"+i.getType());
						System.out.print("\t : "+i.getTransamount());
						System.out.print("\t : "+i.getBalance());
						System.out.println("");
					}

				}
			}
		}
	}
}
