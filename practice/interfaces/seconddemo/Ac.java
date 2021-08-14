package knightingale.practice.interfaces.seconddemo;

public class Ac implements OnOff {
	@Override
	public void off() {
		System.out.println("compressor current is cut off...");
	}

	@Override
	public void on() {
		System.out.println("compressor compresses air and reduces the temperature.......");
	}
}
