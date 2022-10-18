package task5;

import java.util.*;
public class Combination{
	public static void printkeypad(int num,String output,String option[]){
		if(num == 0){
			System.out.println(output);
			return;
		}
		int n1 = num%10;//last index of the num
		String s1 = option[n1];
		for(int i=0;i<s1.length();i++){
			printkeypad(num/10,s1.charAt(i)+output,option);
		}
	}
	public static void main(String[] args) {
		String output ="";
		String option[] = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();//23
		printkeypad(num,output,option);
		scanner.close();
	}
}
