package knightingale.week3;

import java.util.Scanner;

public class LocateInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		
		System.out.print("Enter " + n + " elements: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element you would like to locate: ");
		int locate = sc.nextInt();
		
		locateInArray(a, locate);
		
		sc.close();
	}
	
	public static void locateInArray(int[] a, int locate) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == locate) {
				System.out.println("The element " + locate + " was found at location " + i);
				return;
			}
		}
		
		System.out.println("The element was not found");
	}
}
