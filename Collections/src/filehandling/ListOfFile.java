package filehandling;
import java.io.*;

public class ListOfFile {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Administrator\\Desktop");
         String[] fileList =  f.list();
         int n = fileList.length;
         for(int i=0;i<n;i++) {
        	 System.out.println(fileList[i]);
         }
       File[] fileList1 = f.listFiles(); 
       for(File i : fileList1) {
    	   if(i.isFile()) {     // files manttum print pannum
    		   System.out.println(i);
    	   }
 
       }
       //Directory (folder)print pannum
       File[] fileList2 = f.listFiles(); 
       for(File i : fileList2) {
    	   if(i.isDirectory()) {     // files manttum print pannum  o/p --> C:\Users\Administrator\Desktop\Filedhandling
    		   System.out.println(i);
    	   }
       }
       
	}
}
//OUTPUT:
/*
Arattai.lnk
desktop.ini
eclipse - Shortcut.lnk
Eclipse IDE for Enterprise Java and Web Developers - 2022-09.lnk
Fildhandling
Filedhandling
GitHub.lnk

 * */