package knightingale.practice;

public class PaintBrushDemo {
	public static void main(String[] args) {
//		BadPaintBrush loki=new BadPaintBrush();
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Please enter your choice of color..1-red,2-blue,3-green");
//		int c=scan.nextInt();
//		loki.doPaint(c);

		GoodPaintBrush thor = new GoodPaintBrush();
		thor.doPaint(new GreenPaint());
	}
}

class GoodPaintBrush {

	public void doPaint(Paint paint) {
		System.out.println(paint);
	}
}

abstract class Paint {// paint is the parent abstract class

}

class RedPaint extends Paint {// red paint is kindof paint

}

class BluePaint extends Paint {// blue paint is kind of paint

}

class GreenPaint extends Paint {// green paint is kind of paint

}

class BadPaintBrush {
	public void doPaint(int i) {
		if (i == 1) {
			System.out.println("red colour...");
		} else if (i == 2) {
			System.out.println("blue color...");
		} else if (i == 3) {
			System.out.println("green color...");
		}
	}
}