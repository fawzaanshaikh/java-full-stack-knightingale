package knightingale;

import java.util.Scanner;

public class ArrayInputSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers to find their sum: ");
		int[] num = new int[10];
		
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
			sum += num[i];
		}
		
		System.out.println("The sum of the 10 numbers is " + sum);
		
		sc.close();
	}
}
