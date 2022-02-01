package projectFinal;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import finalProject.CashRegister;

public class WriteFile {
	
	
	

	  public static void main(String[] args ) throws IOException
	  {
		
		
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Create a RetailItem object.
	      RetailItem item = new RetailItem("Jacket", 12, 55.95);
              
	    
	      
	   //   Display the starting data for this item.
	    System.out.println("Item being purchased: " + item.getDescription());
	      System.out.println("Units on hand: " + item.getUnitsOnHand());
	     System.out.printf("Price: $%,.2f\n", item.getPrice());
	      
	     

	      
	      
	         // Create a CashRegister object.
	         CashRegisterA reg = new CashRegisterA( );
	         
	         // Get the quantity.
	         System.out.print("How many Jacket are you buying? ");
		     reg. quantity = keyboard.nextInt();
		      
	      
	         // Create the necessary objects for file output.
	         PrintWriter outputFile = new PrintWriter("Receipt.txt");
	         
	         // Write the sales data.
	         outputFile.println("SALES RECEIPT");
	         outputFile.printf("Unit Price: $%,.2f\r\n", item.getPrice());
	         outputFile.printf("Quantity: %d\r\n", reg.quantity);
	         outputFile.printf("Subtotal: $%,.2f\r\n", reg.getSubTotal());
	         outputFile.printf("Sales tax: $%,.2f\r\n",reg.getTax());
	         outputFile.printf("Total: $%,.2f\r\n", reg.getTotal());
	                         
	         // Close the file.
	         outputFile.close();
	         System.out.println("Sales receipt written to Receipt.txt.");
	         
	         
	         
	       
	        
	      } 
	      
	     
	      }
	      
	      
	   
	

