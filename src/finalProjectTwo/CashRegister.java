package finalProjectTwo;

public class CashRegister {

	private RetailItem retailItem;
	
	    private int quantityItems;
	
	    private final double SALES_TAX = .06;

	    private int subTotal;
	
	     
	
	    public CashRegister()
	
	    {
	
	        quantityItems = 0;
	
	        subTotal = 0;
	
	    }
	
	     
	
	    public CashRegister(RetailItem retailItemObject, int quantity)
	
	    {
	
	        retailItem = new RetailItem(null, quantity, SALES_TAX, SALES_TAX);
	
	        quantityItems = quantity;
	
	    }
	
	 
	
	    public RetailItem getRetailItem()
	
	    {
	
	        return new RetailItem(null, quantityItems, SALES_TAX);
	
	    }
	
	     
	
	    public double getSubtotal()
	
	    {
	
	        return quantityItems * retailItem.getRetailPrice();
	
	    }
	
	     
	
	    public double getTax()
	
	    {
	
	        return SALES_TAX;
	
	    }
	
	     
	
	    public double getTotal()
	
	    {
	
	        return subTotal + SALES_TAX;
	
	    }
	
	}

	
	
	

