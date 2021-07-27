package knightingale.week3;

import java.util.Scanner;

public class SearchAndOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		
		System.out.print("Enter " + n + " elements: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.print("Enter the element you would like to search and find its number of occurences: ");
		int search = sc.nextInt();
		
		search(a, search);
		
		sc.close();
	}
	
	public static void search(int[] a, int search) {
		int occurences = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				System.out.println("Found " + search + " at " + (i + 1) + " (index base 1)");
				occurences++;
			}
		}
		
		System.out.println("There were " + occurences + " occurences of the number " + search);
	}
}
