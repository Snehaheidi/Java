package railway;

public class CancelTicket extends Booking{
	//check if passenger id is valid
	Passenger p = new Passenger();
	public void cancel(int id) {
		if (topTicketCount == 0) {
			System.out.println("No Tickets Available...Passenger detail Unknown");
		} 
		else {
			cancelTicket(id);
		}
	}
	private void cancelTicket(int id) {
		if(avaiableTicketCount==5) {   
			System.out.println("No Tickets Avaiable to Cancel!!!");
			return;
		}
		else{
			int n1=topTicketCount;
			for(int i=0;i<n1;i++) {
				Passenger p=bookedTicket[i];
				if(p.serialNumber==id) {
					for(int j=i;j<n1-1;j++) {
						bookedTicket[j]=bookedTicket[j+1];
					}
					topTicketCount--; //minise 1 value
					avaiableTicketCount++;		
					if(p.berthPreference.equals("U") || p.berthPreference.equals("u")) {
						 availableUpperBerths ++;
						System.out.println(">>>>>>call Upper<<<<<<< ");
					    int t = cancel(availableUpperBerths,p.berthPreference);
					    availableUpperBerths = t;
					}else if(p.berthPreference.equals("M")|| p.berthPreference.equals("m")) {
						
						availableMiddleBerths++;
						System.out.println(">>>>>>>call middle<<<<<<<<<");
			            int s = cancel(availableMiddleBerths,p.berthPreference);
			            availableMiddleBerths = s;
					}
					else if(p.berthPreference.equals("L") || p.berthPreference.equals("l")) {
						availableLowerBerths++;
						System.out.println(">>>>>>>>call Lower<<<<<<<<");
						int temp = cancel(availableLowerBerths,p.berthPreference);
						availableLowerBerths = temp;
					}
				}
			}
			//2. ARRAY -->2
			int n2=topRAC;
			for(int i=0;i<n2;i++) {
				Passenger p=bookedRAC[i]; 
				if(p.serialNumber==id) {
					for(int j=i;j<n2-1;j++) {
						bookedRAC[j]=bookedRAC[j+1];
					}
				     availableRacTickets++; //ticket count + 1;
					avaiableTicketCount++;
					topRAC--; //minise 1 value
				}
			}
			//3.  ARRAY -->3
			int n3 =topWL;
			for(int i=0;i<n3;i++) {
				Passenger p=bookedWL[i]; //temp obj
				if(id==p.serialNumber) {
					for(int j=i;j<n3-1;j++) {
					   bookedWL[j]=bookedWL[j+1];
					}
					availableWaitingList++; 
//					avaiableTicketCount--;
					topWL--; 
					
				}
			}
			System.out.println("Cancel Successfully...");
		}
	}
	private int cancel(int availableberth,String bp) {
		if(topRAC!=0) {
			//seat change : 
			String seatNum=bookedTicket[topTicketCount].allotted; 
			bookedTicket[topTicketCount++]=bookedRAC[0];
			swapBerthId(seatNum,topTicketCount-1,bp);
			//bookedTicket[topTicketCount++]=bookedRAC[0];
			avaiableTicketCount--;
			//RAC SWAP
			if(topRAC==1) {
				topRAC--;
				//2 conditions
			    availableberth--;
				availableRacTickets++;
			}
			else if(topRAC>1) {
				for(int j=0;j<topRAC-1;j++) {
					bookedRAC[j]=bookedRAC[j+1];
				}
				topRAC--;
			    availableberth--;
				availableRacTickets++;
			}else {
				System.out.println("----");
			}
			//waiting LIst CHeck:
			//same like RAC
		/*===================================================================*/
			if(topWL!=0) {
				/*Seat Number and Berth CHange */
				//String seatNum=bookedTicket[topTicketCount].allotted;
				seatNum=bookedRAC[topRAC].allotted;
				bookedRAC[topRAC++]=bookedWL[0];								
				//SEAT NO AND BERTH PERFERNCE CANGE CODE:
				swapBerthIdWL(seatNum,topRAC-1,"RAC"); 
				avaiableTicketCount--;
				if(topWL==1) {
					topWL--;
					//2 conditions
					availableWaitingList++;
					availableRacTickets--; // >>>
					avaiableTicketCount++;

				}
				else if(topWL>1) {
					for(int j=0;j<topWL-1;j++) {
						bookedWL[j]=bookedWL[j+1];
					}
					topWL--;  // >>>
					availableRacTickets--; ///>>
					availableWaitingList++;  //>>>
					avaiableTicketCount++;

				}else {
					System.out.println("------");
				}
			}	
		}
		return availableberth;
	}
	private void swapBerthId(String seatNum, int index, String bP) {
		bookedTicket[index].berthPreference= bP;
		bookedTicket[index].allotted=seatNum;
	}
	private  void swapBerthIdWL(String seatNum, int index, String bP) {
		bookedRAC[index].berthPreference=bP;
		bookedRAC[index].allotted=seatNum;
	}
}






















