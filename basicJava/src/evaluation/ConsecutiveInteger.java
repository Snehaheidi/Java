package evaluation;

import java.util.Scanner;

public class ConsecutiveInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findResult(n,arr);
		scanner.close();
	}
	private static void findResult(int n, int[] arr) {
	   for(int i=0;i<n;i++) {
		   for(int j=i+1;j<n;j++) {
			   if(arr[i]>arr[j]) {
				   int temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
			   }
		   }
	   }
	   int min = arr[0];
	   int temp = min;
	   int max = arr[n-1];
//   System.out.println(min+""+max);
//	   boolean flag = false;
	   int count = 0;
	   for(int i=0;i<n;i++) {
			if(min==arr[i]) {
				count = 1;
			}
			else {
				count  = -1; 
				break;
			}
			min++;
		}
//		System.out.println(count);
	    if(count==1) {
	    	System.out.println("The Array Contain Consecutive Integer from "+temp+" to "+max);
	    }
	    else {
	    	System.out.println("The Array Does not contain Consecutive Integer");
	    }
	}
}
