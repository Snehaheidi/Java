package task5;

import java.util.Scanner;

public class RotateMatrix {

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
		System.out.print("[");
		for(int i=0;i<row;i++) {
			System.out.print("[");
			for(int j=col-1;j>=0;j--) {
				System.out.print(matrix[j][i]+",");
			}
			System.out.print("],");
		}
		System.out.print("]");
	}

}
