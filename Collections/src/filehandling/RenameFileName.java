package filehandling;
import java.io.*;

//Rename file name 

public class RenameFileName {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\Administrator\\Desktop\\Filedhandling\\Sample\\sample.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("File created..");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Rename Mehtod --> file name rename 
//		
//       File name = new File("C:\\Users\\Administrator\\Desktop\\Filedhandling\\Sample\\hello.txt");
//       if(file.renameTo(name)) {
//    	   System.out.println("File Name Successfully Renamed...");
//       }
//       else {
//    	   System.out.println("File Name not changed..");
//       }
	}

}
