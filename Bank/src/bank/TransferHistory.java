package bank;

public class TransferHistory {
	private int transId , balance , transamount;
	private long actNo;
	private String type;
	public TransferHistory(int transId,int balance,long actNo,int transamt,String type) {
		this.transId = transId;
		this.balance = balance;
		this.actNo = actNo;
		this.transamount = transamt;
		this.type = type;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTransamount() {
		return transamount;
	}
	public void setTransamount(int transamount) {
		this.transamount = transamount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getActNo() {
		return actNo;
	}
	public void setActNo(int actNo) {
		this.actNo = actNo;
	}
}
