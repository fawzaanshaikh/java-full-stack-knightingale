package knightingale;

import java.util.Scanner;

public class NestedSwitchCase {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Type any number between 1 to 5");

		int one = sc.nextInt();
		int two;
		switch (one) {
		case 1:
			System.out.println("The number is :" + one);
			break;
		case 2:
			System.out.println("Enter a number between one and two: ");
			Scanner sc2 = new Scanner(System.in);
			two = sc2.nextInt();
			switch (two) {
			case 1:
				System.out.println("The number is " + 2);
			}
		}
		
		sc.close();
	}
}
