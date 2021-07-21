package knightingale.week2;

import java.util.Scanner;

public class Basic2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Please enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("The multiplication of the two numbers " + num1 + " and " + num2 + " is " + (num1 * num2));
		
		sc.close();
	}
}
