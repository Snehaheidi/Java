//SORTING 0,1,2

package basicJava;

import java.util.Scanner;

public class ZeroOneTwo {

	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     int n = scanner.nextInt();
     int[] arr = new int[n];
     for(int i=0;i<n;i++) {
    	 arr[i] = scanner.nextInt();
    	 if(arr[i]>=0 && arr[i]<=2) {
    		 continue;
    	 }
    	 else {
    		 System.out.println("Enter the value only 0 or 1 or 2");
    		 i--;
    	 }
     }
     findResult(arr,n);
     scanner.close();
	}
	public static void findResult(int[] arr,int n) {
		int cnt1=0,cnt2=0,cnt3=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				cnt1++;
			}
			else if(arr[i]==1) {
				cnt2++;
			}
			else{
				cnt3++;
			}
		}
		int i=0;
		while(cnt1>0) {
			arr[i++] = 0;
			cnt1--;
		}
		while(cnt2>0) {
			arr[i++] = 1;
			cnt2--;
		}
		while(cnt3>0) {
			arr[i++] = 2;
			cnt3--;
		}
		for(int j=0;j<n;j++) {
			System.out.print(arr[j]+" ");
		}
	}
}
/*
5
3
Enter the value only 0 or 1 or 2
3
Enter the value only 0 or 1 or 2
3
Enter the value only 0 or 1 or 2
3
Enter the value only 0 or 1 or 2
3
Enter the value only 0 or 1 or 2
0
1
2
0
2
0 0 1 2 2 
 
*/