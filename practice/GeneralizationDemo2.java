package knightingale.practice;

public class GeneralizationDemo2 {
	public static void main(String[] args) {
		PaintBrush brush = new PaintBrush();
		brush.paint = new RedPaint2();
		brush.paint = new BluePaint2();
		// Paint paint=new Paint();
	}
}

class PaintBrush {
	Paint2 paint;
}

//common nouns are abstract in nature
//abstract class objects cannot be created
//but still abstract classes can have constructors
//you cannot have multiple inheritance
//but you can have multi level inheritance...
abstract class Liquid {}

abstract class Paint2 extends Liquid {
	public Paint2() {
		System.out.println("Paint class cons called.....");
	}
}

abstract class Milk{
	
}

class RedPaint2 extends Paint2 {
	public RedPaint2() {
		System.out.println("red paint construcor called...");
	}
}

class BluePaint2 extends Paint2 {
	public BluePaint2() {
		System.out.println("blue paint constructor called...");
	}
}
