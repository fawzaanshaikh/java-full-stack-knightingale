package knightingale.week3;

import java.util.Scanner;

public class NumberOfDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year and the month number: ");
		int year = sc.nextInt();
		int monthNum = sc.nextInt();
		
		sc.close();
		
		String[] months = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		switch (monthNum) {
		case 1:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
		case 2: // February
			if (isLeapYear(year)) {
				System.out.print("29 days" + " in " + months[monthNum - 1] + " as it is a leap year");
			} else {
				System.out.print("28 days" + " in " + months[monthNum - 1]);				
			}
			break;
		case 3:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
		case 4:
			System.out.print("30 days" + " in " + months[monthNum - 1]);
			break;
		case 5:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
		case 6:
			System.out.print("30 days" + " in " + months[monthNum - 1]);
			break;
		case 7:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
		case 8:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
		case 9:
			System.out.print("30 days" + " in " + months[monthNum - 1]);
			break;
		case 10:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
		case 11:
			System.out.print("30 days" + " in " + months[monthNum - 1]);
			break;
		case 12:
			System.out.print("31 days" + " in " + months[monthNum - 1]);
			break;
			
		default:
			System.out.println("There can only be 12 months in the year " + year);
		}
	}

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
			} else {
				return true;
			}
		}
		
		return false;
	}
}
