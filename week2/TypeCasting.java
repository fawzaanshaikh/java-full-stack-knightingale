package knightingale.week2;

public class TypeCasting {
	public static void main(String[] args) {
		byte x = 10;

		byte y = 5;

		// byte z=x*y;	// The result of a arithmetic operation will be always int

		int z = x * y;	// Automatic type promotion of byte to int

		int a = z;		// byte is a smaller data type compared to int, so byte can be stored in int but the other way is not possible

		// byte by=a;	// Smaller data type cannot store higher datatype
		
		// But, if you want to achieve that, you can do type casting

		byte by = (byte) a;
		System.out.println(by);

		int myInt = 257;
		byte myByte = (byte) myInt;	// Java will divide the number by 256 and reminder will be assigned to the left hand side variable
		System.out.println(myByte);

		float myFloat = 100.234f;

		myInt = (int) myFloat;		// This casting will also make the myFloat value lose its precision, by dropping the decimals
		System.out.println(myInt);
		
		char c = 'a';
		myInt = (int) c;
		System.out.println(myInt);

		myInt = 169;
		System.out.println((char) myInt);
	}
}
