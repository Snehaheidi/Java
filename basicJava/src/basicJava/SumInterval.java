package basicJava;
import java.util.*;
public class SumInterval {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n number of elemet : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the element : ");
		for(int i=0;i<n;i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the Number : ");
		int number = scanner.nextInt();
		
		int sum = findSum(arr,n);
		findResult(arr,n,number,sum);
		
		scanner.close();
	}
	public static int findSum(int[] arr,int n) {
		int sum = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		return sum;
	}
     
	private static void findResult(int[] arr, int n, int number, int sum) {
		int removeIndex=0,remElement = 0 , sum1 = 0;
		boolean flag = true;
		
		for(int j=0;j<n;j++) {
			if(flag) {
			int temp = arr[j] * number;
			if(sum<=temp) {
				removeIndex = j-1;
				remElement = arr[removeIndex];
				for(int k=0;k<n;k++) {
					if(k!=removeIndex) {
						sum1 += arr[k];
					}
				}
				if(sum1%number==0) {
					arr[removeIndex] = 0;
					flag = false;
				}
			}
		}
		}
		
		
//		System.out.println(Arrays.toString(arr));
		if(!flag) {
			for(int i=0;i<n;i++) {
				if(arr[i]!=0) {
					System.out.print(arr[i]+" ");
				}
			}
			System.out.println("\n Remove Element : "+remElement);
		}
		else {
			System.out.println(Arrays.toString(arr));
			System.out.println("\n Remove Element : "+remElement);
		}
		
	}
}
