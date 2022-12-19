package bank;

public class Transfer extends Login{
	DepositWithDraw d = new DepositWithDraw();
	int balamt;
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
		d.print(id);
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
