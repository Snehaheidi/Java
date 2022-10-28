package task6;

import java.util.Scanner;

public class Balloon {
	 Scanner scanner = new Scanner(System.in);
	 int m = scanner.nextInt();
	 int n = scanner.nextInt();
	 char[][] matrix = new char[m][n];
//	 findMatrix(scanner,m,n,matrix);
	public void findMatrix(Scanner scanner,int m, int n, char[][] matrix) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = '-';
			}
		}
		printMatrix(m,n,matrix);
		entryMatrix(scanner,matrix,m,n);
	}

	public void entryMatrix(Scanner scanner,char[][] matrix,int m,int n) {
		 System.out.println("Enter the column : ");
		 int entryCol = scanner.nextInt();
		 System.out.println("Enter the color of the Balloon : ");
		 char ch = scanner.next().charAt(0);
		 insertMatrix(entryCol,ch,matrix,m,n);
		 System.out.println("Do you want continue ? Y||N");
		 char c = scanner.next().charAt(0);
		 if(c=='Y') {
				entryMatrix(scanner,matrix,m,n);
		 }
		 else {
			 System.out.println("Program Finish!!!");
		 }
		 
	}
	public void insertMatrix(int entryCol, char ch, char[][] matrix,int row,int col) {
//		int z = row - entryCol;
//		System.out.println(entryCol+" "+z);
//			if(matrix[entryCol][z]=='-') {
//				matrix[entryCol][z] = ch;
//				printMatrix(row,col,matrix);
//			}
		int s = --entryCol;
		for(int i=row-1;i>=0;i--) {
			if(matrix[i][s]=='-') {
				matrix[i][s] = ch;
				break;
			}
		}
		printMatrix(row,col,matrix);
	}
	public void printMatrix(int m,int n,char[][] matrix) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}