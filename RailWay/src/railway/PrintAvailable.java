package railway;

public class PrintAvailable extends Booking{
    public  PrintAvailable(){   // CONSTRUCTOR
    	System.out.println("------------------------------------------------");
    	System.out.println("Total Avilable Tickets : "+avaiableTicketCount);
        System.out.println("Lower :   " +availableLowerBerths);
        System.out.println("Middle : " +availableMiddleBerths);
        System.out.println("Upper : " +availableUpperBerths );
        System.out.println("RACs :  " +availableRacTickets);
        System.out.println("Waiting List :  "+availableWaitingList);
        System.out.println("-------------------------------------------------\n");
    }
    public PrintAvailable(int numberofSeat) {
    	int ticketPrice = 1000;
    	System.out.println("====================================");
    	System.out.println("Your Passenger Id : "+pId);
    	System.out.println("Current Ticket Price :"+ticketPrice);
    	int amount = numberofSeat * ticketPrice;
    	System.out.println("Total Booking Amount : Rs/-"+amount);
    	System.out.println("====================================");
    }
}
