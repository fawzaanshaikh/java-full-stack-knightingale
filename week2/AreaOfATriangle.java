package knightingale.week2;

import java.util.Scanner;

public class AreaOfATriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triangle: ");
		double base = sc.nextDouble();
		
		System.out.println("Enter the height of the triangle: ");
		double height = sc.nextDouble();

		double area = (base * height) / 2;
		System.out.println("The area of the rectangle is: " + area);
		
		sc.close();
	}
}
