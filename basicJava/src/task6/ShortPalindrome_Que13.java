package task6;

import java.util.Scanner;

public class ShortPalindrome_Que13 {

	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String str = scanner.nextLine();
	  int index = 1;
      while(!findPalindrome(str)) {
    	  str = str.charAt(index) + str;
    	  index +=2;
      }
      System.out.println("Longest Palindrome is : "+str);
	  scanner.close();
	}
	private static boolean findPalindrome(String str) {
		int j=str.length()-1;
		  for(int i=0;i<j;i++,j--){
	         if(str.charAt(i)!=str.charAt(j)){
	                	return false;
	           }       
	      }
       return true;
	}
}
