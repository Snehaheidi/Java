package railway;

public class PrintBookedDetails extends Booking {
     public void view(int id) {
    	 if(bookedTicket.length == 0) {
    		 System.out.println("No Booking Available");
    	 }
    	 else {	
    		 System.out.println("Upper--------------");
    		 for(int i=0;i<topTicketCount;i++) {
    			 Passenger p = bookedTicket[i];
    			 if(p.passengerId==id) {
        			 display(p); 
    			 }
    		 }
    	 }
    	 if(bookedRAC.length == 0) {
    		 System.out.println("No Booking Available");
    	 }
    	 else {	
    		 System.out.println("-----------------------");
    		 System.out.println("RAC");
    		 for(int i=0;i<topRAC;i++) {
    			 Passenger p = bookedRAC[i];
    			 if(p.passengerId==id) {
        			 display(p); 
    			 }
    		 }
    	 }
    	 if(bookedWL.length == 0) {
    		 System.out.println("No Booking Available");
    	 }
    	 else {	
    		 System.out.println("Waitinglist");
    		 for(int i=0;i<topWL;i++) {
    			 Passenger p = bookedWL[i];
    			 if(p.passengerId==id) {
        			 display(p); 
    			 }
    		 }
    	 }
     }
     public void display(Passenger p) {
    	 System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    	 System.out.println("Passenger ID : "+p.passengerId);
		 System.out.println("Passenger Name	 : "+p.name);
		 System.out.println("Passenger Age	: "+p.age);
		 System.out.println("BerthPreference : "+p.berthPreference);
		 System.out.println("Serial Number : "+p.serialNumber);
		 System.out.println("SeatNumber : "+p.allotted);
		 System.out.println("------------------------------------------");
     }
}
