package chapterThree;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		 
		// Prompt the user to enter a three - digit integer
		  System.out.print("Enter a three-digit integer:");
		  int number = input.nextInt();
		  
		  // test for palindrome
		  
		  int digit1 = (int)(number /100);
		  int remaining = number % 100;
		  int digit3 = (int) (number% 10);
		  
		  // display results
		  
		  if (digit1 == digit3) {
			  System.out.println( number + " is a palindrome.");
		  } else {
			  System.out.println( number + " is not a palindrome.");
		  }
		}
}
