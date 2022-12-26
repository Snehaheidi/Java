package leedcode;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		String result="";
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char[] roman = {'I','V','X','L','C','D','M'};
		int[] value = {1,5,10,50,100,500,1000};
		for(int i=value.length-1;i>=0;i--) {
			while(num>=value[i]) {
				num -= value[i];
			    result += roman[i];
			}
		}
		System.out.println("Roman Letters : "+result);
		scanner.close();
	}
}
