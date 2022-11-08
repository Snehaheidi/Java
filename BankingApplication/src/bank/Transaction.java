package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;


public class Transaction
{
    static String DB_URL = "jdbc:mysql://localhost:3306/Bank_Details";
    static final String USER = "root";
    static final String PASS = "root";
    static BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
    public static boolean money_transaction(int U_Id,int rec_id,int amount)
    {
        if(rec_id == 0 || U_Id == 0)
        {
            System.out.println("Failed....");
            return false;
        }
        try
        {
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASS);
            String sql = "SELECT * FROM user_bank_details where user_id = "+U_Id;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery(sql);
            if(resultSet.next())
            {
                if(resultSet.getInt("Balance")<amount)
                {
                    System.out.println("Insufficient Balance...");
                    return false;
                }
                Statement st = connection.createStatement();
                sql = "update user_bank_details set Balance=Balance-" + amount + " where user_id=" + U_Id;
                if(st.executeUpdate(sql)==1){
                    System.out.println("Your Debited Successfully...");
                }
                String sql1 = "update user_bank_details set Balance=Balance+" + amount + " where user_id=" + rec_id;
                st.executeUpdate(sql1);
                System.out.println("----------------------------------------------");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return true;
    }
    public static boolean viewBalance(int U_Id)
    {
        try
        {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * FROM user_bank_details where user_id=" + U_Id;
            PreparedStatement statement1 = connection.prepareStatement(sql);
            ResultSet resultSet1 = statement1.executeQuery(sql);
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

    public static boolean depositMoney(int u_id) throws IOException {
        System.out.println("Enter the Deposit Amount :");
        int d_amount = Integer.parseInt(scanner.readLine());
        try
        {
            Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = connection.createStatement();
            String sql1 = "update user_bank_details set Balance=Balance+" + d_amount + " where user_id=" + u_id;
            if(st.executeUpdate(sql1)==1)
            {
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
            String sql = "SELECT * FROM user_bank_details where user_id=" + uid;
            PreparedStatement statement1 = connection.prepareStatement(sql);
            ResultSet resultSet1 = statement1.executeQuery(sql);
            if (resultSet1.next()) {
                if (resultSet1.getInt("Balance") < wd_amount) {
                    System.out.println("InSufficient Balance");
                    return false;
                } else {
                    Statement st = connection.createStatement();
                    String sql1 = "update user_bank_details set Balance=Balance-" + wd_amount + " where user_id=" + uid;
                    if(st.executeUpdate(sql1)==1)
                    {
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