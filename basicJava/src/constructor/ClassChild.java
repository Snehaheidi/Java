package constructor;

public class ClassChild extends ClassParent
{
	@Override
	public void Bank()
	{
		super.Bank();       //--> called parent class constructorS method
		
		color = "green";
		System.out.println("Indian Overseas Bank : ");
		System.out.println(color);
		
		super.display();  //--> called parent class method
//		System.out.println(super.color); // called parent class --> variable		
	}
/* public static void Result() {
		super.display();
		System.out.println(super.color);    // static  super keyword not allowed
	}*/
	public static void main(String[] args) 
	{
		ClassChild b = new ClassChild();
		b.Bank();
//		b.display(); //--> child object use panni --> parent class method access pannalam
	}
}