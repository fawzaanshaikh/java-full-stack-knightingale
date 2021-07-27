package knightingale.week3;

import java.util.Scanner;

public class AverageOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements you would like to input: ");
		int n = sc.nextInt();
		
		System.out.print("Enter " + n + " number of elements: ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		sc.close();
		
		double average = getAverage(a);
		
		System.out.println("The average of the given " + n + " numbers is " + average);
	}
	
	public static double getAverage(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		double average = (double) sum / (a.length);
		return average;
	}
}
