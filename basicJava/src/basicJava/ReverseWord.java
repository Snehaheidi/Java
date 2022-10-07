package basicJava;
import java.util.Scanner;

public class ReverseWord {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	int n=str.length();
	int count =0;
	for(int i=n-1;i>=0;i--) {
		if(str.charAt(i)!='.') {
			count++;
		}
		else {
			for(int j=i+1;j<=i+count;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.print(".");
			count=0;
		}
	}
	for(int i=0;i<n;i++) {
		if(str.charAt(i)!='.') {
			System.out.print(str.charAt(i));
		}
		else {
			break;
		}
	}
	
//	str +=".";
//	int n = str.length();
//	String result="",word="";
//	for(int i =0;i<n;i++) {
//		char ch = str.charAt(i);
//		if(ch!='.') {
//			word = word + ch;
//		}
//		else {
//			result = word+"."+result;
//			word ="";
//		}
//		System.out.println(word);
//	}
//	int len=result.length();
//	for(int i=0;i<len-1;i++) {
//		System.out.print(result.charAt(i));
//	}
    scanner.close();
	}	
}