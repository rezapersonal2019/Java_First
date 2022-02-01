package chapterEleven;

import java.sql.Date;

public class Staff extends Employee{

	
	 private String title;

	    

	/*    public Staff(String name, String title){
	    	super(name);
	        this.title = title;
	    } */
	 public Staff (String name) {
	    	
	        super(name);
	    } 
	    
	/*    public Staff(String newName, String newAddress, String newPhone_number, String newEmail, String title) {
	        super(newName, newAddress, newPhone_number, newEmail);
	        this.title = title;
	    } */
	    
	    public Staff(String newName, String newAddress, String newPhone_number, String newEmail, String office, double salary, Date hire, String title) {
	        super(newName, newAddress, newPhone_number, newEmail, office, salary);
	        this.title = title;
	    } 
	    

	    public void setTitle(String title){
	        this.title = title;
	    }
	    public String getTitle(){
	        return this.title;
	    }
	    
	    
	    @Override
	    public String toString() {
	    	super.toString();
	        return "Person name: " + super.getName() + ", " + " Class name: " + this.getClass().getName();
	    }
	
}
