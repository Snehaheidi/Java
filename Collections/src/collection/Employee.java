package collection;

public class Employee {
	private String empName;
	private int age;
	private int empId;
	public Employee(String empName, int age, int empId) {
		this.empName = empName;
		this.age = age;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
