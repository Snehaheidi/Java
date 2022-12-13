package basicJava;

import java.util.Scanner;

public class LeedCodeColorMatrix {
	static Scanner scanner = new Scanner(System.in);
	private static int original ;
	private static int n ;
	 private static int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
	public static void main(String[] args) {
		n = scanner.nextInt();
		int[][] color = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				color[i][j] = scanner.nextInt();
			}
		}
		int row = scanner.nextInt();
		int column = scanner.nextInt();
		int newColor = scanner.nextInt();
		findColor(color,n,row,column,newColor);
	}
	private static void findColor(int[][] color, int n,int row,int column,int newColor) {
		
		if(newColor==color[row][column] || color.length == 0 || color == null) {
			printMatrix(color,n);
		}
		// int height = color.length;
		// int width = color[0].length;
		// System.out.println(height+"  "+width);
		original = color[row][column];
		dfs(color,row,column,newColor);
		   printMatrix(color,n);

	}

    private static void dfs(int[][] color, int r, int c, int newColor){
        color[r][c] = newColor;
        int tx = 0, ty = 0;
        for(int i = 0; i < n+1; i++){
            tx = r + dir[i][0];
            ty = c + dir[i][1];
            if(tx >= 0 && tx < n && ty >= 0 && ty < n && color[tx][ty] == original){
            	dfs(color,tx,ty,newColor);
            }
        }
    }
	private static void printMatrix(int[][] color, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(color[i][j]+" ");
			}
			System.out.println("");
		}	
	}
}