package interfacee;

public class ZohoC implements EmployeeRules , BankPay{
    BankPay bank = new ZohoC();
	public static void main(String[] args) {
		EmployeeRules emp = new ZohoC();
        emp.dressCode();
        emp.leave();
        emp.report();
        emp.workTime();      
        System.out.println("Salary : "+SALARY);
      //  emp.dailyTask(); // in this method can't call because object create in interface use
	}
    public void dailyTask() {
    	System.out.println("Task");
    }
	@Override
	public void dressCode() {
		System.out.println("DressCode Must");
	}

	@Override
	public void leave() {
		System.out.println("25 Days Leave per Year");
	}

	@Override
	public void report() {
		System.out.println("Report to our manager");
	}

	@Override
	public void workTime() {
		System.out.println("Time : 9 to 9");
	}
	@Override
	public void pay() {
		System.out.println("loan is paid monthly "+MINBAL);
	}
}