//private void cancelUpper() {
//if(topRAC!=0) {
//	/*Seat Number and Berth CHange 
//	 * LINE NUMBER : 104,106,107
//	 */
//	String seatNum=bookedTicket[topTicketCount].allotted; 
//	//System.out.println("Checking allotted : (B)" + seatNum);
//	
//bookedTicket[topTicketCount++]=bookedRAC[0];
//	//CHANGING BERTHPERFERENCE:
//	//bookedTicket[topTicketCount-1].bP='U';
//	//CHANGE SEAT NUMBER:
////	String seatNum=bookedTicket[topTicketCount].allotted; //100 LINE NUMBER
//	//System.out.println(bookedTicket[topTicketCount-1].allotted=seatNum);
//	//System.out.println("Checking allotted : (A)" + seatNum);
//	//change berth();
//	swapBerthId(seatNum,topTicketCount-1,"U");  //105,108  ||  PASS  : 
//	
//	avaiableTicketCount--;
//	//RAC SWAP
//	if(topRAC==1) {
//		topRAC--;
//		//2 conditions
//	    availableUpperBerths--;
//		availableRacTickets++;
//		System.out.println("CHeck top==1 : (if)");
//		/*checking new code*///++++++++++++++++++++++++++
//	   avaiableTicketCount++;
//
//	}
//	else if(topRAC>1) {
//		for(int j=0;j<topRAC-1;j++) {
//			bookedRAC[j]=bookedRAC[j+1];
//		}
//		topRAC--;
//		availableUpperBerths--;
//		availableRacTickets++;
//		System.out.println("CHeck top>1 : (else if)");
//		avaiableTicketCount++;
//
//	}else {
//		System.out.println("CHeck top==1! : (else)");
//	}
//	//waiting LIst CHeck:
//	//same like RAC
///*===================================================================*/
//	if(topWL!=0) {
//		/*Seat Number and Berth CHange */
//		//String seatNum=bookedTicket[topTicketCount].allotted;
//		seatNum=bookedRAC[topRAC].allotted;
//		bookedRAC[topRAC++]=bookedWL[0]; //bookedRAC								
//		//SEAT NO AND BERTH PERFERNCE CANGE CODE:
//		swapBerthIdWL(seatNum,topRAC-1,"RAC"); 
//		/*--------------
//		 * ----------------
//		 * --------------- */
//		avaiableTicketCount--;
//		if(topWL==1) {
//			topWL--;
//			//2 conditions
//			availableWaitingList++;
//			availableRacTickets--; // >>>
//			System.out.println("CHeck top==1(wLToRac) : (if)");
//			avaiableTicketCount++;
//
//		}else if(topWL>1) {
//			for(int j=0;j<topWL-1;j++) {
//				bookedWL[j]=bookedWL[j+1];
//			}
//			topWL--;  
//			availableRacTickets--; 
//			availableWaitingList++;  
//			System.out.println("CHeck top>1(wLToRac) : (else if)");
//			//++++++++++++++++++++++++++++++++++++++++++++++++++
//			avaiableTicketCount++;
//
//		}else {
//			System.out.println("CHeck top==1!(wLToRac) : (else)");
//		}
//	}
//}
//}
//private void cancelMiddle() {
//if(topRAC!=0) {
//	//seat change : 
//	String seatNum=bookedTicket[topTicketCount].allotted; 
//	bookedTicket[topTicketCount++]=bookedRAC[0];
//	swapBerthId(seatNum,topTicketCount-1,"M");
//	
//	//bookedTicket[topTicketCount++]=bookedRAC[0];
//	avaiableTicketCount--;
//	//RAC SWAP
//	if(topRAC==1) {
//		topRAC--;
//		//2 conditions
//		availableMiddleBerths--; //up / mi
//		availableRacTickets++;
//		System.out.println("CHeck top==1 : (if)");
//	}
//	else if(topRAC>1) {
//		for(int j=0;j<topRAC-1;j++) {
//			bookedRAC[j]=bookedRAC[j+1];
//		}
//		topRAC--;
//		availableMiddleBerths--;
//		availableRacTickets++;
//		System.out.println("CHeck top>1 : (else if)");
//	}else {
//		System.out.println("CHeck top==1! : (else)");
//	}
//	
//	//waiting LIst CHeck:
//	//same like RAC
///*===================================================================*/
//	if(topWL!=0) {
//		/*Seat Number and Berth CHange */
//		//String seatNum=bookedTicket[topTicketCount].allotted;
//		seatNum=bookedRAC[topRAC].allotted;
//		bookedRAC[topRAC++]=bookedWL[0]; //bookedRAC								
//		//SEAT NO AND BERTH PERFERNCE CANGE CODE:
//		swapBerthIdWL(seatNum,topRAC-1,"RAC"); 
//		avaiableTicketCount--;
//		if(topWL==1) {
//			topWL--;
//			//2 conditions
//			availableWaitingList++;
//			availableRacTickets--; // >>>
//			System.out.println("CHeck top==1(wLToRac) : (if)");
//			avaiableTicketCount++;
//
//		}else if(topWL>1) {
//			for(int j=0;j<topWL-1;j++) {
//				bookedWL[j]=bookedWL[j+1];
//			}
//			topWL--;  // >>>
//			availableRacTickets--; ///>>
//			availableWaitingList++;  //>>>
//			System.out.println("CHeck top>1(wLToRac) : (else if)");
//			avaiableTicketCount++;
//
//		}else {
//			System.out.println("CHeck top==1!(wLToRac) : (else)");
//		}
//	}	
//}
//}






