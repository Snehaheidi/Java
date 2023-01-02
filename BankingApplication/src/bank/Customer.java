package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Customer
{
	static String DB_URL = "jdbc:mysql://localhost/Bank_Details";
	static final String USER = "root";
	static final String PASS = "root";
	private String name;
	private int passcode;
	static BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
	public Customer(String name, int passcode) {
		this.name = name;
		this.passcode = passcode;
	}
	public Customer() {

	}
	public boolean createAccount(){
		if(name=="" || passcode == 0) {
			System.out.println(" Correct Name & PassWord ??");
			return false;
		}
		try{
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);        
			String sql = "INSERT INTO user_bank_details(Holder_Name,Password,Balance) VALUES (?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setInt(2, passcode);
			statement.setInt(3, 1000);
			if(statement.executeUpdate()==1) {
				System.out.println("\n ....Account Create Successfully...!");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public boolean login()
	{
		try
		{
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			if(name=="" || passcode == 0){
				System.out.println("Your Name or Password INCORRECT.. :-(");
				return false;
			}
			else
			{
				String sql = "SELECT * FROM user_bank_details where Holder_Name =?";
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, name);
				ResultSet resultSet = statement.executeQuery();
				BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
				if(resultSet.next())
				{
					int U_Id = resultSet.getInt("user_id");
					System.out.println("Your User_Id : "+U_Id);
					System.out.println("Welcome "+resultSet.getString("Holder_Name"));
					while(true)
					{
						System.out.println("1). Transfer Money \n 2). View Balance \n 3). Deposit \n 4). WithDraw \n 5). LogOuT");
						int option = Integer.parseInt(scanner.readLine());
						switch (option)
						{
						case 1:
							int rec_Id , amount;
							System.out.println("Enter the Receiver Id :");
							rec_Id = Integer.parseInt(scanner.readLine());
							System.out.println("Enter the Amount :");
							amount = Integer.parseInt(scanner.readLine());
							if(money_transaction(U_Id,rec_Id,amount))
							{
								System.out.println("Transaction Successfully...");
							}
							break;
						case 2:
							if(viewBalance(U_Id))
							{
								System.out.println(">>>>>>>>Welcome Back<<<<<<<<");
							}
							break;
						case 3:
							if(depositMoney(U_Id))
							{
								System.out.println("Thank you");
							}
							break;
						case 4:
							if(withDraw(U_Id))
							{
								System.out.println("------------------------------");
							}
							break;
						case 5:
							BankMain.BankApp();
							break;
						}
					}
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	public boolean money_transaction(int U_Id,int rec_id,int amount)
	{
		if(rec_id == 0 || U_Id == 0){
			System.out.println("Failed....");
			return false;
		}
		try
		{
			Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql = "SELECT * FROM user_bank_details where user_id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, U_Id);
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next())
			{
				if(resultSet.getInt("Balance")<amount)
				{
					System.out.println("Insufficient Balance...");
					return false;
				}
				sql = "update user_bank_details set Balance=Balance- ? where user_id= ?";
				PreparedStatement st = connection.prepareStatement(sql);
				st.setInt(1, amount);
				st.setInt(2, U_Id);
				//statement.executeQuery();
				if(st.executeUpdate()==1){
					System.out.println("Your Debited Successfully...");
				}
				String sql1 = "update user_bank_details set Balance=Balance+ ? where user_id= ?";
				PreparedStatement st1 = connection.prepareStatement(sql1);
				st1.setInt(1, amount);
				st1.setInt(2, rec_id);
				if(st1.executeUpdate()==1) {
					System.out.println("Transfer Sucessfully..");
				}

			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public boolean viewBalance(int U_Id)
	{
		try
		{
			Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
			String sql = "SELECT * FROM user_bank_details where user_id=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, U_Id);
			ResultSet resultSet1 = statement.executeQuery();
			if (resultSet1.next()) {
				System.out.println("_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_");
				System.out.println("Holder_Name        : " + resultSet1.getString("Holder_Name"));
				System.out.println("Account Balance is : " + resultSet1.getInt("Balance"));
				System.out.println("----------THANK YOU------------");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}

	public boolean depositMoney(int u_id) throws IOException {
		System.out.println("Enter the Deposit Amount :");
		int d_amount = Integer.parseInt(scanner.readLine());
		try
		{
			Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
			//            Statement st = connection.createStatement();
			String sql = "update user_bank_details set Balance=Balance+ ? where user_id=?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, d_amount);
			statement.setInt(2, u_id);
			if(statement.executeUpdate()==1){
				System.out.println("Your Amount Credited...");
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public static boolean withDraw(int uid) throws IOException {
		System.out.println("Enter the WithDraw Amount ");
		int wd_amount = Integer.parseInt(scanner.readLine());
		try
		{
			Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
			String sql = "SELECT * FROM user_bank_details where user_id=?";
			PreparedStatement statement1 = connection.prepareStatement(sql);
			statement1.setInt(1,uid);
			ResultSet resultSet1 = statement1.executeQuery();
			if (resultSet1.next()) {
				if (resultSet1.getInt("Balance") < wd_amount) {
					System.out.println("InSufficient Balance");
					return false;
				} else {
					//Statement st = connection.createStatement();
					String sql1 = "update user_bank_details set Balance=Balance-? where user_id=?";
					PreparedStatement statement = connection.prepareStatement(sql1);
					statement.setInt(1, wd_amount);
					statement.setInt(2,uid);
					if(statement.executeUpdate()==1){
						System.out.println("Your Amount Debited....");
					}
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return true;
	}
}