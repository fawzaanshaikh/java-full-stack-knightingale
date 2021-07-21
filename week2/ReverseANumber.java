package knightingale.week2;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Enter the number
		System.out.println("Enter the number you would like to reverse: ");
		int num = sc.nextInt();
		
		int reverseNum = 0; // The variable holding the reversed number
		
		// Temporary variable to play around with
		int temp = num;
		
		// while loop to run till the quotient becomes zero and the number is seperated digit-wise and added by multiples of 10
		while (temp != 0) {
			reverseNum = reverseNum * 10 + (temp % 10);
			temp = temp / 10;
		}
		
		// Display the result
		System.out.println("The reversed number is - " + reverseNum);
		
		sc.close();
	}
}
