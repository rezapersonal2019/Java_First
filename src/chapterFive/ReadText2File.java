package chapterFive;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadText2File {

	
	 public static void main(String[] args) throws IOException
	   {
	     String filename;     // The name of the file
	      String input;        // To hold file input
	     // int lineCount;       // To hold line numbers

	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	             
	      // Get the file name.
	      System.out.print("Enter the file name: ");
	     filename = keyboard.nextLine();
	      System.out.println();
	      // Open the file.	     
	      File file = new File(filename);
	      Scanner inFile = new Scanner(file);
	      
	      // Initialize the line counter to 1.
	    //  lineCount = 1;
	      
	      // Display the lines with line numbers.
	      while (inFile.hasNext())
	      {
	         input = inFile.nextLine();
	         System.out.println( input);
	        // lineCount++;
	      }
	      
	      // Close the file.
	      inFile.close();
	   }

}
