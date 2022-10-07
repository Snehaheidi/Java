package constructor;

public class ClassParent 
{
	public ClassParent()  //-->Constructor
	{
		System.out.println("Constructor...");
	}
	static String color = "black";	  // --> super keyword use variable --> called child class
	public void Bank()            // --> Method Overriding
	{
	   String color = "white";	
       System.out.println("State Bank of India : ");
       System.out.println(color);
	}
	
	public void display()
	{
		//static int i =10;  --> non-static --> static var decalre panna mudiayathu
		System.out.println("The parent Class Executed...");
		System.out.println(color); //static varibale change child class so excute green var
	}
}
