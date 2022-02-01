package chapterFive;

import java.util.Scanner;

public class ProgramClass {

	public static void main(String[] args) {
		
		
		
		
		
		
		int sum = 0;
		int item = 0;
		do {
		  item++;
		  if (sum >= 4)
		    continue;
		  sum += item;
		}
		while (item < 5);


		
		


	/*	int sum = 0;
		int i = 1;
		
		while (i <20) {
			
			sum = sum +i ;
			i++;
		}
		
		System.out.println ( " sum is " + sum);  
		*/
		
		
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
		System.out.println(" you got it!"); */
		
	}

}
