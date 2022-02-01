package chapterNine;

public class Fan {

	
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	
	private int speed;
	private boolean on;
	private double radius;
    String color;
    
    // Create a constructor with default value
    
    Fan(){
    	
    	speed = SLOW;
    	on = false;
    	radius = 5;
    	color = "blue";
    
}

	/*public int getSpeed() {
		return speed;
	} */
    
    /** Return speed */
	public String getSpeed() {
		String s = "";
		switch (speed) {
			case SLOW: s = "SLOW"; break;
			case MEDIUM: s = "MEDIUM"; break;
			case FAST: s = "FAST";
		}
		return s;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn() {
		on = true;
	}
	
	
	/** Sets fan off */ 
	public void turnOff() {
			on = false;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

/*	public String getColor() {
		return color;
	} */

	public void setColor(String color) {
		this.color = color;
	} 
	
	/** Returns a string description for the fan */
	public String toString() {
		if (on == true) {
			return "\nFan speed: " + getSpeed() + ", color: " + color + 
					 ", radius: " + radius + ", fan is on: " + isOn() + "\n";
		}
		else{
			return "\n"
					+ "Fan speed: " + getSpeed() + ", color: " + color + ", radius: " + radius +
					 ", fan is off\n";
		}
	}
    
    
    
    
    
    
    
    
    
}