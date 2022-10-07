package basicJava;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++) {
		arr[i] = scanner.nextInt();
	}
	int sum = scanner.nextInt();
	findPariSum(arr,n,sum);
	scanner.close();
	}

	private static void findPariSum(int[] arr, int n,int sum) {
		int temp=0,count=0;
	  for(int i=0;i<n;i++) {
		  for(int j=i+1;j<n;j++) {
			  temp = arr[i] + arr[j];
			  if(temp==sum) {
				  System.out.println(arr[i]+" & "+arr[j]);
				  count++;
			  }
		  }
	  }
	 System.out.println(count);
	}
}
