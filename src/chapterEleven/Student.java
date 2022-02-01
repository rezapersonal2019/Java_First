package chapterEleven;

public class Student extends  Person {

	// public final String class_status;

	 public static final String FRESHMAN = "Freshman";
	    public static final String SOPHOMORE = "Sophomore";
	    public static final String JUNIOR = "Junior";
	    public static final String SENIOR = "Senior";

	    private  String status;

	  public Student(String name) {
	    	
	        super(name);
	    } 
      //  super(Person);
        
        
        
      
	    public Student(String newName, String newAddress, String newPhone_number, String newEmail, String status) {
	        super(newName, newAddress, newPhone_number, newEmail);
	        this.status = status;
	    }

	    @Override
	    public String toString() {
	    	super.toString();
	        return "Person name: " + super.getName() + ", "+ " Class name: " + this.getClass().getName();
	    }
	
}
