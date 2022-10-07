package basicJava;

import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr1 = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = scanner.nextInt();
		}
		int n1 = scanner.nextInt();
		int[] arr2 = new int[n1];
		for(int i=0;i<n1;i++) {
			arr2[i] = scanner.nextInt();
		}
		findSum(arr1,n,arr2,n1);
		scanner.close();
	}
	private static void findSum(int[] arr1, int n, int[] arr2, int n1) {
		int[] result = new int[n>n1 ? n : n1];
		int i = n-1,j=n1-1,k=result.length-1;
		int carry = 0;
		while(i>=0 || j>=0) {
			int add = carry;
			if(i>=0) {
				add = add + arr1[i];
			}
			if(j>=0) {
				add = add + arr2[j];
			}
			carry = add / 10;
			add = add % 10;
			result[k] = add;
			i--;
			j--;
			k--;
		}
		if(carry>0) {
			System.out.print(carry);
		}
		for(int s:result) {
			System.out.print(s);
		}
	}
}
