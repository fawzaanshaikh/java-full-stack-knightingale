package knightingale;

public class ArrayDemo {
	public static void main(String[] args) {
		int marks[] = { 98, 89, 99 };	// array - a single dimensional array - we have pre-initialized the array

		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		int score[] = new int[3]; 		// 3 is size - you have created an empty array - we will be post initializing
		score[0] = 1010;
		score[1] = 3939;
		score[2] = 2333;

		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
	}
}
