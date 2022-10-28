package basicJava;
import java.util.Scanner;

public class PalindromeOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		String sortSen=upperTolower(str);
		String rev="";
		for(int i=sortSen.length()-1;i>=0;i--) {
			rev=rev+sortSen.charAt(i);
		}
		if(sortSen.equals(rev)) 
			System.out.println("Palindrome");
		else
			System.out.print("Not Palindrome");
		scanner.close();
	}
	static String upperTolower(String s) {
		char[] iparr=new char[s.length()];
		String oparr="";
		for(int i=0;i<s.length();i++) {
			iparr[i]=s.charAt(i);
			if(iparr[i]>='A'&& iparr[i]<='Z') {
				int r=(int)iparr[i]+32;
				oparr+=(char)r;
			}else if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				oparr+=s.charAt(i);
			}
			else {
				continue;
			}
		}
		return oparr;
	}
}
/*
MALAYalam
Palindrome 
 */
