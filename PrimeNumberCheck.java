package knightingale;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		boolean primeNum = true;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any number to check whether it is a prime number or not");
		int num = sc.nextInt();
		sc.close();
		
		for (int i = 2; i <= num / 2; i++) {
			int temp = num % i;
			if (temp == 0) {
				primeNum = false;
				break;
			}
		}
		
		if (primeNum) {
			System.out.println(num + " is a prime number ");
		} else
			System.out.println(num + " is not a prime number ");
	}
}
