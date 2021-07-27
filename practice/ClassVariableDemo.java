package knightingale.practice;

public class ClassVariableDemo {
	/**
	 * 1. Instance variable
	 * 2. Local variable
	 * 
	 * Local variables are not initialized but the instance variables are
	 * Local variables cannot be accessed outside the method
	 * */
	
	int i = 10;	// Instance variable
	
	public static void main(String[] args) {
		ClassVariableDemo obj = new ClassVariableDemo();
		obj.met();
		System.out.println();
		obj.i = 595959;
		obj.met();
		System.out.println();
		
		ClassVariableDemo obj2 = new ClassVariableDemo();
		obj2.met();
	}
	
	public void met() {
		int i = 20; // Local variable - that is inside a method
		System.out.println("The local number is " + i);
		System.out.println("The instance number is " + this.i);
	}
}
