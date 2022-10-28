package task6;

import java.util.Scanner;

public class FirstArrayPresent_Que10 {
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int n = scanner.nextInt();
	   int[] arr1 = new int[n];
	   for(int i=0;i<n;i++) {
		   arr1[i] = scanner.nextInt();
	   }
	   int m = scanner.nextInt();
	   int[] arr2 = new int[m];
	   for(int i=0;i<m;i++) {
		   arr2[i] = scanner.nextInt();
	   }
	   findFirstArrayPresent(arr1,n,arr2,m);
	   scanner.close();
	}
	private static void findFirstArrayPresent(int[] arr1, int n, int[] arr2, int m) {
		int j;
	  for(int i=0;i<n;i++) {
		  for(j=0;j<m;j++) {
			  if(arr1[i]==arr2[j]) {
				  break;
			  }
		  }
		  if(j==m) {
			  System.out.print(arr1[i]+" ");
		  }
	  }
	}
}
