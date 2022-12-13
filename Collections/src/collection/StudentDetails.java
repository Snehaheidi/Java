package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDetails{
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {
        StudentDetail student = new StudentDetail();
        StudentDetail student1 = new StudentDetail("sneha",1001,21);
        StudentDetail student2 = new StudentDetail("thenmozhi",1002,23);
        StudentDetail student3 = new StudentDetail("chitra",1003,16);
        StudentDetail student4 = new StudentDetail("varnika",1004,20);
        ArrayList<StudentDetail> s = new ArrayList<>();
        s.add(student1);
        s.add(student2);
        s.add(student3);
        s.add(student4);
        Comparator<StudentDetail> cm1=Comparator.comparing(StudentDetail::getSname);  
        Collections.sort(s,cm1);  
        System.out.println("--------------------Sorting by Name--------------------------");  
        for(StudentDetail i:s){
            System.out.println("Name : "+i.getSname()+"\t\t Reg.No : "+i.getSId()+"\t\tAge: "+i.getSage());
        }
        ComparatorDemo cmd = new ComparatorDemo();
        for(StudentDetail i:s){
        	i.printDetails();
        }
        Collections.sort(s,cmd);
        System.out.println("-------------------------------------------------------------------------------");
        for(StudentDetail i:s){
        	i.printDetails();
        }
    }
}