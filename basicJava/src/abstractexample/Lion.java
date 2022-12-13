package abstractexample;

public class Lion extends Animal{

	@Override
	public void eat() {
		System.out.println("lion food habits ---> Lions are carnivores.");
	}

	@Override
	public void walk() {
	   System.out.println("A lion can run for short bursts at 50 mph & leap as far as 36 feet.");
	}
    public void king() {
    	System.out.println("“king of the jungle...”");
    }
}
