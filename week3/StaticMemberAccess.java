package knightingale.week3;

public class StaticMemberAccess {
	public static void main(String[] args) {
		StaticMemberClass obj = new StaticMemberClass();
		
		obj.increaseCount();
		obj.increaseCount();
		obj.increaseCount();
	}
}

class StaticMemberClass {
	static int count = 0;
	
	static {
		System.out.println("The initial count from the StaticMemberClass is " + count);
	}
	
	public void increaseCount() {
		StaticMemberClass.count++;
		System.out.println("The count is increased to " + count);
	}
}
