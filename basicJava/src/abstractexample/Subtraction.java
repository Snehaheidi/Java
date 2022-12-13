package abstractexample;

public abstract class Subtraction extends Addition{
	public Subtraction() {
		System.out.println("Abstract Construcor");
	}
//	private abstract void view(); --> abstract method can't declare private
   public abstract void subtract();
   
   //public abstract void addition();
   public void display() {
	   System.out.println("Abstract  Method ");
   }
}
