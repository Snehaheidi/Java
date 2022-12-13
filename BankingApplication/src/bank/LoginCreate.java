package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class LoginCreate
{
    static String DB_URL = "jdbc:mysql://localhost/Bank_Details";
    static final String USER = "root";
    static final String PASS = "root";
    public static boolean createAccount(String name,int passcode){
        if(name=="" || passcode == 0) {
            System.out.println(" Correct Name & PassWord ??");
            return false;
        }
        try
        {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO user_bank_details(Holder_Name,Password,Balance) VALUES ('"+name+"','"+passcode+"',1000)";
            if(statement.executeUpdate(sql)==1) {
                            System.out.println("\n ....Account Create Successfully...!");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return true;
    }
    public static boolean login(String name,int passcode)
    {
        try
        {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            if(name=="" || passcode == 0)
            {
                System.out.println("Your Name or Password INCORRECT.. :-(");
                return false;
            }
            else
            {
                String sql = "SELECT * FROM user_bank_details where Holder_Name ='"+name+"'";
                PreparedStatement statement = connection.prepareStatement(sql);
                ResultSet resultSet = statement.executeQuery(sql);
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
                                if(Transaction.money_transaction(U_Id,rec_Id,amount))
                                {
                                    System.out.println("Transaction Successfully...");
                                }
                                break;
                            case 2:
                                if(Transaction.viewBalance(U_Id))
                                {
                                    System.out.println(">>>>>>>>Welcome Back<<<<<<<<");
                                }
                                break;
                            case 3:
                                if(Transaction.depositMoney(U_Id))
                                {
                                    System.out.println("Thank you");
                                }
                                break;
                            case 4:
                                 if(Transaction.withDraw(U_Id))
                                 {
                                     System.out.println("------------------------------");
                                 }
                                break;
                            case 5:
                                BankApplication.BankApp();
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
}