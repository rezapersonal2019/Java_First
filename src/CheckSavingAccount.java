
 
import java.util.*; 

public class CheckSavingAccount {

	
	public static void main (String [] args)
	
	{   
		
		final double INTEREST_5 = 0.05;
		final double INTEREST_4 = 0.04;
		final double INTEREST_3 = 0.03;
		final double  CHARGE_SAVINGACCOUNT = 10.00;
		final double CHARGE_CHECKINGACCOUNT = 25.00;
		int number,
		error=1,
		itype=0;
	
		char type =0;
	double minimum ,
	         cur = 0,
			newbalance = 0,
			balance = 0,
			rate = 0;
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter account number: ");
	number = in.nextInt();
	while(error==1)
	{
	System.out.println("Enter account type(s-savings or c-checking):");
	type=in.next().charAt(0);
	if(type=='c'||type=='C')
	{itype=1;
	error=0;
	rate = INTEREST_3;
	}
	else if(type=='s'||type=='S')
	{itype=0;
	error=0;
	rate= INTEREST_4;
	}
	if(error==1)
	System.out.println("Invalid type-re enter");
	}
	System.out.println("Enter minimum balance: ");
	minimum=in.nextDouble();
	System.out.println("Enter current balance: ");
	cur=in.nextDouble();
	  balance = cur;
	if(itype==1)
	{ if(cur>minimum+5000)
	rate =  INTEREST_5 ;
	else if(cur<minimum)
	cur-= CHARGE_CHECKINGACCOUNT;
	}
	else
	if(cur<minimum)
	cur-= CHARGE_SAVINGACCOUNT;
	newbalance=cur+rate*cur;

	
	System.out.println("Your account number: " + number);
	System.out.println("Your account type  : " + type);
	System.out.printf("your current balance: $%.2f%n",cur);
	System.out.printf("Your new balance: $%.2f", newbalance);

	}
}
