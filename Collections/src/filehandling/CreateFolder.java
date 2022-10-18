package filehandling;
import java.io.*;

//Create File 

public class CreateFolder {

	public static void main(String[] args) {
//		File f = new File("C:\\Users\\Administrator\\Desktop\\Fildhandling");  --> Single Folder create. use mkdir()
		File f = new File("C:\\Users\\Administrator\\Desktop\\Filedhandling\\Sample\\Hello");  //--> Multiple folder Create - use mkdirs()
		if(!f.exists()) {
			f.mkdirs();
			System.out.println("File Successfully Created...");
		}
		else {
			System.out.println("File Already Exists...");
		}	
	}
}
