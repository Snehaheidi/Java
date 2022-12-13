package basicJava;

import java.util.Scanner;

public class AlternativeSotring {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		sorting(arr,n);
	}

	private static void sorting(int[] arr, int n) {
	   for(int i=0;i<n;i++) {
		   for(int j=i+1;j<n;j++) {
			   if(arr[i]>arr[j]) {
				   int temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
			   }
		   }
//		   System.out.print(arr[i]);
	   }
	  findResult(arr,n);	
	}

	private static void findResult(int[] arr, int n) {
		int k = 0;
		int s = n-1;
		while(k<s) {
			System.out.print(arr[s]+" "+arr[k]+" ");
			s--;
			k++;
		}
		if(n%2!=0) {
			System.out.print(arr[n/2]);
		}
	}
}
