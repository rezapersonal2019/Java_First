package chapterEleven;

public class TestPerson {

	public static void main(String[] args) {
		
		
		Person person = new Person("Selim");
        Student student = new Student("Nipa");
        Employee employee = new Employee("Inaaya");
        Faculty faculty = new Faculty("Inseya");
        Staff staff = new Staff("Lima");   
        
		
		// Person person = new Person("John Doe", "123 Somewhere", "415-555-1212", "johndoe@somewhere.com");
	      //  Person student = new Student("Mary Jane", "555 School Street", "650-555-1212", "mj@abc.com", "junior");
	     //   Person employee = new Employee("Tom Jones", "777 B Street", "40-88-889-999", "tj@xyz.com");
	      //  Person faculty = new Faculty("Jill Johnson", "999 Park Ave", "92-52-22-3-333", "jj@abcxyz.com");
	      //  Person staff = new Staff("Jack Box", "21 Jump Street", "707-21-2112", "jib@jack.com");

		//Staff staff = new Staff("John Doe ");
        System.out.println(person.toString());
        System.out.println(student.toString());
       System.out.println(employee.toString());
      System.out.println(faculty.toString());
        System.out.println(staff.toString());
		
		
		//System.out.println(staff.toString());


	}

}
