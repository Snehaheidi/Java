package sample;

public interface Subtraction {
	private void view() {
		System.out.println("Pivate Method....");
	}
    public int sub_inter(int a,int b);
    default void display() {
    	view();
		System.out.println("Interface Private Method called --> default Method...");
	}
}
