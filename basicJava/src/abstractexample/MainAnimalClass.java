package abstractexample;

public class MainAnimalClass {

	public static void main(String[] args) {
		Animal lion = new Lion();
		lion.eat();
		lion.walk();
		lion.leg(); // abstract method
	}
}
