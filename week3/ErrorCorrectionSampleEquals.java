package knightingale.week3;

public class ErrorCorrectionSampleEquals {
	public static void main(String[] args) {
		int i = 243;
		int j = -243;
		
		if (i == j) { // The error was that there was a semicolon here
			System.out.println("Numbers are the same");
		} else {
			System.out.println("Numbers are not the same");
		}
	}
}
