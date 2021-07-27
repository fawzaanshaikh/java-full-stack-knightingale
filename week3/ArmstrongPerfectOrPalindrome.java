package knightingale.week3;

import java.util.Scanner;

public class ArmstrongPerfectOrPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int checked = 0;
		if (isArmstrong(num)) {
			System.out.println(num + " is an Armstrong Number");
			checked++;
		}
		
		if (isPerfect(num)) {
			System.out.println(num + " is a Perfect Number");
			checked++;
		}
		
		if (isPalindrome(num)) {
			System.out.println(num + " is a Palindrome Number");
			checked++;
		}
		
		if (checked == 0) {
			System.out.println(num + " is neither an Armstrong Number, a Perfect Number nor a Palindrome Number");
		}
		
		sc.close();
	}

	private static boolean isArmstrong(int num) {
		int rem = 0, quo = 0, cubeSum = 0;
		
		quo = num;
		while (quo != 0) {
			rem = quo % 10;
			quo /= 10;
			cubeSum += (rem * rem * rem);
		}
		
		if (cubeSum == num) {
			return true;
		}

		return false;
	}

	private static boolean isPerfect(int num) {
		int i, factorSum = 0;
		
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				factorSum += i;
			}
		}
		
		if (factorSum == num) {
			return true;
		}
		
		return false;
	}

	
	private static boolean isPalindrome(int num) {
		int rem, quo, rev = 0;
		
		quo = num;
		while (quo != 0) {
			rem = quo % 10;
			rev = rev * 10 + rem;
			quo /= 10;
		}
		
		if (rev == num) {
			return true;
		}
		
		return false;
	}
}
