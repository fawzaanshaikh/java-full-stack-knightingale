package knightingale.practice;

public class ConstructorDemo {
	public static void main(String[] args) {

		// Human.initialization(1000);

		HumanCons shoiab = new HumanCons("aaa");// this is at object level
		HumanCons shoiab2 = new HumanCons(100000);// this is at object level
		HumanCons.initialization(100);// this is at class level
		shoiab.business();
		shoiab2.business();
	}
}

class HumanCons {
	// A constructor is smillar to a method, but the name should be class name with
	// return or void
	// this constructor is called when the object of Human class is created..
	static int honey;

	HumanCons() {

	}

	HumanCons(int honey) {
		HumanCons.honey = honey;
		System.out.println("human cons called...");
	}

	HumanCons(String s) {
		System.out.println("That is " + s);
	}

	static void initialization(int honey) {
		HumanCons.honey = honey;
		System.out.println("initialization code called...");
	}

	public void business() {
		System.out.println("honey honey honey...:" + HumanCons.honey);
	}
}
