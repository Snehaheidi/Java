//SUM OF ODD NUMBERS

package basicJava;
import java.util.*;

public class OddNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			int odd = 2*i-1;
			System.out.println(odd);
			sum +=odd;
		}
		System.out.println("Sum of Odd Numbers :"+sum);
		scanner.close();
	}
}
//OUTPUT:
/*
 5
 
1
3
5
7
9
Sum of Odd Numbers :25
*/