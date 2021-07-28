package knightingale.week3;

public class ReverseRowInMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 2, 3, 4, 5},
			  						  {6, 7, 8, 9, 10},
			  						  {11, 12, 13, 14, 15},
			  						  {16, 17, 18, 19, 20},
			  						  {21, 22, 23, 24, 25}};
		
		System.out.println("The intial matrix is: ");
		int i = 0, j = 0;
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("After reversal of every row, the matrix now is: ");
		for (i = 0; i < matrix.length; i++ ) {
			matrix[i] = reverseRow(matrix[i]);
			for (j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[] reverseRow(int[] row) {
		int i = 0, temp;
		for (i = 0; i < row.length / 2; i++) {
			temp = row[i];
			row[i] = row[row.length - 1 - i];
			row[row.length - 1 - i] = temp;
		}
		
		return row;
	}
}
