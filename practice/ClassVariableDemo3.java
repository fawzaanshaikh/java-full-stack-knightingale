package knightingale.practice;

/*
 * 1. Class variable - only one copy is created by JVM for all the instances of the class
 * 2. Instance Variable - For every instance of the class, a new copy is created..
 * 3. Local Variable - For every client call a copy is created...
 *
 */
public class ClassVariableDemo3 {
	static int i;//class Variable
	int j;//instance variable.
	int k=3030330;
	public void met() {
		int k=20;//local variable
		System.out.println(k);
		System.out.println(this.k);
	}
	
	public static void main(String[] args) {
		ClassVariableDemo3.i=1010101;
		ClassVariableDemo3 obj1=new ClassVariableDemo3();
		obj1.j=393939;
			System.out.println(ClassVariableDemo3.i+":"+obj1.j);
		ClassVariableDemo3 obj2=new ClassVariableDemo3();
			System.out.println(ClassVariableDemo3.i+":"+obj2.j);
		ClassVariableDemo3 obj3=new ClassVariableDemo3();
			System.out.println(ClassVariableDemo3.i+":"+obj3.j);
			
			obj1.met();
	}
}