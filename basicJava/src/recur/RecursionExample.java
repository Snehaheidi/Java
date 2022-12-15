package recur;

import java.util.Scanner;

public class RecursionExample {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  reverse(n);
	  scanner.close();
  }
  private static int reverse(int n) {
	  if(n==0) {
		  return 0;
	  }
	  else {
		  System.out.print(n);
		  return reverse(n-1);
	  }
  }
}
