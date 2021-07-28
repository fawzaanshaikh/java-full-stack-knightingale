package knightingale.week3;

import java.util.Scanner;

public class NumberToWords {
	
	static int placeCount = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		sc.close();
		
		toWords(num);		
	}
	
	public static void toWords(int num) {
		String result = "";
		int quo, rem;
		
		quo = num;
		if (quo == 0) {
			result = "zero";
		}
		else {
			while (quo != 0) {
				rem = quo % 10;
				quo /= 10;
				if (rem != 0) {
					result = numberWord(rem, result);
				}
				placeCount++;
			}			
		}
		
		System.out.println(result);
	}
	
	public static String numberWord(int number, String result) {
		result = placesWord(result);
		
		String[] numbers = new String[] {"one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
		String[] tensPlace = new String[] {"ten ", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
		String[] teens = new String[] {"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
		
		// Three conditions :- 1. Normal number, 2. A teen number, 3. One's place is zero
		if (number == 1 && placeCount == 1) {	// Teen number
			System.out.println(result);
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i].equalsIgnoreCase(result)) {
					return teens[i];
				}
			}
		}
		else if (placeCount == 1) {	// One's place is zero , or any ten's place number
			return (tensPlace[number - 1] + result); 
		}
		else {	// Normal number
			return (numbers[number - 1] + result);
		}
		return (numbers[number - 1] + result);
	}
	
	public static String placesWord(String result) {
		String[] places = new String[] {"hundred ", "thousand "};
		if (placeCount >= 2) {
			result = places[placeCount - 2] + result;			
		}
		return result;
	}
}
