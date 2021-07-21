package knightingale.practice;

public class ClassDemo {
	public static void main(String[] args) {
		new Human().work(); //new is equivalent to KUN, Anonymous Human Object
		Human fawzaan = new Human(); // Named Human object
		fawzaan.work();
		
		@SuppressWarnings("unused")
		Human faw; 	// Creating a reference variable of type Human class
		// faw.work(); will throw an NullPointer error
		
		int money = fawzaan.giveMoney();
		System.out.println(money);
		
		money = fawzaan.giveChange(100);
		System.out.println("The change is: " + money);
	}
}

class Human {
	public void work() {
		System.out.println("Work method of Human class is called.");
	}
	
	public int giveMoney() {
		return 100;
	}
	
	public int giveChange(int amount) {
		if (amount >= 100) {
			return amount - 50;
		} else {
			return amount;
		}
	}
}