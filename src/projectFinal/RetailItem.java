package projectFinal;

public class RetailItem {

	private String description;
	private int unitsOnHand;
	private double price;
	
	
	public RetailItem() {
		description = null;
		unitsOnHand = 0;
		price = 0.00;
	}
	
	public RetailItem(String d, int u, double p) {
		this.description = d;
		this.unitsOnHand = u;
		this.price = p;
	}

	public void setDescription(String d) {
		this.description = d;
	}
	
	public void setUnitsOnHand(int u) {
		this.unitsOnHand = u;
	}
	
	public void setPrice(double p) {
		this.price = p;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getUnitsOnHand() {
		return unitsOnHand;
	}
	
	public double getPrice() {
		return price;
	}
	


public String toString() {
    return "Description: " + getDescription() + ", " + " UnitsOnHand: " + getUnitsOnHand()
    + ", " + " Price " + getPrice();
}
	
}

