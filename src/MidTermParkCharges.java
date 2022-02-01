import java.util.Scanner;

public class MidTermParkCharges {

	public static void main(String[] args)
	{
		Scanner in=new Scanner (System.in);
	
		System.out.println("Enter how many hours you stayed");
	    int hours=in.nextInt();
	    double p=calculatesCharges(hours);
	 
	    System.out.printf("You will pay: $%.2f",p);
	
	}
	
	public static double calculatesCharges(int hour)
	{
		double price=0;
		if (hour<=3)
			price=2;
		
		if(hour>3 && hour<=19)
			
			price=2+(hour-3)*0.5;
		
		if (hour>19)
			price=10;
		
		return price;
		}
	
	
}
