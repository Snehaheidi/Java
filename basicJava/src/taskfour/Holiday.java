package taskfour;


public class Holiday {
	private String name;
	private int day;
	private String month;
    
     Holiday(String name,int day,String month) {
    	this.name = name;
    	this.day = day;
    	this.month = month;
    }
    public boolean inSameMonth(Holiday h) {
    	boolean flag = false;
    	if(h.month.equals(month)) {
    		flag = true;
    		return flag;
    	}
    	return flag;
    }
	static double avgDate(Holiday[] date) {
		double sum = 0;
		int n = date.length;
		for(Holiday h:date) {
			sum += h.day;
		}
		double ave = sum / n;
		return ave;
	}
}
