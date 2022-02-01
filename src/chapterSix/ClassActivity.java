package chapterSix;

import java.util.Scanner;

public class ClassActivity {
 public static void main(String[] args)
	 
	     {
	  double testScoreA,
		 
	      testScoreB,
	 
	      testScoreC,
	 
	      testScoreD,
	 
	      testScoreE;
	    
		Scanner input = new Scanner(System.in);
	 
	    
	 
	     System.out.print("Enter your first test score: ");
	 
	     testScoreA = input.nextDouble();
	     
	     while(testScoreA< 0 || testScoreA  > 100) {
	    	 
	    	System.out.print("Invalid score. Please enter valid score: ");
	    	
	    	testScoreA = input.nextDouble();
	    	 
	     }
	 
	     System.out.print("Enter your second test score: ");
	 
	     testScoreB = input.nextDouble();
	     
	     while(testScoreB< 0 || testScoreB  > 100) {
	    	 
		    	System.out.print("Invalid score. Please enter valid score: ");
		    	
		    	testScoreB = input.nextDouble();
		    	 
		     }
	 
	     System.out.print("Enter your third test score: ");
	 
	     testScoreC = input.nextDouble();
	     
	     while(testScoreC< 0 || testScoreC  > 100) {
	    	 
		    	System.out.print("Invalid score. Please enter valid score: ");
		    	
		    	testScoreC = input.nextDouble();
		    	 
		     }
	 
	     System.out.print("Enter your fourth test score: ");
	 
	     testScoreD = input.nextDouble();
	     
	     while(testScoreD< 0 || testScoreD  > 100) {
	    	 
		    	System.out.print("Invalid score. Please enter valid score: ");
		    	
		    	testScoreD = input.nextDouble();
		    	 
		     }
	 
	     System.out.print("Enter your fifth test score: ");
	 
	     testScoreE = input.nextDouble();
	     
	     while(testScoreE< 0 || testScoreE  > 100) {
	    	 
		    	System.out.print("Invalid score. Please enter valid score: ");
		    	
		    	testScoreE = input.nextDouble();
		    	 
		     }
	     
	     
	 
	   //  keyboard.nextLine();
	
	 double average = calcAverage( testScoreA,testScoreB, testScoreC, testScoreD, testScoreE);
	 
	     System.out.println("The average test score is: " + average );
	 
	
	  determineGrade(average);
	
	     }
	 
	  public static double calcAverage(double testScoreA, double testScoreB, double testScoreC, 
				double testScoreD, double testScoreE)
	 
	     {
	 
	         double average = (testScoreA + testScoreB + testScoreC + testScoreD + testScoreE) / 5;
	
	      
	         return average;
	  }
	 
	   public static char determineGrade(double average)
	// public static char determineGrade(int testScore)
	     {
	    	 char letterGrade = 0;
	 
	         if (average>=90 && average <= 100)
	 
	         {
	 
	            System.out.println("You got an A");
	        	// return 'A';
	 
	         }
	 
	         else if (average>=80 && average<=89)
	 
	         {
	          System.out.println("You got a B");
	        	// return 'B';
	             }
	           else if (average >=70 && average<=79)
	 
	         {
	 
	             System.out.println("You got a C");
	        	// return 'C';
	             }
	 
	         else if (average >=60 && average<=69)
	 
	         {
	 
	             System.out.println("You got a D");
	        	// return 'D';
	 
	         }
	 
	         else 
	 
	         {
	 
	             System.out.println("You got an F");
	        	// return 'F';
	 
	         }
		
			return letterGrade;
	     }	
			
	 }
