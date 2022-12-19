package bank;

public class DepositWithDraw extends Login {
	private int amount;
	int balamt = 0;
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
}
