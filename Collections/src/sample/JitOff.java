package sample;

import java.util.Calendar;

public class JitOff {
   public static void main(String[] args) {
	   Calendar cal = Calendar.getInstance();
	      long msec = cal.getTimeInMillis();
	      System.out.println("Second 1 = "+msec);
	      for(long i=0;i<10000000000L;i++) {
	    	  
	      }
	      long msec1  = cal.getTimeInMillis();
	      System.out.println("Second 2 = "+msec1);
	      System.out.println("Difference : "+(msec - msec1));
   }
}
