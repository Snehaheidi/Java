package supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class BuyThings {
	Scanner scanner = new Scanner(System.in);
	private int price;
	int[] choice = new int[256];
	int[] kg = new int[256];
	private final int rice = 50 , wheat = 35 , icecream = 30,milk = 22;
	private ArrayList<String> list = new ArrayList();
	private ArrayList<Integer> kilogram = new ArrayList(); 
	public void select() {
		System.out.println(" 1).rice \n 2).wheat \n 3).icecream \n 4).milk \n");
		System.out.println("Number of Item : ");
		int n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Item : ");
			choice[i] = scanner.nextInt();
			System.out.println("Enter the Quantity : ");
			kg[i] = scanner.nextInt();
			kilogram.add(kg[i]);
		}
		getThing(choice,kg);
	}
	private void getThing(int[] choice,int[] kg) {
		int amt = 0,kg1=0,ch=0;	
		for(int i=0;i<choice.length && choice[i]!=0;i++) {
			ch = choice[i];
			kg1 = kg[i];
			//System.out.println(ch);
			switch(ch) {
			case 1:
				//System.out.println("1 kg rice = 50/-");
				amt = kg1 * rice;
				price += amt;
				list.add("rice");
				break;
			case 2:
				//System.out.println("1 kg Wheat = 35/-");
				amt = kg1 * wheat;
				price += amt;
				list.add("wheat");
				break;
			case 3:
				//System.out.println("one ice cream = 30/-");
				amt = kg1 * icecream;
				price += amt;
				list.add("icecream");
				break;
			case 4:
				//System.out.println("1 liter Milk = 22/-");
				amt = kg1 * milk;
				price += amt;
				list.add("milk");
				break;
			default:
				System.out.println("Enter the Correct Option..");
				select();
				break;
			}	
		}
		System.out.println("ThankYou...");
		display(price,list);
	}
	private void display(int price, ArrayList<String> list) {
		System.out.println("No. \t  Name \t\t  Quantity \t\t Price");
		System.out.println("--------------------------------------------------------\n");
		for(int i=0;i<list.size();i++) {
			System.out.print((i+1)+"\t\t"+list.get(i));
			if(list.get(i)=="rice") {
				System.out.print("\t\t"+kilogram.get(i)+"\t\t"+kilogram.get(i)*rice);
			}
			else if(list.get(i)=="wheat") {
				System.out.print("\t\t"+kilogram.get(i)+"\t\t"+kilogram.get(i)*wheat);
			}
			else if(list.get(i)=="icecream") {
				System.out.print("\t\t"+kilogram.get(i)+"\t\t"+kilogram.get(i)*icecream);
			}
			else if(list.get(i)=="milk") {
				System.out.print("\t\t"+kilogram.get(i)+"\t\t"+kilogram.get(i)*milk);
			}
			System.out.println("");
		}
		System.out.println("---------------------------------------------------");
		System.out.println("\tTotal Price = "+price);
		payAmount(price);
	}
	private void payAmount(int price) {
		System.out.println("\n1)GPay \t 2)PhonePe \t 3)COD \t 4)Cancel Order");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Successfully Paid");
			System.out.println("Welcome Back....");
			break;
		case 2:
			System.out.println("Successfully Paid");
			System.out.println("Welcome Back....");
			break;
		case 3:
			System.out.println("Successfully Paid");
			System.out.println("Welcome Back....");
			break;
		case 4:
			System.out.println("Sorry...");
			break;
		}
	}
}
