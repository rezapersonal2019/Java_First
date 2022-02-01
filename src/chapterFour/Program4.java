package chapterFour;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		
		// Create a scanner object
	Scanner input = new Scanner (System.in);	
		
	
	// Receive the length of side
	System.out.println(" Enter the length of side: ");
	double s = input.nextDouble();
	
	// Compute the area of a hexagon
	
	double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI /6));
	
	// Display results
	System.out.printf("The are of the hexagon is %4.2f\n", area);
	//System.out.print(" The area of the hexagon is " + area);
		}

}
