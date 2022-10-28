package level3;

public class Task_One extends AbstractClass {

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
	   return false;
	}	
}
