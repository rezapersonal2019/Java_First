package chapterEleven;

public class GeometricObject {
	
	// Declare data type private 
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Construct a default geometric object.
    public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	// Construct a geometric object with the specified color and filled value.
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util. Date();
		this.color = color;
		this.filled = filled;
		
		}
 
	// Return color
	
	public String getColor() {
		return color;
	}
	
	// Set a new color

	public void setColor(String color) {
		this.color = color;
	}
	
	// Return filled. Since filled is boolean. Its getter method is named is Filled.
	

	public boolean isFilled() {
		return filled;
	}
	
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Get dateCreated
		public java.util.Date getDatecreated(){
			
			return dateCreated;

	
		}
		
		// Return string representation of this object.
		public String toString() {
			
			return " Created on date " + dateCreated;
			//return " Created on" + dateCreated + "\ncolor" + color + " and filled: " + filled;
			
		}
 
}
