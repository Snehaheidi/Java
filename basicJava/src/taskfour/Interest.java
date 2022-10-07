package taskfour;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float amount = scanner.nextFloat();
		float interest = scanner.nextFloat();
		float time = scanner.nextFloat();
		findInterest(amount,interest,time);
		scanner.close();
	}

	private static void findInterest(float amount, float interest, float time) {
		System.out.println("Year \t FutureValue \n");
		for(int i=1;i<=time;i++) {
			float value = findInterestValue(amount,interest,i);
			System.out.println(i+" \t "+value);
		}
	}

	private static float findInterestValue(float amount, float interest, float i) {
		float result , x ;
		x = (float) Math.pow((1+(interest/1200)), 12*i);
		result = amount * x;
		return result;
	}
}
