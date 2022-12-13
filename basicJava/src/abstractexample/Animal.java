package abstractexample;

//ONLY PUBLIC OR PROTECTED IN ABSTRACT CLASS & define Nomral method 
public abstract class Animal {
     public abstract void eat();
     public abstract void walk();
  
     public Animal() {
    	 System.out.println("Animal Abstract class declare - Constructor ");
     }
     public void leg() {
    	 System.out.println("Every Animal Has Four Leg..");
     }
    	 
}