package taskfour;

public class HolidayCheck {

	public static void main(String[] args) {
		Holiday h = new Holiday("diwali",24,"October");
		Holiday h1 = new Holiday("pongal",14,"january");
		Holiday h2 = new Holiday("IndependenceDay",4,"july");
		boolean flag = h.inSameMonth(h1);
	    System.out.println(flag);
	     
	    Holiday[] date = {h,h1,h2};
	    double average = Holiday.avgDate(date);
	    System.out.println(average);
	}
}
