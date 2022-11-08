package filehandling;
import java.io.*;

public class FileWriterReader {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Administrator\\Desktop\\sample.txt"); //--> File object create -- object ah pass pantradhu
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write("Nothing!!!...");
			fw.flush();
			fw.close();	
			System.out.println("Success..");
			FileReader fr = new FileReader(f);
		    int read = fr.read();
			while(read!=-1) {   // -1 - the file is empty
				System.out.print((char)read);  // typeCasting -- char by char read the file
				read = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
