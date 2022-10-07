package basicJava;
import java.util.Scanner;

public class ReverseWordRecursion {

	public static void main(String[] args) {
		//String s = "i like this program very much ";
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[] p = reverseWords(s.toCharArray());
		System.out.print(p);
		scanner.close();
	}
	private static char[] reverseWords(char[] s) {
     	int start = 0;
		for (int end = 0; end < s.length; end++){
			if (s[end] == ' ') {
				reverse(s, start, end);
//				System.out.println(start+" "+end);
				start = end + 1;
			}
		}
//		System.out.println(start);
//		System.out.println(s.length);
		reverse(s, start, s.length - 1);
		reverse(s, 0, s.length - 1);
		return s;
	}
	public static void reverse(char str[],int start,int end){
		char temp;
		if(start >=end)return;
			temp = str[start];
			str[start] = str[end];
			str[end] = temp;
			reverse(str,start+1,end-1);
//		System.out.println(str);
	}
}
//OUTPUT:
/*
hi hello how are you 
you are how hello hi  
 */
