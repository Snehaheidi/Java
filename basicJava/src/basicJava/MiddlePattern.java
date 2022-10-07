package basicJava;

import java.util.Scanner;

public class MiddlePattern {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 String str = scanner.nextLine();
	 int divide = str.length()/2;
	 int j =0;
	 char[] arr = new char[str.length()];
	 for(int i=divide;i<str.length();i++) {
		 arr[j] = str.charAt(i);
		 j++;
	 }
	 for(int i=0;i<str.length()/2;i++) {
		 arr[j] = str.charAt(i);
		 j++;
	 }
//	 System.out.println(Arrays.toString(arr));
	 findMiddlePattern(arr);
     scanner.close();
	}

	private static void findMiddlePattern(char[] arr) {
		int space = arr.length * 2;
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<space;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
			System.out.print(arr[j]);
			}
			System.out.println("");
			space = space - 2;
		}
	}
}
//OUTPUT;
/*
 program
              g
            gr
          gra
        gram
      gramp
    grampr
  grampro
 */
