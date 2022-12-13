package encaps;

public class SampleCode extends Student{
	public static void main(String[] args) {
		Teacher demo=new Teacher();
		String name = demo.getName();
		demo.setName("smnejhadmsnfs");
		System.out.println(demo.getName());
		demo.display();
		Student s = new Student();
		s.run();
	}
}
class Teacher {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Display Method : " + name);
	}
}
class Student extends Teacher {
   private String name = "sneha";
   public void run() {
	   System.out.println("Name : "+name);
   }
}