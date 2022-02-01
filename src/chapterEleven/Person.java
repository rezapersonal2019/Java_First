package chapterEleven;

public class Person {

	
	
	private String name;
    private String address;
    private String phone_number;
    private String email_address;

    public Person( String n) {
    	this.name = n;
    }

    public Person(String newName, String newAddress, String newPhone_number, String newEmail){
        name = newName;
        address = newAddress;
        phone_number = newPhone_number;
        email_address = newEmail;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }
    
    
    public void setPhone(String newPhone_number){
        phone_number = newPhone_number;
    }

    public String getPhone(){
        return phone_number;
    }

    public void setEmail(String newEmail){
        email_address = newEmail;
    }

    public String getEmail(){
        return email_address;
    }

    @Override
    public String toString() {
        return "Person name: " + getName() + ", " + " Class name: " + this.getClass().getName();
    }


}
