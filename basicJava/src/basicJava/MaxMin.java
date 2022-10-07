package basicJava;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i] = scanner.nextInt();
	 }
	 findMaxMin(arr,n);
	 scanner.close();
	}
   public static void findMaxMin(int[] arr,int n) {
	   int min, max;
	   for(int i=0;i<n;i++) {
		  for(int j=i+1;j<n;j++) {
			  if(arr[i]>arr[j]) {
			  int temp = arr[i];
			  arr[i] = arr[j];
			  arr[j] = temp;
			  }
		  }
	   }
	   max = arr[n-1];
	   min = arr[0];
	   System.out.println("Minimum Value = "+min+" Maximum Value = "+max);
   }
}
//OUTPUT:
/*
5
100 300 999 50 21
Minimum Value = 21 Maximum Value = 999
 */
