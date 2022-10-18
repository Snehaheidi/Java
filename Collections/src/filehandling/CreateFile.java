package filehandling;
import java.io.*;

//Create File  

public class CreateFile {

	public static void main(String[] args) {
		//create File Class - Object
		
		File f = new File("C:\\Users\\Administrator\\Desktop\\Fildhandling");
		try {
			if(f.createNewFile()) {
				System.out.println("File Successfully Created...");
			}
			else {
				System.out.println("File Doesn't Created...");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	 // Get File Name 
     System.out.println("File Name : "+f.getName());
     
	}

}
