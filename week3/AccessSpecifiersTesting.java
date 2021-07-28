package knightingale.week3;

public class AccessSpecifiersTesting {
	public static void main(String[] args) {
		AccessSpecifiersClass obj = new AccessSpecifiersClass();
		
		// obj.privateNum; // says that it is not visible
		System.out.println("The protected number is " + obj.protectedNum);
		System.out.println("The public number is " + obj.publicNum);
		System.out.println("The default number is " + obj.defaultNum);
		
		// obj.privateFunc();	// says that it is not visible
		obj.protectedFunc();
		obj.publicFunc();
		obj.defaultFunc();
	}
}

@SuppressWarnings("unused")
class AccessSpecifiersClass {
	private int privateNum = 10;
	protected int protectedNum = 11;
	public int publicNum = 12;
	int defaultNum = 13;
	
	private void privateFunc() {
		System.out.println("This is a private function.");
	}
	protected void protectedFunc() {
		System.out.println("This is a protected function.");
	}
	public void publicFunc() {
		System.out.println("This is a public function.");
	}
	void defaultFunc() {
		System.out.println("This is a default function.");
	}
}
