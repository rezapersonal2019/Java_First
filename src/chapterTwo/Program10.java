package chapterTwo;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {


		double M, InitialTem, FinalTem, Q;
		
		// Create the scanner object
		
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the amount of water in kilograms.
		
		System.out.print(" Enter the amount of water in kilograms: ");
		 
		M = input.nextDouble();
		
		// Prompt the user to enter the initial temperature.
		
		System.out.print(" Enter the initial temperature: ");
		
		InitialTem = input.nextDouble();
		
		// Prompt the user to enter the final temperature.
		
		System.out.print(" Enter the final temperature: ");
		
		FinalTem = input.nextDouble();
		
		// Calculate the energy
		
		Q = M * ( FinalTem - InitialTem) * 4184;
		
		// Display result
		
		System.out.print(" The energy needed is "+ Q);

	}

}
