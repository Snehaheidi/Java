package evaluation;

import java.util.Scanner;

public class ThreeDigit {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int count = 0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				for(int k=1;k<=4;k++) {
					if(i!=k && j!=k && j!=i) {
//						int result = ((((i)*10)+j)*10)+k;
						String result = ""+i+j+k;
						System.out.println(result);
						count++;
					}	
				}
			}
		}
		System.out.println("Total number of the three-digit number is "+count);
		scanner.close();
	}
}