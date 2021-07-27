package knightingale.week3;

import java.util.Scanner;

public class SortAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		System.out.print("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Type 'a' for ascending order or 'd' for descending order: ");
		char type = sc.next().charAt(0);
		
		sc.close();
		
		sort(a, type);
	}
	
	public static void sort(int[] a, char type) {
		int i = 0, j = 0, temp;
		
		if (type == 'a') {			// In ascending order
			for (i = 0; i < a.length; i++) {
				for (j = i + 1; j < a.length; j++) {
					if (a[i] > a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			
			display(a);
		} else if (type == 'd') {	// In descending order
			for (i = 0; i < a.length; i++) {
				for (j = i + 1; j < a.length; j++) {
					if (a[i] < a[j]) {
						temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			
			display(a);
		} else {
			System.out.println("Invalid entry");
		}
	}
	
	public static void display(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
