package railway;

public class Booking {
	//AVAILABLE TICKETS
    static int availableLowerBerths = 1;
    static int availableMiddleBerths = 1;
    static int availableUpperBerths = 0;
    static int availableRacTickets = 1;
    static int availableWaitingList = 1;

	static int avaiableTicketCount=3;   //---> Total Count
	static final int n = availableLowerBerths + availableMiddleBerths + availableUpperBerths ;
	//object array
	static Passenger bookedTicket[]=new Passenger[n];
	static Passenger bookedRAC[]=new Passenger[availableRacTickets];
	static Passenger bookedWL[]=new Passenger[availableWaitingList];

	//counting variable
	static int topTicketCount=0;
	static int topRAC=0;
	static int topWL=0;
	static int pId = 1;
	
    public void bookTicket(Passenger p) {
        if (bookedWL.length == 0) {
            System.out.println("No Tickets Available");
        }
        if(p.age<=6) {
        	p.berthPreference="-";
        	bookedTicket[topTicketCount++] = p;
        	avaiableTicketCount--;
        	System.out.println("Ticket Booked...");
        	return;
        }
        else if(p.age > 60 && availableLowerBerths > 0) {
        	 System.out.println(">>>>>>>>-Lower Berth Given-<<<<<<<<");
             bookedTicket[topTicketCount++]=p;
             availableLowerBerths--;
             avaiableTicketCount--;
        }
        else if((p.berthPreference.equals("L") && availableLowerBerths > 0)|| (p.berthPreference.equals("M") && availableMiddleBerths > 0) || (p.berthPreference.equals("U") && availableUpperBerths > 0))
        {
            System.out.println("Preferred Berth Available");
            if(p.berthPreference.equals("L"))
            {
                System.out.println(">>>>>>>>-Lower Berth Given-<<<<<<<<");
                bookedTicket[topTicketCount++]=p;
                availableLowerBerths--;
                avaiableTicketCount--;
            }
            else if(p.berthPreference.equals("M")) {
            	System.out.println(">>>>>>>>-Middle Berth Given-<<<<<<<<");
                bookedTicket[topTicketCount++]=p;
                availableMiddleBerths--;
                avaiableTicketCount--;
            }
            else if(p.berthPreference.equals("U")) {
            	System.out.println(">>>>>>>>-Upper Berth Given-<<<<<<<<");
                bookedTicket[topTicketCount++]=p;
                availableUpperBerths--;
                avaiableTicketCount--;
            }

        }
        //preference not available -> book the available berth

        else if(availableLowerBerths > 0) {
            bookedTicket[topTicketCount++]=p;
            System.out.println(">>>>>>>>-Lower Berth Given-<<<<<<<<");
            availableLowerBerths--; 
            avaiableTicketCount--;
        }
        else if(availableMiddleBerths > 0){
            bookedTicket[topTicketCount++]=p;
            System.out.println(">>>>>>>>-Middle Berth Given-<<<<<<<<");
            availableMiddleBerths--;
            avaiableTicketCount--;
        }
        else if(availableUpperBerths > 0){
            bookedTicket[topTicketCount++]=p;
            System.out.println(">>>>>>>>-Upper Berth Given-<<<<<<<<");
            availableUpperBerths--;
            avaiableTicketCount--;
        }
        else if(availableRacTickets > 0) {
            addToRAC(p);
            availableRacTickets--;
            avaiableTicketCount--;
        }

        else if(availableWaitingList > 0) {
            addToWaitingList(p);
            availableWaitingList--;
            avaiableTicketCount--;
        }
        else {
        	System.out.println("checking process....");
        }
        		
    }
    //add to RAC
    public void addToRAC(Passenger p) {
    	p.berthPreference="RAC";
    	bookedRAC[topRAC++]=p;
    	System.out.println(">>>>>>>>-Added to RAC-<<<<<<<<");
    }
    //adding to WL
    public void addToWaitingList(Passenger p){
    	p.berthPreference="WL";
    	bookedWL[topWL++]=p;
    	System.out.println(">>>>>>>>-Added to WaitingList-<<<<<<<<");
    }
}