package chapterTwo;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		double vo, v1, t, a ;
		
		// Create the scanner object
		
		Scanner input = new Scanner(System.in);
		
		/* Prompt the user to enter the starting velocity v0 in meters/ second, the ending 
		 velocity v1 in meters/ seconds, and the time span t in seconds.
		 */
		
		System.out.print("Enter v0, v1 and t: ");
		vo = input.nextDouble();
		v1 = input.nextDouble();
		t = input.nextDouble();
		
		a = (v1 - vo)/ t;
		// display results
		System.out.println(" The average acceleration is " + a);
				

	}

}
