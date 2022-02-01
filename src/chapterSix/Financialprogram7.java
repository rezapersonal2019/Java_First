package chapterSix;

import java.util.Scanner;

public class Financialprogram7 {
	
	 public static double futureInvestmentValue(double investmentAmount, 
			                                    double monthlyInterestRate, int years)
	 {
				return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
			}
	
	/** Main Method */
	public static void main(String[] args) {
		
		final int NUMBER_OF_YEARS = 30; // Number of years to display
        double amount,
              annualInterestRate,
              monthlyInterestRate2; 
        // Create a Scanner
        
        Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the investment amount and interest rate
		System.out.print("\nThe amount invested: ");
		 amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		 annualInterestRate = input.nextDouble();

		// Get monthly interest rate
		 monthlyInterestRate2 = annualInterestRate / 1200;

		// Print a table that displays future value for the years from 1 to 30
		System.out.println("Years     Future Value"); // Table header
		for (int yearss = 1; yearss <= NUMBER_OF_YEARS; yearss++) {
			System.out.printf("%-10d", yearss);
			System.out.printf("%11.2f\n", 
				futureInvestmentValue(amount, monthlyInterestRate2, yearss));
		}
	}

	

	
}

