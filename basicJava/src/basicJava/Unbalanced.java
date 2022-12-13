package basicJava;

import java.util.*;

public class Unbalanced
{  
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the expression:");
		String expression=input.next();
		int openParentheses[]=new int[100];
		int closeParentheses[]=new int[100];
		int toBeRemoved[]=new int[100];
		int opIt=0,cpIt=0,toBeRemovedIt=0;        
		for(int i=0;i<expression.length();i++){
			if(expression.charAt(i)=='('){
				openParentheses[opIt]=i;
				opIt++;
			}
			if(expression.charAt(i)==')'){
				closeParentheses[cpIt]=i;
				cpIt++;
			}
		}
		int ParenthesesDiff=Math.abs(opIt-cpIt);        
		for(int i=0;i<ParenthesesDiff;i++){
			if(opIt>cpIt){
				opIt--;
				toBeRemoved[toBeRemovedIt]=openParentheses[opIt];
				toBeRemovedIt++;
			}
			else if(opIt<cpIt){
				cpIt--;
				toBeRemoved[toBeRemovedIt]=closeParentheses[cpIt];
				toBeRemovedIt++;
			}
		}        

		int temp=0;
		if(toBeRemovedIt>0){
			toBeRemovedIt--;
			temp=toBeRemoved[toBeRemovedIt];
		}

		for(int i=0;i<expression.length();i++){            
			if(i==temp){
				if(toBeRemovedIt>0){
					toBeRemovedIt--;
					temp=toBeRemoved[toBeRemovedIt];
				}
			}
			else{
				System.out.print(expression.charAt(i));
			}

		}
	 input.close();	
	}

}