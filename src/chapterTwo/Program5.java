package chapterTwo;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// Create new Scanner object
		Scanner input = new Scanner(System.in);
		
		double subtotal, gratuityRate, gratuity, total;
		
		// Promt the user enter the subtotal and the gratuity rate
		
		System.out.print(" Enter the subtotal and a gratuity rate: ");
		
		subtotal = input.nextDouble();
		gratuityRate = input.nextDouble();
		
		// Calculate gratuity and total
		
		gratuity = subtotal * (gratuityRate/100);
		
		total = subtotal + gratuity;
		
		// Display results
		
		System.out.print(" The gratuity is $" + gratuity + 
				" and total is $" + total);
			}

}
