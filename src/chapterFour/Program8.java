package chapterFour;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Enter an ASCII code between 0 and 127: ");
		
		x = input.nextInt();
		
		System.out.println(" The character for ASCII code 65 is: " + (char)x);
	}

}
