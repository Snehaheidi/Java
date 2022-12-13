package encaps;
class Visitor{
	int id = 10;  // do not declare private in this variable 
	Integer intvalue = 10;
	Integer changeValue ;
	
	public String getValue() {
		return String.valueOf(changeValue);  // change the data type
	}
	public void setValue(String changeValue) {
		this.changeValue = Integer.parseInt(changeValue);
	}
	
}

public class ExampleOne {

	public static void main(String[] args) {
		Visitor v = new Visitor();
		int n = v.id = 5;
		System.out.println("Id is : "+n);   // Now id value is changed --> Id is : 5   because the id is not private so anyone can access it outside the class
	   // v.intvalue = "20";  --> integer value do not change String so throw compile time error
	  
		v.setValue("20");
		System.out.println("The Id is : "+v.getValue());
	}

}
