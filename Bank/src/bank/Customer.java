package bank;

import java.util.ArrayList;

public class Customer {
	private int cusId ;
	private int Balance;
	private long actNo;
	private String cusName , cusPass;
	private ArrayList<TransferHistory> statement = new ArrayList<>();
	
	public Customer(String cusName,long actNo, int cusID, String cusPass) {
		this.cusName = cusName;
		this.actNo = actNo;
		this.cusPass = cusPass;
		this.Balance = 10000;
		this.cusId = cusID;
	}
	public Customer(String cusName,long actNo, int cusID, String cusPass,ArrayList<TransferHistory> statement) {
		this.cusName = cusName;
		this.actNo = actNo;
		this.cusPass = cusPass;
		//this.Balance = 10000;
		this.cusId = cusID;
		this.statement = statement;
	}
//	public Customer() {
//		// TODO Auto-generated constructor stub
//	}
	public int getCusId() {
		return cusId;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public long getActNo() {
		return actNo;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusPass() {
		return cusPass;
	}
	public void setCusPass(String cusPass) {
		this.cusPass = cusPass;
	}
	public ArrayList<TransferHistory> getStatement() {
		return statement;
	}
	public void setStatement(ArrayList<TransferHistory> statement) {
		this.statement = statement;
	}
}
