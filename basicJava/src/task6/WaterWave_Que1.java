package task6;

import java.util.Scanner;

public class WaterWave_Que1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findWaterWave(arr,n);
		scanner.close();
	}
	private static void findWaterWave(int[] arr, int n) {
	   int max = arr[0], sum = 0 , result = 0;
	   for(int i=1;i<n-1;i++) {
		   if(max>arr[i]) {
			   if(arr[i]!=0) {
				   sum = max - arr[i];
				   result += sum;
				   sum = 0; 
			   }
			   else {
				   result += max;
			   }
		   }
		   else {
			   max = arr[i];
		   }
	   }
	   System.out.println(result);
	}

}
