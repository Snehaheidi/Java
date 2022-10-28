package level3;

public class Task_Four extends AbstractClass{

	@Override
	public void insertMatrix(int entryCol, char ch, char[][] matrix, int row, int col) {
		int s = --entryCol;
		for(int i=row-1;i>=0;i--) {
			if(matrix[i][s]=='-') {
				matrix[i][s] = ch;
				break;
			}
			boolean outerLoop = false;
		  for(int j=s-1;j>=0;j--) {
			  if(matrix[i][j]=='-') {
					matrix[i][j] = ch;
					outerLoop = true;
					break;
				}
		  }
		  if(outerLoop) {
			  break;
		  }
		  for(int k=s;k<row;k++) {
			  if(matrix[i][k]=='-') {
					matrix[i][k] = ch;
					outerLoop = true;
					break;
				}
		  }
		  if(outerLoop) {
			  break;
		  }
		}
	}
	@Override
	public boolean isBalloon(int m, int n, char[][] matrix) {
		boolean flag = true;
		for(int i=0;i<m;i++) {
			
			for(int j=0;j<n-1;j++) {
				if(matrix[i][j]!=matrix[i][j+1]) { //ROW - SAME COLOR REMOVE
					flag = false;
				}
			}
			if(flag) {
				for(int k=0;k<n;k++) {
					matrix[i][k] = '-';
				}
			}
		}
		return false;
	}

}
