package collection;

import java.util.Scanner;

public class StaticClass {

	public static void main(String[] args) {
	 StaticClass s = new StaticClass();
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int c = a +b;
      System.out.println(c);
	}

}