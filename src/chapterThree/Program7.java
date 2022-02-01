package chapterThree;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {

  // Create a scanner object
		
		Scanner input = new Scanner(System.in);
		
		// Receive the amount
		
		System.out.print("Enter and amount in double, for example 11.56: ");
		
		double amount = input.nextDouble();
		
	   int remainingAmount = (int) (amount * 100);
	   
	   // Find the number of one dollars
	   

	   int numberOfDollars = remainingAmount / 100;
	   remainingAmount = remainingAmount % 100;
	   
	   // Find the number of quarters in the remaining amount
	   
	   int numberOfQuarters = remainingAmount / 25;
	   remainingAmount = remainingAmount % 25;
	   
	   // Find the numbers of dimes in the remaining amount
	   
	   int numberOfDimes = remainingAmount / 10;
	   remainingAmount = remainingAmount % 10;
	   
	   // Find the numbers of nickels in the remaining amount
	   
	   int numberOfNickels = remainingAmount / 5;
	   remainingAmount = remainingAmount % 5;

	   
	// Find the number of pennies in the remaining amount
			int numberOfPennies = remainingAmount;

			// Display results
			System.out.println("Your amount " + amount + " consists of");
			System.out.println(" " + numberOfDollars + 
				(numberOfDollars == 1 ? " dollar" : " dollars"));
			System.out.println(" " + numberOfQuarters + 
				(numberOfQuarters == 1 ? " quarter" : " quarters"));
			System.out.println(" " + numberOfDimes +
				(numberOfDimes == 1 ? " dime" : " dimes")); 
			System.out.println(" " + numberOfNickels +
				(numberOfNickels == 1 ? " nickel" : " nickels"));
			System.out.println(" " + numberOfPennies +
				(numberOfPennies == 1 ? " pennie" : " pennies"));
	}
}













