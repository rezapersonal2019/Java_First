package chapterTwo;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		int time = 3600 * 24 * 365;
		int born = time/7;
		int death = time/13;
		int immigrant = time/45;
		int current_population = 312032486;
		int population = born + immigrant - death;
		int subTotal_population = current_population + population;
		
		//System.out.print( " SubTotal is " + subTotal_population);
		
		for (int i = 1; i <= 5; i++) {
			current_population = current_population + population;  // Calculate total population
			System.out.println(i + " year population is : " + current_population);
		}
		
		/* Scanner input = new Scanner (System.in);
		
		System.out.print(" Enter the numbers of year: ");
		
		int years = input.nextInt();
		
		int total_population = subTotal_population * years;
		
		System.out.print("The population in 5 years is " + total_population); */

	}

}
