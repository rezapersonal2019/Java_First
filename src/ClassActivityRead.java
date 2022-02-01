import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClassActivityRead {
	
	 public static void main(String[] args) throws IOException
	   {
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);

	      // Get the filename.
	      System.out.print("Enter the filename: ");
	      String filename = keyboard.nextLine();

	      // Open the file.
	      File file = new File(filename);
	      Scanner inputFile = new Scanner(file);

	      // Read lines from the file until no more are left.
	      while (inputFile.hasNext())
	      {
	         // Read the next name.
	         String friendName = inputFile.nextLine();

	         // Display the last name read.
	         System.out.println(friendName);
	      }

	      // Close the file.
	      inputFile.close();
	   }

}