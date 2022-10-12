package railway;
import java.util.Scanner;

//extends Booking
public class MainManagement extends Booking
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        System.out.println("\n-------------------RAILWAY RESERVATION----------------------");
        while (loop) {
            System.out.println("1. Booking Ticket \n2. Cancel Ticket \n3. Available Tickets \n4. View Booked Tickets \n5. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                // book ticket
                case 1: {
                    //get details from Passenger
                	System.out.println("How many Tickets booking?... ");
                	int n = scanner.nextInt();
                	int temp = n;
                	while(n!=0) {
                		System.out.println("Enter Passenger name:");
                        String name = scanner.next();
                        System.out.println("Enter Passenger Age:");
                        int age = scanner.nextInt();
                        System.out.println("Enter Passenger's Preferred Berth(L|M|U):");
                        String berthPreference = scanner.next();
                        Passenger p = new Passenger(name,age,berthPreference,pId);
                        Booking b = new Booking();
                        b.bookTicket(p);
                        n--;
                	}
                	new PrintAvailable(temp);
                	pId++;
                }
                break;
                //cancel ticket
                case 2: {
                    System.out.println("Enter Serial Number to cancel : ");
                    int id = scanner.nextInt();
                    CancelTicket c = new CancelTicket();
                    c.cancel(id);
                }
                break;
                //available tickets print
                case 3: {
                    new PrintAvailable();
                }
                break;
                case 4: {
                	PrintBookedDetails bd = new PrintBookedDetails();
                	 System.out.println("Enter passenger Id :");
                     int id = scanner.nextInt();
                	 bd.view(id);
                }
                break;
                case 5: {
                    loop = false;
                }
                break;
                default:
                	System.out.println("Choose Correct Option..!!!");
                    break;
            }
        }
        scanner.close();
    }
}