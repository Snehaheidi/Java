package evaluation;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  int k=1;
	  for(int i=1;i<=n;i++) {
		  for(int j=1;j<=i;j++) {
			  System.out.print(k++);
			  if(j<i) {
				  System.out.print("*");
			  }
		  }
		  System.out.println();
	  }
	  k-=1;
	  for(int i=1;i<=n;i++) {
		  int sneha = k-(n-i);
		  for(int j=n;j>=i;j--) {
      		  System.out.print(sneha++);
      		  k--;
      		  if(j>i) {
				  System.out.print("*");
			  }
		  }
		  System.out.println();
	  }
      scanner.close();
	}
}