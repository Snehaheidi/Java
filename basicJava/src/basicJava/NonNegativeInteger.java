package basicJava;

import java.util.*;

public class NonNegativeInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		int t = scanner.nextInt();
		findCount(arr,n,t);
		scanner.close();
	}
	private static void findCount(int[] arr, int n,int t) {
		int sum = 0,count=0 , result , temp;
		for(int i=0;i<n;i++) {
			temp = arr[i] * -1;
			for(int j=0;j<n;j++) {
				 if(i!=j) {
					 sum += arr[j];
				 }			 
			}
			result = sum + temp;
			sum = 0;
			if(result==t) {
				count++;
			}
		}
		System.out.println("Count :" +count);
	}
}
