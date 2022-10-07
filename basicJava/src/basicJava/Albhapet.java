package basicJava;
import java.util.*;

public class Albhapet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		findPangram(str);
		scanner.close();
	}
	public static void findPangram(String str) {
		int[] count = new int[26];
		for(int i=0;i<count.length;i++) {
			count[i] = 0;
		}
		int index = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=97 && str.charAt(i)<=122) {
				index = str.charAt(i)-97;
				count[index] = 1;
//				System.out.println(index);
			}
			else if(str.charAt(i)>=65 && str.charAt(i)<=90){
				index = str.charAt(i)-65;
				count[index] = 1;
			}	
			else {
				continue;
			}
//			count[index] = 1;
		}
		boolean flag = true;
		for(int i=0;i<count.length;i++) {
			if(count[i]==0) {
				flag = false ;
			}
		}
		if(flag == true) {
			System.out.println("Pangram");
		}
		else {
			System.out.println("Not a Pangram");
		}
	}
}
//OUTPUT:
/*
 abcdef Ghijkl manop,qrstvuwxyz
 Pangram 
 */
