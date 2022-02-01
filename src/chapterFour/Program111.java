package chapterFour;

import java.util.Scanner;

public class Program111 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an integer between 0 and 15
		System.out.print("Enter a decimal value (0 to 15): ");
		int decimal = input.nextInt();
		
		String hex = Integer.toHexString(decimal);
		
		System.out.println( " The hex value is " + hex);

		// Display its corresponding hex number
		
		if (decimal >= 0 && decimal <= 9)
			System.out.println(" The hex value is " + decimal);
		else if (decimal >= 10 && decimal <= 15)
		{
			int value = (decimal + 'A' - 10);
			System.out.println(" The hex value is " + (char)value);
		
		}
		else
			System.out.println(decimal + " is an invalid input");
		
	}

}
