package chapterFive;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print(" Enter the number of studens: ");
		 int NumberOfStudents = input.nextInt();
		 int max = 0;
		 int secondMax = 0;
		 String maxName = " ";
		 String secondMaxName = " ";


		 
		  for (int i = 0; i < NumberOfStudents; i++) {
		   System.out.print("Enter name and score of student (" + (i + 1)
		     + "):");
		   String name = input.next();
		   int score = input.nextInt();
		 
		   if (score > max) {
		    secondMax = max;
		    //added secondMaxName = maxName; to correct the code. See comment in the post below 15.02.16
		    secondMaxName = maxName; 
		    max = score;
		    maxName = name;
		   } else if (score > secondMax) {
		    secondMax = score;
		    secondMaxName = name;
		   }
		 
		  }
		 
		  System.out.println("The student with the highest score is " + maxName);
		  System.out.println("The highest score is " + max);
		  System.out.println("The student with the second highest score is "
		    + secondMaxName);
		  System.out.println("The second highest score is " + secondMax);

	}

}
