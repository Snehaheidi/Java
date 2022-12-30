package evaluationFinal;

import java.util.Scanner;

public class ReverseOddEven {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[]args) {
		String str = scanner.nextLine();
		String type = scanner.nextLine();
		str+=" ";
		findReverse(str,type);
		scanner.close();
	}
	private static void findReverse(String str, String type) {
       int n = str.length();
       String temp="";
       String[] res = new String[n];
       int k=0,z=0;
       for(int i=0;i<n;i++) {
    	   if(str.charAt(i)==' ') {
    		   res[k] = str.substring(z,i);
    		   //System.out.println(res[k]);
    		   z = i+1;
    		   k++;
    		  
    	   }
       }
       String[] result = new String[k];
       int s = 0 ;
       if(type.equals("even")) {
    	   for(int i=0;i<k;i++){
    		    if(i%2==0) {
    		    	result[s++] = res[i];
    		    }
    		    else {
    		    	temp = res[i];
    		    	//System.out.println(temp);
    		    	String resu= reverse(temp);
    		    	result[s++] = resu;
    		    }
    	   }
       }
       if(type.equals("odd")){
    	   for(int i=0;i<k;i++){
   		    if(i%2==0) {
   		    	temp = res[i];
		    	//System.out.println(temp);
		    	String resu= reverse(temp);
		    	result[s++] = resu;
   		    }
   		    else {
   		    	result[s++] = res[i];
   		    }
   	   }
       }
       print(result);
	}

	private static void print(String[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}		
	}

	private static String reverse(String temp) {
		String n="";
		for(int i=temp.length()-1;i>=0;i--) {
			n += temp.charAt(i);		
		}
		return n;
	}
} 
