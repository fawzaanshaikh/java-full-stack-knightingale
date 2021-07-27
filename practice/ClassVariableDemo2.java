package knightingale.practice;

public class ClassVariableDemo2 {
	/**
	 * Variables are instance and class variables too
	 * 
	 */
	
	static int i = 100;
	
	public static void main(String[] args) {
		// Static fields can be directly accessed, you don't need to create an instance
		// of the class, because JVM instantiates all static fields and static methods.
		// Static fields/variables are shared by multiple instances of the class.
		
		TrainingRoom room1 = new TrainingRoom();
		room1.projector = "sanyo";
		// room1.toilet = "western";
		TrainingRoom.toilet = "western";
		System.out.println(ClassVariableDemo2.i);
		ClassVariableDemo2.i = 399393;
		System.out.println(ClassVariableDemo2.i);
		
		TrainingRoom room2 = new TrainingRoom();
		room2.projector = "huawei";
		// room2.toilet = "indian";
		
		System.out.println(room1.projector + " : " + TrainingRoom.toilet);
		System.out.println(room2.projector + " : " + TrainingRoom.toilet);
	}
}

class TrainingRoom {
	String projector;
	static String toilet;
}
