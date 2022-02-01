package finalProjectTwo;

public class RetailItem {

	
	 //fields
	
	    private String Description;     // description of item
	
	    private int unitsOnHand;        // number of items
	
	    private double retailPrice;     // price of item
	
	 
	
	 
	
	 
	
	    public RetailItem(String string, int i, double d, double e) {
			Description = null;
			unitsOnHand = 0;
			retailPrice = 0;
		}



		public RetailItem(String des, int units, double price) {
			
			Description = des;
			unitsOnHand = units;
			retailPrice = price;
		}



		/**
	
	    set methods to appropriate name
	
	    */
	
	 
	
	    public void setDescription(String description)
	
	 
	
	    {
	
	        Description = description;
	
	 
	
	    }
	
	 
	
	    public void setUnitsOnHand(int unit)
	
	 
	
	    {
	
	        unitsOnHand = unit;
	
	 
	
	    }
	
	 
	
	    public void setRetailPrice(double pprice)
	
	 
	
	    {
	
	        retailPrice = pprice;
	
	 
	
	    }
	
	 
	
	    /**
	
	    get method and return value of each variable
	
	    */
	
	 
	
	 
	
	    public String getDescription()
	
	 
	
	    {
	
	        return Description;
	
	 
	
	    }
	
	 
	
	    public int getUnitsOnHand()
	
	 
	
	    {
	
	        return unitsOnHand;
	
	 
	
	    }
	
	 
	
	    public double getRetailPrice()
	
	 
	
	    {
	
	 
	
	        return retailPrice;
	
	 
	
	    }



		public int getPrice() {
			// TODO Auto-generated method stub
			return 0;
		}

}
