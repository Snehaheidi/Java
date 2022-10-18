package filehandling;
import java.io.*;

public class SpecificFileList {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Administrator\\Desktop");
		File[] fileList = f.listFiles();
		for(File i : fileList) {
			if(i.isFile()) {
				String fileName = i.getName();
				int index = fileName.lastIndexOf(".");
				String extension = fileName.substring(index+1);
				if(extension.equals("txt")) 
					System.out.println(fileName);
			}
		}
	}
}
