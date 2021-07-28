package knightingale.week3;

public class BaseAndDerived {
	public static void main(String[] args) {
		Derived obj = new Derived();
		obj.useD();
	}
}

class Base {
	String method() {
		return "Wow";
	}
}

class Derived {
	public void useD() {
		Base z = new Base();
		System.out.println("base says, " + z.method());
	}
}