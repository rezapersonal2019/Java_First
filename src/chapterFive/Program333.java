package chapterFive;

import java.util.Scanner;

public class Program333 {

	public static void main(String[] args) {
		
		/*double number1;
		double number2;
		
		
		Scanner input = new Scanner (System.in);
		
		number1 = input.nextDouble();
		number2 = input.nextDouble();
		
		System.out.print(" What is" + number1 + " + " + number2 + "? ");
		
		int answer = input.nextInt();
		
		while (number1 + number2 != answer) {
			System.out.print(" Wrong answer. Try again. What is " + number1 + "+ " + number2
					 + " ? " );
			answer = input.nextInt();
			
		}
		System.out.println(" you got it!");
		*/
		
		
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println ( " Guess a magic number please");
		number = input.nextInt(); 
		
		int guess = -1;
		
		while (guess != number) {
			
			System.out.print (" \n Enter your guess: ");
			guess = input.nextInt();
			
			if (guess == number) 
				System.out.println (" Yes, the number is: " + number);
			
			else if (guess > number) 
				System.out.println( " your guess is too high");
			else 
				System.out.println ( " your guess is low");
		}
		
		System.out.print(" Your magic number even guess number");
			
		}
		}




