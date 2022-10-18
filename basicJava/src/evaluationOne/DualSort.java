package evaluationOne;
import java.util.*;
public class DualSort {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		findResult(n,arr);
		scanner.close();
	}

	private static void findResult(int n, int[] arr) {
		int temp;
		//SORTING
		for(int i=0;i<n;i++) {
			for(int j =i+1;j<n;j++) {
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
       int s = 0;
       int t = n-1;
       while(s<t) {
    	   System.out.print(arr[s++]+","+arr[t--]+",");
       }
       if(n%2!=0) {
    	   System.out.print(arr[n/2]);
       }
	}
}
