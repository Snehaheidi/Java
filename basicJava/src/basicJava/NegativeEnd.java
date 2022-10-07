package basicJava;
import java.util.*;

public class NegativeEnd {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		sortArray(arr,n);
		scanner.close();
	}
	private static void sortArray(int[] arr,int n) {
		int temp,j;
		for(int i=0;i<n;i++) {
			j=i;
			while(j>0 && arr[j]>0 && arr[j-1]<0) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
//OUTPUT:
/*
N = 5
1 -2 3 -4 5
1 3 5 -2 -4 
 */
