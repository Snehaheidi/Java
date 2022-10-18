package railway;

public class PrintBookedDetails extends Booking {
     public void view() {
    	 System.out.print("Passenger ID \t");
    	 System.out.print("Serial Number \t");
		 System.out.print("Passenger Name	\t");
		 System.out.print("Passenger Age	\t");
		 System.out.print("BerthPreference \t");
		 System.out.println("");
    	 if(topTicketCount == 0) {
    		 System.out.println("-----No Booking Available------");
    	 }
    	 else {	
    		 for(int i=0;i<topTicketCount;i++) {
    			 Passenger p = bookedTicket[i];
    			 display(p);
//    			 if(p.passengerId==id) {
//        			 display(p); 
//    			 }
    		 }
//    		 System.out.println("------------RAC-----------");
    		 for(int i=0;i<topRAC;i++) {
    			 Passenger p = bookedRAC[i];
    			 display(p);
//    			 if(p.passengerId==id) {
//        			 display(p); 
//    			 }
    		 }
//    		 System.out.println("----------Waitinglist-------------");
    		 for(int i=0;i<topWL;i++) {
    			 Passenger p = bookedWL[i];
    			 display(p);
//    			 if(p.passengerId==id) {
//        			 display(p); 
//    			 }
    		 }
    	 }
     }
     public void display(Passenger p) {
    	 System.out.print(p.passengerId+"\t\t");
    	 System.out.print(p.serialNumber+"\t\t\t");
		 System.out.print(p.name+"\t\t\t");
		 System.out.print(p.age+"\t\t\t");
		 System.out.print(p.berthPreference+"\t\t\t");
//		 System.out.print("SeatNumber : "+p.allotted);
		 System.out.println("");
     }
}
