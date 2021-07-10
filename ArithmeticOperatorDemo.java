package knightingale;

public class ArithmeticOperatorDemo {
	public static void main(String[] args) {
		int i = 10;

		System.out.println(i);	// 10
		System.out.println(i++);	// post increment - the value of i will be printed first and it is increased -10
		System.out.println(i);		// i++ is nothing but i=i+1 so the value printed will be 11
		
		System.out.println("************************************");
		int j = 100;
		System.out.println(j);	// 100
		System.out.println(++j);	// pre increment - the value of j will be incremented first and then printed - 101;
		System.out.println(j);	// 101
		
		System.out.println("*************************************");
		int k = 20;
		System.out.println(k);	// 20
		System.out.println(k--);	// k=k-1, post decrement - the value of k will be printed first and then it is decreased - 20
		System.out.println(k);	// 19
		
		System.out.println("*************************************");
		int x = 200;
		System.out.println(x);	// 200
		System.out.println(--x);	// x=x-1, pre decrement - the value of x will be first decreased and then printed - 199
		System.out.println(x);	// 199

		System.out.println("*************************************");
		int myInt = 100;
		// myInt = myInt + 10;
		myInt += 10;	// Another syntax to achieve the above line in a short way- equivalent to myInt = myInt + 10
		System.out.println(myInt);	// 110
		myInt -= 10;
		System.out.println(myInt);	// 100
		myInt *= 2;
		System.out.println(myInt);	// 200
		myInt /= 2;
		System.out.println(myInt);

		int remainder = 1 % 2;			// 10 mod 2 - which basically gives you the remainder of the division
		System.out.println(remainder);	// 1
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(10 + 10);	// 20
		System.out.println(10 - 100);	// -90
		System.out.println(10 * 10);	// 100
		System.out.println(10 / 10);	// 1
		System.out.println(10 % 2);		// 0
	}
}
