package chapterNine;

public class Cellphone {

	
	private String manufature;
	private String model;
	private double retailPrice;
	
	Cellphone(String manu, String mod, double price){
		
		manufature = manu;
		model  = mod;
		retailPrice = price;
		
		
	}

	public String getManufature() {
		return manufature;
	}

	public void setManufature(String manufature) {
		this.manufature = manufature;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}
	
	void display() {
		
		System.out.println();
		System.out.println(" Here is the data that you provided");
		System.out.println(" The manufacture is: " + getManufature());
		System.out.println(" The model is: " + getModel());
		System.out.println(" The price is: " + getRetailPrice());
	}
}
