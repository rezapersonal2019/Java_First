package chapterEleven;

//import java.sql.Date;
import java.util.GregorianCalendar;

public class Employee extends Person{
	
	 private String office;
	    private double salary;
	//   private MyDate hire;
	    private MyDate dateHired;

	  /*  public Employee() {
	    }  
	    */
	    

		  public Employee(String name) {
		    	
		        super(name);
		    } 

	 /*   public Employee(String name, String address, int phone, String email){
	        super(name, address, phone, email);
	    } */

	/*    public Employee(String office, double salary, Date hire){
	        this.office = office;
	        this.salary = salary;
	        this.hire = hire;
	    }
	     */
	    public Employee(String newName, String newAddress, String newPhone_number, String newEmail, String office, double salary) {
	        super(newName, newAddress, newPhone_number, newEmail);
	        this.office = office;
	        this.salary = salary;
	       // this.hire = hire; 
	      //  this.hire = new MyDate();
	        this.dateHired = new MyDate();
	    }

	    public void setOffice(String office){
	        this.office = office;
	    }

	    public String getOffice(){
	        return this.office;
	    }
	    public void setSalary(double salary){
	        this.salary = salary;
	    }

	    public double getSalary(){
	        return this.salary;
	    }
	    
	    /* Return date hired 
		public String gethire() {
			return hire.getMonth() + "/" + hire.getDay() 
					 + "/" + hire.getYear();
		}
		
		public void sethire() {
			hire = new MyDate();
		}

	   public void setHire(Date hire){
	        this.hire = hire;
	    }

	    public Date getHire(){
	        return this.hire;
	    }  */
	    /** Return date hired */
		public String getDateHired() {
			return dateHired.getMonth() + "/" + dateHired.getDay() 
					 + "/" + dateHired.getYear(); 
		}
		
		/** Set new dateHired */
		public void setDateHired() {
			dateHired = new MyDate();
		}
	    @Override
	    public String toString() {
	    	super.toString();
	        return "Person name: " + super.getName() + ", " + " Class name: " + this.getClass().getName(); // + ", " + "Date hired:" + getDateHired();
	    }
	

}
