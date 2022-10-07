package basicJava;
import java.util.Scanner;

public class NumberPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int i, j , k=0;
		for (i = 1; i < n; i++) {
			for(int space=i;space<n;space++) {
				System.out.print(" ");
			}
			k = (i*(i+1))/2;
			for (j = 1; j< i + 1; j++) {
				System.out.print(k-- + " ");
			}
			System.out.println();
		}
//		System.out.println(k);
		int num = 2*n - i-1;
//		System.out.println(num);
		k = (num*(num+1))/2;
//		System.out.println(k);
		for (i = 1; i < n; i++) {
			for(int space=0;space<i;space++) {
				System.out.print(" ");
			}
			for (j = n; j>i; j--) {
				System.out.print(k-- +" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
/*
5
    1 
   3 2 
  6 5 4 
 10 9 8 7 
 10 9 8 7 
  6 5 4 
   3 2 
    1 
*/