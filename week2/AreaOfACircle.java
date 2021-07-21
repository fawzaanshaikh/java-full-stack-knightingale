package knightingale.week2;

import java.util.Scanner;

public class AreaOfACircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius = sc.nextDouble();
		
		double area = Math.PI * (radius * radius);
		System.out.println("The Area of the square : " + area);
		
		double circumfrence = Math.PI * 2 * radius;
		System.out.println("The circumfrence of the circle is : " + circumfrence);
		
		sc.close();
	}
}
