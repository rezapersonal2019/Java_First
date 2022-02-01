package projectFinal;

import java.text.DecimalFormat;
import java.util.Scanner;

//import finalProjectTwo.RetailItem;

public class CashRegisterA {

	
	//Attributes
    public double retailCost;
    public int quantity;
    final double TAX_RATE = 0.06;
    double subtotal;	
    double Tax;
    double total;	
 //	File salesReceipt;
    RetailItem myRetai3 = new RetailItem("Shirt", 20, 24.95); 
    RetailItem myRetail = new RetailItem("Jacket", 12, 55.95);
    RetailItem myRetai2 = new RetailItem("Designer Jeans", 40, 34.95);
   	
    
   
 //Constructors
    public CashRegisterA()
    {
    }
 	// constructor
 
    public CashRegisterA(int q)
    {
       quantity = q;
    }
 
 //Methods
 
    public double getSubTotal()
    {
       subtotal =  myRetail.getPrice() * quantity;
       return subtotal;
    }
    
    public double getTax()
    {
      
    	Tax = subtotal * TAX_RATE;
       return Tax;
    }
 
    public double getTotal()
    {
       total = subtotal + Tax;
       return total;			
    }

	 
    
    
    
    
 
}
