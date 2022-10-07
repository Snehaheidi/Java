package taskthree;

//import java.util.Arrays;
import java.util.Scanner;

public class NumerSeries {
	public static void main(String[] args){
		Scanner scanner =  new Scanner(System.in);
		int n=scanner.nextInt();
		int[] series = new int[n];
		series[0] = 1;
		series[1] = 2;
		series[2] = 2;
		int val = 1,count = 1,j=2,i=3;
		while(i<n) {
			int no = series[j];
			for(int k = 0 ; k<no;k++) {
				series[i++] = val;
				if(val == 1) {
					count++;
				}
			}
			j++;
			val = val==1 ? 2 : 1;
		}
		System.out.println(count);
//		System.out.println(Arrays.toString(series));
		scanner.close();
	}
}

//OUTPUT:
/*
7
4
[1, 2, 2, 1, 1, 2, 1]
 */
