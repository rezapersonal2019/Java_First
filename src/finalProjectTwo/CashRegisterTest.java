package finalProjectTwo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CashRegisterTest {

	
	 /**
	
	     * @param args the command line arguments
	
	     */
	
	    public static void main(String[] args) {
	
	        // TODO code application logic here
	
	    int quantity;     // Quantity being purchased
	  int item;
	 
	
	    System.out.println("yourName  today's date\n");
	
	     
	
	       
	
	      // Create a Scanner object for keyboard input.
	
	      Scanner keyboard = new Scanner(System.in);
	
	       
	
	      // Create a RetailItem object.
	
	    RetailItem item1 = new RetailItem("Candy bar", 17789,
	
	                                     0.75, 1.5);   
	
	      // Get the quantity.
	
	      System.out.print("How many candy bars are you buying? ");
	
	      quantity = keyboard.nextInt();
	
	       
	
	      // Create a CashRegister object.
	
	      CashRegister reg = new CashRegister(item1, quantity);
	
	       
	
	      // Create a DecimalFormat object.
	
	      DecimalFormat dollar = new DecimalFormat("#,##0.00");
	
	       
	
	      // Display the sales data.
	
	      System.out.println("Subtotal : $" +
	
	                         dollar.format(reg.getSubtotal()));
	
	      System.out.println("Sales tax : $" +
	
	                         dollar.format(reg.getTax()));
	
	      System.out.println("Total : $" +
	
	                         dollar.format(reg.getTotal()));
	
	     
	
	     
	
	    }
	
	     
	
	}


