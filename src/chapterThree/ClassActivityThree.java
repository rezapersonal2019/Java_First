package chapterThree;

import java.util.Scanner;

public class ClassActivityThree {

	public static void main(String[] args) {

  double testScore1, testScore2, testScore3, average;
  
  // Create a scanner object to read input.
  
		Scanner input = new Scanner(System.in);
		
		// Get the first test score.
		
		System.out.print("Please enter first test score: ");
         testScore1 = input.nextDouble();
         
         // Get the 2nd test score.
         
         System.out.print("Please enter 2nd test score: ");
         testScore2 = input.nextDouble();
         
         // Get the 3rd test score
         
         System.out.print("Please enter 3rd test score: ");
         testScore3 = input.nextDouble();
         
         // calculate and display average of test score.
         
         average = (testScore1 + testScore2 + testScore3) / 3.0;
         
         System.out.println("Average of the test score: " + average);
         
         if(average>=90) {
        	 
        	 System.out.println("The letter grade is A ");
         }
         else if(average>=80 && average <= 89) {
        	 System.out.println("The letter grade is B ");
        	 
         }
         
         else if(average>=70 && average <= 79) {
        	 System.out.println("The letter grade is C ");
        	 
         }
         
         else if(average>=60 && average <= 69) {
        	 System.out.println("The letter grade is D ");
        	 
         }
         
         else  {
        	 System.out.println("The letter grade is F ");
        	 
         }
	}

}
