package knightingale.week3;

public class PatternWiseNumberMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 0, 0, 0},
			  						  {2, 3, 0, 0},
									  {4, 5, 6, 0},
									  {7, 8, 9, 10}};
		
		int i = 0, j = 0;
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
