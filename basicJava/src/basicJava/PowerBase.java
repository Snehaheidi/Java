package basicJava;

import java.util.Scanner;

public class PowerBase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int power = scanner.nextInt();
		int result = findResult(base,power);
		System.out.println(base+"^"+power+"="+result);
      scanner.close();
	}
  public static int findResult(int b,int p) {
	  if(p!=0) {
		  return (b*(findResult(b,p-1)));
	  }
	  else {
		  return 1;
	  }
  }
}
//OUTPUT:
/*
5 
2
5^2=25
*/