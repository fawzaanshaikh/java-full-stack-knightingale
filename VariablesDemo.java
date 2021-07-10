package knightingale;

public class VariablesDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Variable valid identifiers */

		// A valid identifier always starts with a character or either of these two
		// special characters _, $ and in between, you can have a number
		int age;
		int _age;
		int $age;
		int _age_;
		int _$a_$g;
		int a2g2e;

		/* invalid identifiers */

		// int 2age;	// Cannot start a variable with a number
		// int @#@age;	// Cannot start a variable name with special characters other than $ and _
		// int a g e;	// Cannot have space in between the names

		// INITIALIZATION OF VARIABLES

		int i = 100;	// valid value to initialize 32 bit
		int ii = 21_47_48_3_647;
		short s = 2323; // 16 bit
		short ss = 32767;
		byte b = 10; 	// 8 bit
		byte bb = -128;

		long l = 21312312;
		// long mylong=(long)92233720368547758;

		char c = 'a';

		boolean boo = true;
		boolean booo = false;

		// boolean bbbbb=0; doesn't work since int cannot  

		String str = "hello world";
	}
}