/*		int n1=topTicketCount;
		for(int i=0;i<n1;i++) {
			Passenger p=bookedTicket[i]; 
			if(id==p.serialNumber) {
				if(p.berthPreference.equals("U")|| p.berthPreference.equals("u")) {
					if(topRAC!=0) {
						moveToRAC(i);
					}
					else if(topWL!=0){
						moveToWL(i);
					}
					else {
						for(int j=i;j<topTicketCount-1;j++) {
							bookedTicket[j] = bookedTicket[j+1];
						}
					System.out.println("Checking : " + topTicketCount--);
					}
					availableUpperBerths++;
				}
				else if(p.berthPreference.equals("M") || p.berthPreference.equals("m")) {
					if(topRAC!=0) {
						moveToRAC(i);
					}
					else if(topWL!=0){
						moveToWL(i);
					}
					else {
						for(int j=i;j<topTicketCount-1;j++) {
							bookedTicket[j] = bookedTicket[j+1];
						}
					}
//					topTicketCount--;
					availableMiddleBerths++;
				}
				else if(p.berthPreference.equals("L") || p.berthPreference.equals("l")) {
					if(topRAC!=0) {
						moveToRAC(i);
					}
					else if(topWL!=0){
						moveToWL(i);
					}
					else {
						for(int j=i;j<topTicketCount-1;j++) {
							bookedTicket[j] = bookedTicket[j+1];
						}
					}
//					topTicketCount--;
					availableLowerBerths++;
				}
		}
	}
		System.out.println("Ticket Canceled Successful!!!");
	}
	private void moveToWL(int i) {
		for(int j=i;j<topTicketCount-1;j++) {
			bookedTicket[j] = bookedTicket[j+1];
		}
		bookedTicket[topTicketCount++] = bookedWL[0];
			for(int k=0;k<topRAC-1;k++) {
				bookedWL[k] = bookedWL[k+1];
			}
		topWL--;
		availableWaitingList++;
	}
	private void moveToRAC(int i) {
		for(int j=i;j<topTicketCount-1;j++) {
			bookedTicket[j] = bookedTicket[j+1];
		}
		topTicketCount--;
		bookedTicket[topTicketCount++] = bookedRAC[0];
		if(topRAC==1) {
			topRAC--;
			availableRacTickets++;
		}
		else {
			for(int k=0;k<topRAC-1;k++) {
					bookedRAC[k] = bookedRAC[k+1];
				}
			topRAC--;
			availableRacTickets++;
		}
	}*/




