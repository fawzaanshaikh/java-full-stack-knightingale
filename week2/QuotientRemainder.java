package knightingale.week2;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int dividend = sc.nextInt();
		System.out.println("Enter the second number: ");
		int divisor = sc.nextInt();
		
		System.out.println("The quotient is: " + (dividend / divisor));
		System.out.println("The remainder is: " + (dividend % divisor));
		
		sc.close();
	}
}
