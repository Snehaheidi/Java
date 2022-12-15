package dungeon;

public class LevelOne {
   int row,column,adventureRow,adventureColumn,goldRow,goldColumn;
   int[][] matrix;
	public LevelOne(int row, int column, int adventureRow, int adventureColumn, int goldRow, int goldColumn) {
		this.row = row;
		this.column = column;
		this.adventureRow = adventureRow;
		this.adventureColumn = adventureColumn;
		this.goldRow = goldRow;
		this.goldColumn = goldColumn;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j] = 1;
			}
		}
		
	}
	public void shortPath() {
		
	}
}