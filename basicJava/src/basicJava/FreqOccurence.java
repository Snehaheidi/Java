package basicJava;

import java.util.Scanner;

public class FreqOccurence {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 int n = scanner.nextInt();
	 int[] arr = new int[n];
	 for(int i=0;i<n;i++) {
		 arr[i] = scanner.nextInt();
	 }
	 findSorting(arr,n);
     scanner.close();
	}
	private static void findSorting(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		findResult(arr,n);
	}
   private static void findResult(int[] arr,int n) {
	   int max = 0;
	   for(int i=0;i<n;i++) {
		   if(max<arr[i]) {
			   max = arr[i];
		   }
	   }
	   int[] count = new int[max+1];
	   for(int i=0;i<n;i++) {
		   count[arr[i]]++;
	   }
	   for(int j=0;j<count.length;j++) {
		   if(count[j]!=0){
			  System.out.println(j +" - "+count[j]);
		   }
	   }
   }
}
