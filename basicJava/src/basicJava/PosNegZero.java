package basicJava;
import java.util.*;

public class PosNegZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = scanner.nextDouble();
		if(n>=1 && n<=1000000) {
			System.out.println("Positive Number ");
		}
		else if(n==0) {
			System.out.println("Zero");
		}
		else if(n<0){
			System.out.println("Negative..");
			System.out.println("Small");
		}
		else {
			System.out.println("Large.. ");
		}
		scanner.close();
	}
}
//OUTPUT:
/*
 1238201721
 Large

 0
Zero
 */
