package knightingale.week3;

import java.util.Scanner;

public class QuadraticFunctionsProgram {
	public static void main(String[] args) {
		QuadraticFunction quad = new QuadraticFunction();
		QuadraticFunction quad2 = new QuadraticFunction(2, 3, 4);
		
		System.out.println("The first quadratic polynomial is : " + (quad.getA()) + "x^2 + " + (quad.getB()) + "x + " + (quad.getC()));
		System.out.println("The second quadratic polynomial is : " + (quad2.getA()) + "x^2 + " + (quad2.getB()) + "x + " + (quad2.getC()));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nChange the values of the first quad. polynomial to: ");
		quad.setA(sc.nextInt());
		quad.setB(sc.nextInt());
		quad.setC(sc.nextInt());		
		
		System.out.println("The first quadratic polynomial now is : " + (quad.getA()) + "x^2 + " + (quad.getB()) + "x + " + (quad.getC()));
		
		System.out.print("\nEnter the value for quad(x) : ");
		System.out.println("The value of the expression of quad(x) is " + quad.computeMethod(sc.nextInt()));
		
		System.out.print("\nEnter the value for quad2(x) : ");
		System.out.println("The value of the expression of quad2(x) is " + quad2.computeMethod(sc.nextInt()));
		
		sc.close();
	}
}

class QuadraticFunction {
	private int a, b, c;
	
	public QuadraticFunction() {
		this.a = this.b = this.c = 1;
	}
	
	public QuadraticFunction(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public int getC() {
		return this.c;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	public int computeMethod(int x) {
		return (this.a * x * x + this.b * x + this.c);
	}
}
