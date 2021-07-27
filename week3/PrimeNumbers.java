package knightingale.week3;

public class PrimeNumbers {
	public static void main(String[] args) {
		System.out.print("2 ");
		
		int i = 3;
		for (i = 3; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPrime(int num) {
		int i, count = 0;
		for (i = 2; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		
		if (count >= 2) {
			return false;
		}
		
		return true;
	}
}
