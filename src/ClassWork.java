import java.io.IOException;
import java.io.PrintWriter;

public class ClassWork {

	public static void main(String[] args) throws IOException{
		
		PrintWriter outputFile = new PrintWriter("StudentData.txt");
		outputFile.println("Jim");
		outputFile.println(95);
		outputFile.println("Karen");
		outputFile.println(98);
		outputFile.println("Bob");
		outputFile.println(82);
		outputFile.close();
		
		
		String name = "Jeffrey Smith";
		String phone = "555-7864";
		int idNumber = 47895;
		PrintWriter outputFile1 = new PrintWriter("PersonalData.txt");
		outputFile1.print(name + " ");
		outputFile1.print(phone + " ");
		outputFile1.println(idNumber);
		outputFile1.close();
		
		System.out.println(System.getProperty("user.dir"));

	}

}
