package knightingale;

import java.util.Scanner;

public class LoopingConstruct {
	public static void main(String[] args) {
		// My objective is to print n even numbers.
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();

		System.out.println("Looping starts");
		while (n > 0) {		// Until the expression returns true the loop will continue; while is a pre-check loop
			if (n % 2 == 0) {
				System.out.println(n + " is an even number....");
			}
			--n;
		}
		System.out.println("Looping ends");

		n = 10;
		do {
			if (n % 2 != 0) {
				System.out.println(n + " is an odd number");
			}
			--n;
		} while (n > 0);
		
		scan.close();
	}
}
