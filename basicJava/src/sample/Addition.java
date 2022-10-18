package sample;

public interface Addition {
//    Addition(){
//    	Interfaces cannot have Constructors
//     }
//	
//	default void display() {
//		System.out.println("Interface hava Default Method....");
//	}
	public int add_inter(int a , int b);
	public static void Result() {
		System.out.println("Static method -> Addition Interface");
	}
}
