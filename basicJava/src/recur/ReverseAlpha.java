package recur;

import java.util.Scanner;

public class ReverseAlpha {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String str = scanner.next();
	  String result  = reverse(str);
	  System.out.println("Reverse String : "+result);
	  scanner.close();
  }
  private static String reverse(String s) {
	  if(s.isEmpty()) {
		  return s;
	  }
	  else {
		  return reverse(s.substring(1))+ s.charAt(0);
	  }
  }
}
