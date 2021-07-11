package knightingale;

import java.util.Scanner;

public class AreaOfASquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side length of the square: ");
		double side = sc.nextDouble();

		double area = side * side;
		System.out.println("the Area of the square is : " + area);

		sc.close();
	}
}
