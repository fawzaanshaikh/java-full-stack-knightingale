package knightingale.week2;

import java.util.Scanner;

public class AreaOfARectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the lenght of Reactangle : ");
		
		double lenght = sc.nextDouble();
		System.out.println("Enter the width of the rectangle");
		
		double width = sc.nextDouble();
		double sum = lenght * width;
		System.out.println(" the area of the reactangle is : " + sum);
		
		sc.close();
	}
}
