package projectFinal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Transaction {

	 // Main Methods
	   
    public static void main(String[] args)
		{
       String itemName = " ";
       double itemCost = 0.00;
          
    
       Scanner sc = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#0.00");
    
       RetailItem myRetailItem = new RetailItem();
       myRetailItem.setPrice(itemCost);
       CashRegisterA myCashRegisterA = new CashRegisterA();
    
    //   System.out.print("What is the name of the item being purchased? : " );
    //   itemName = sc.nextLine();
          
       System.out.print("How many items are you buying? ");
       myCashRegisterA.quantity = sc.nextInt();
       
       
    
    
       System.out.println();
       
       System.out.print("Subtotal:     $" + df.format(myCashRegisterA.getSubTotal()));
       System.out.println();
			
       System.out.print("Salestax:     $" + df.format(myCashRegisterA.getTax())); 
			System.out.println();
			

      System.out.print("Total:        $" + df.format(myCashRegisterA.getTotal()));
 
 
      
    
    
    }
	
	
}

