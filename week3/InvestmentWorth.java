package knightingale.week3;

public class InvestmentWorth {
	public static void main(String[] args) {
		double investment = 14000d;
		
		// The result after first year
		double result = investment + investment * 0.4;
		
		// The result after the second year
		result -= 1500;
		
		// The result after the third year
		result = result + result * 0.12;
		
		System.out.println("The final worth of the investment is " + result);
	}
}
