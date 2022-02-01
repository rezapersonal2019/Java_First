package chapterFour;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		
		char character;
		Scanner input = new Scanner (System.in);
		
		System.out.println(" Enter a character: ");
		character= input.next().charAt(0);
		
		System.out.println(" The Unicode for the character" + character + " is: " + (int)character );
		}
}
