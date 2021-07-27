package knightingale.week3;

import java.util.Scanner;

public class ReverseElementsInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();

		System.out.print("Enter " + n + " elements: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("The reverse of the entries are: ");
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

		sc.close();
	}
}
