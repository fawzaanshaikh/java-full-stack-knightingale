package knightingale.week3;

public class LargestElementInRow {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{11, 22, 31, 14, 5},
			  						  {64, 77, 58, 49, 210},
									  {111, 132, 153, 174, 125},
									  {716, 178, 184, 179, 210},
									  {211, 322, 723, 274, 259}};
			 
		System.out.println("The largest element in each row is: ");
		int largest, i = 0, j = 0;
		for (i = 0; i < matrix.length; i++) {
			largest = largestInRow(matrix[i]);
			for (j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" : " + largest);
		}
	}
	
	public static int largestInRow(int[] row) {
		int max = row[0];
		for (int i = 0; i < row.length; i++) {
			if (max < row[i]) {
				max = row[i];
			}
		}
		
		return max;
	}
}
