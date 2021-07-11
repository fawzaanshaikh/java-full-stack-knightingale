package knightingale;

public class NestedForLop {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("-----------------------------------------");
			System.out.println("i : " + i);

			for (int j = 0; j <= 4; j++) {
				System.out.println("-----------------------------------------");
				System.out.println("j : " + j);
			}
		}
	}
}