/*	public int moveToRacTicket() {
		int racSize = topRAC; //2
		int k=0;
		//			if(topTicketCount != n) {
		System.out.println("Move to Lower");
		for(int i=topTicketCount;i<bookedTicket.length;i++) {
			bookedTicket[topTicketCount++] = bookedRAC[k];
			//topRAC--;
			k++;
		}
		return k;	
		//			else {
		//				int k =0;
		//				while(swap!=0) {
		//					for(int j=k;j<racSize-1;j++) {
		//						bookedRAC[j] = bookedRAC[j+1];
		//						k++;
		//						swap--;
		//					}
		//					avaiableTicketCount++;
		//					topRAC--; 
		//					availableRacTickets++;
		//				}
		//			}
	}
	public void moveToWLTicket() {
		int wlSize = topWL;
		if( topRAC == n) {
			System.out.println("-No Move-");
		}
		else {
			if(topRAC != n) {
				for(int i=0;i<bookedRAC.length;i++) {
					bookedRAC[topTicketCount++] = bookedWL[i];
					topWL++;
				}
			}
			else {
				int k=0;
				for(int j=k+1;j<wlSize-1;j++) {
					bookedWL[j] = bookedWL[j+1];
					k++;
				}
				avaiableTicketCount++;
				topWL--; 
				availableWaitingList++;
			}
		}
	}*/


/*//				topTicketCount--; 
//				avaiableTicketCount++;
//				int n2=topRAC;
//				if(topRAC==1) {
//					topRAC--;
//					System.out.println("topRAC"+topRAC);
//				}
//				else if(topRAC>1 && topTicketCount>n) {
//					int k = 0 ;// moveToRacTicket();
//					while(k!=0) {
//						for(int s=0;s<n2;s++) {
//							for(int j=s;j<n2-1;j++) {
//								bookedRAC[j] = bookedRAC[j+1];
//							}
//							topRAC--; 
//							availableRacTickets++;
//						}
//						k--;
//					}
//
//				}
//				else {
//					System.out.println("------------");
//				}
//
//			}
//		}
		//		if( topTicketCount == n) {
		//			System.out.println("-No Move-");
		//		}
		
		//RAC Cancel
//		for(int i=0;i<n2;i++) {
//			Passenger p=bookedRAC[i]; 
//			if(id==p.serialNumber) {
//				for(int j=i;j<n2-1;j++) {
//					bookedRAC[j] = bookedRAC[j+1];
//				}
//				topRAC--; 
//				availableRacTickets++;
//			}
//		}
	  
//		//Waiting List
//		for(int i=0;i<n3;i++) {
//			Passenger p=bookedWL[i]; 
//			if(id==p.serialNumber) {
//				for(int j=i;j<n3-1;j++) {
//					bookedWL[j] = bookedWL[j+1];
//				}
//				topWL--; 
//				availableWaitingList++;
//				avaiableTicketCount++;
//			}*/