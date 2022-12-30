package basicJava;

import java.util.Scanner;

public class PatternCharNumber {
	Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	  PatternCharNumber n = new PatternCharNumber();
	  n.start();
	  
	}
	private void start() {
		int n = scanner.nextInt();
		int k = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i%2==0 && j%2==0)||(i%2!=0 && j%2!=0)) {
					System.out.print(i);
				}
				if((i%2!=0 && j%2==0) || (i%2==0 && j%2!=0)){
					System.out.print((char)(k+96));
				}
			}
			System.out.println("");
			k++;
		}
	}
}
/*
i/p : 5
o/p : 

1
b2
3c3
d4d4
5e5e5
*/
