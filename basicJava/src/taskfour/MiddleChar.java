package taskfour;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String result = findMiddleChar(s);
		System.out.println("The Middle Characters is : "+result);
		scanner.close();
	}
   private static String findMiddleChar(String s ) {
	    int length = s.length();
	    String s3="";
	    char[] str = s.toCharArray();
	    if(!(length%2==0)) {
	    	 char s1 = str[str.length/2];
	    	 s3 = s1+"";
//	    	 System.out.println(s3);
	    	 return s3;
	    }
	    else  {
	    	char s2 = str[str.length/2];
	    	char s1 = str[str.length/2-1];
	    	 s3 = s1 +""+s2;
	    	 return s3;
	    }
   }
}
