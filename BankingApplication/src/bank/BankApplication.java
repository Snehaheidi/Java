package bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankApplication {
    public static void BankApp() throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        int passcode = 0;
        System.out.println("\n *_*_*_*_*_*_  Welcome To STC Bank  *_*_*_*_*_*_\n");
        System.out.println("1).Create new Account \t 2).Login \t 3).Exit");
        int choice = Integer.parseInt(scanner.readLine()); //scanner.read();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the Holder Name : ");
                name = scanner.readLine();
                System.out.println("Enter New Password ");
                passcode = Integer.parseInt(scanner.readLine());
                if(LoginCreate.createAccount(name,passcode)){
                    System.out.println("Now you Login...<3");
                    BankApp();
                }
                else {
                   System.out.println("Enter Correct name");
                }
                break;
            case 2:
                System.out.println("Enter the your Holder Name : ");
                name = scanner.readLine();
                System.out.println("Enter your Password :");
                passcode = Integer.parseInt(scanner.readLine());
                if(LoginCreate.login(name,passcode))
                {
                    System.out.println("Thank You...!");
                }
                break;
            case 3:
                System.exit(0);
                break;
            default :
            	System.out.println("Enter the correct option...");
            	BankApp();
        }
    }
}