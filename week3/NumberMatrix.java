package knightingale.week3;

public class NumberMatrix {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 2, 3, 4},
									  {5, 6, 7, 8},
									  {9, 10, 11, 12},
									  {13, 14, 15, 16}};
									  
		int i = 0, j = 0;
		for ( ; i < matrix.length; i++) {
			for (j = 0 ; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
