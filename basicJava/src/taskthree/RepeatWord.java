package taskthree;

import java.util.Scanner;

public class RepeatWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(s);
		}
		scanner.close();
	}
}

//OUTPUT:
/*
Hello
2
HelloHello 
 */
