package exception;

public class MainSingle {
	public static void main(String args[]) {
		//	SingleToneClass a = new SingleToneClass(); //Constructor is private so can't create object
            SingleToneClass a = SingleToneClass.getObject();
            System.out.println(a.str);
	}
}
