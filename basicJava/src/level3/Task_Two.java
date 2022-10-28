package level3;

public class Task_Two extends AbstractClass{
	@Override
	public void insertMatrix(int entryCol, char ch, char[][] matrix, int row, int col) {
		int s = --entryCol;
		for(int i=row-1;i>=0;i--) {
			if(matrix[i][s]=='-') {
				matrix[i][s] = ch;
				break;
			}
		}
	}

	@Override
	public boolean isBalloon(int m,int n,char[][] matrix) {
		for(int i=0;i<m;i++) {
			int count = 0;
			for(int j=m-1;j>=0;j--) {
				if(matrix[j][i]!='-') {
					count++;
				}
			}
			if(count==m) {
				System.out.println("  Column is ﬁlled completely. Program is terminated..");
				return true;
			}
		}
	 return false;
	}
}
