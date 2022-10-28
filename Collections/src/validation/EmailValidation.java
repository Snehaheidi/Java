package validation;

import java.util.Scanner;
import java.util.regex.Pattern;
//import java.util.regex.Matchser;
//import java.util.regex.PatternSyntaxException;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String email;
        System.out.println("Enter the Email Address: ");
        email=scanner.nextLine();
        System.out.println(validateEmail(email));
        scanner.close();
    }

    private static String validateEmail(String email) {
        String emailRegex="^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"+"[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        if(email==null){
            return "Email Address Not Found!";
        }
        boolean result=Pattern.matches(emailRegex,email);
        if(result==true){
            return "Email Address is Valid!";
        }
        else{
            return "Invalid Email Address!";
        }

    }
}