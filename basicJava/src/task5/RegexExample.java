package task5;

import java.util.Scanner;

public class RegexExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		int[][] matrix = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		findRotateMatrix(matrix,row,col);
       scanner.close();
	}

	private static void findRotateMatrix(int[][] matrix, int row, int col) {
//		int temp=0;
		for(int i=0;i<row;i++) {
			for(int j=col-1;j>=0;j--) {
				swapping(matrix,i,j,row);
			}
		}
//		for(int i=0;i<row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println("");
//		}
	}

	private static void swapping(int[][] matrix, int i, int j,int row) {
        int temp ,k;
		for(k=0;k<row;k++) {
			temp = matrix[j][i];
			matrix[j][i] = matrix[i][k];
			matrix[i][k] = temp;
//			System.out.println(k);
		}
        System.out.println(i+" "+j+" "+k);
	}
}
