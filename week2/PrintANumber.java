package knightingale.week2;

import java.util.Scanner;

public class PrintANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("The entered number is: " + num);		
		
		sc.close();
	}
}
