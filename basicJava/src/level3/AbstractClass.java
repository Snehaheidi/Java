package level3;

public abstract class AbstractClass {
	abstract public void insertMatrix(int entryCol, char ch, char[][] matrix,int row,int col);
	abstract public boolean isBalloon(int m,int n,char[][] matrix);
	public void printMatrix(int m,int n,char[][] matrix) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
