package recur;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  int result = factRecur(n);
	  System.out.println("Result : "+result);
	  scanner.close();
  }
  private static int factRecur(int n) {
	  if(n==1) {
		  return n;
	  }
	  else {
		  return (n*factRecur(n-1));
	  }
  }
}
