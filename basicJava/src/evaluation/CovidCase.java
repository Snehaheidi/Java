package evaluation;

import java.util.Scanner;

public class CovidCase {
	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int n = scanner.nextInt();
				int[] arr = new int[n];
				for(int i=0;i<n;i++) {
					arr[i] = scanner.nextInt();
				}
				int k = scanner.nextInt();
				findDays(arr,n,k);
				scanner.close();
	}
    private static void findDays(int[] arr, int n,int k) {
		int max = 0 , noOfpatient = 0 ,  day = 0;
		for (int i = 0; i < n; i++) {
			if (i<k) {
				noOfpatient = noOfpatient+arr[i];
				if (max<noOfpatient) {
					max = noOfpatient;
					day = i;
				}
			}
			if (i>k) {
				noOfpatient = noOfpatient+arr[i] - arr[i-k];
				if (max<=noOfpatient) {
					max = noOfpatient;
					day = i;
				}
			}
		}
		System.out.println(max);
		System.out.println("Day "+ (day+1));
	}
}