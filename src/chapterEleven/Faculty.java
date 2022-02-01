package chapterEleven;

import java.sql.Date;

public class Faculty extends Employee {
	
	public static String LECTURER = "Lecturer";
    public static String ASSISTANT_PROFESSOR = "Assistant Professor";
    public static String ASSOCIATE_PROFESSOR = "Associate Professor";
    public static String PROFESSOR = "Professor";

    protected String officeHours;
    protected String rank;

   
    
    public Faculty (String name) {
    	
        super(name);
    } 
    
   /*public Faculty() {
        
    }  */

  /*  public Faculty( String officeHours, String rank) {
        
        this.officeHours = officeHours;
        this.rank = rank;
    } */
    
  /*  public Facu(String office, double salary, Date hire){
        this.office = office;
        this.salary = salary;
        this.hire = hire;
    }*/
   public Faculty(String newName, String newAddress, String newPhone_number, String newEmail, String office, double salary, Date hire,  String officeHours, String rank) {
        super(newName, newAddress, newPhone_number, newEmail, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }
 
    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
    	super.toString();
        return "Person name: " + super.getName() + ", " + " Class name: " + this.getClass().getName();
    }


	
	
}
