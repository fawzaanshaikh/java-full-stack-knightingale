package knightingale.week3;

public class ProtectedManipulation {
	public static void main(String[] args) {
		SecondClass sObj = new SecondClass();
		sObj.manipulateProtected();
	}
}

class FirstClass {
	protected int protectedNum = 10;
	
	FirstClass() {
		System.out.println("The value of the protected data member of FirstClass initially is " + this.protectedNum);
	}
}

class SecondClass {
	void manipulateProtected() {
		FirstClass fObj = new FirstClass();
		fObj.protectedNum = 12;
		System.out.println("The protected data member of FirstClass is manipulated and changed to " + fObj.protectedNum);
	}
}
