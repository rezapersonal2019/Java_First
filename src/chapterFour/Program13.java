package chapterFour;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		
		char letter;
		Scanner input = new Scanner(System.in);
		System.out.println(" Enter a letter: ");
		letter = input.next().charAt(0);
		
		if (letter == 'a' || letter == 'A') {
			System.out.println("Vowel");
			}
		
		else if (letter == 'e' || letter == 'E') {
			System.out.println("Vowel");
			}
		
		else if (letter == 'i' || letter == 'I') {
			System.out.println("Vowel");
			}
		
		else if (letter == 'o' || letter == 'O') {
			System.out.println("Vowel");
			}
		
		else if (letter == 'u' || letter == 'U') {
			System.out.println("Vowel");
			}
		
		else {
			System.out.println(" Consonant");
		}

	}

}
