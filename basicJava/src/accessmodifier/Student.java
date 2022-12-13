package accessmodifier;

//THIS KEYWORD   --> to refer current class instance variable
public class Student {

	String name ;
	int roll_no;
	
	Student(String name, int i) {
		this.name = name;     // name = name kudutha name null print aagum
		this.roll_no = i;
	}
	public void display() {
		this.name = "sneha";
	}
	public static void main(String[] args) {
		Student s = new Student("john",2);
		System.out.println("Name : "+s.name);
		System.out.println("RollNo : "+s.roll_no);
	}
}
//   If local variables(formal arguments) and instance variables are different, there is no need to use this keyword 