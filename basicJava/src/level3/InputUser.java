package level3;

import java.util.Scanner;

public class InputUser{
	public void findMatrix(AbstractClass task) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the M*N");
		 int m = scanner.nextInt();
		 int n = scanner.nextInt();
		 char[][] matrix = new char[m][n];
		assignMatrix(m,n,matrix);
		task.printMatrix(m, n, matrix);
		entryMatrix(scanner,matrix,m,n,task);
	}
	public void entryMatrix(Scanner scanner,char[][] matrix,int m,int n,AbstractClass task) {
		char c ='Y';
		 while(c=='Y') {
			 System.out.println("Enter the column : ");
			 int entryCol = scanner.nextInt();
			 System.out.println("Enter the color of the Balloon : ");
			 char ch = scanner.next().charAt(0);
			 task.insertMatrix(entryCol, ch, matrix, m, n);
			 if(task.isBalloon(m,n,matrix)) {
				 break;
			 }
			 task.printMatrix(m, n, matrix);
			 System.out.println("Do you want continue ? Y||N");
			 c = scanner.next().charAt(0);
			 if(c=='N') {
				System.out.println("----->>>>Program finish<<<<---");;
			 }
		 }
	}
	public void assignMatrix(int m,int n,char[][] matrix){
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				matrix[i][j] = '-';
			}
		}
	}
}