package dungeon;

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);
	int adventureRow , adventureColumn ,goldRow,goldColumn;
	public static void main(String[] args) {
	   Main m = new Main();
	   m.getInfo();
	}
    public void getInfo() {
    	System.out.println("Enter the row & column");
    	int row = scanner.nextInt();
    	int column = scanner.nextInt();
	   System.out.println("Enter the Adventure Position : ");
	   adventureRow = scanner.nextInt();
	   adventureColumn = scanner.nextInt();
	   System.out.println("Enter the Gold Position : ");
	   goldRow= scanner.nextInt();
	   goldColumn = scanner.nextInt();
	   LevelOne one = new LevelOne(row,column,adventureRow,adventureColumn,goldRow,goldColumn);
	    one.shortPath();
	}
}
