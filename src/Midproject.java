

import java.util.*;

//public class Midproject {
	
/*	static final double OVERDRAFT_SAVINGS = 10.00;
	
	static final double OVERDRAFT_CHECKING = 25.00;
	
	static final double IR_SAVINGS = 0.04;
	
	static final double IR_CHECKING_BELOW_MAX = 0.03;
	
	static final double IR_CHECKING_ABOVE_MAX = 0.05;
	
	static final double MAX_CHECKING = 5000.00;
	
	 
	
	 
	
	public static void main(String[] args)
	
	{
	
	String input;
	
	int accountNumber;
	
	char type;
	
	double minimum;
	
	double balance;
	
	 
	
	Scanner sc = new Scanner(System.in);
	
	 
	
	System.out.println("Input the account number then select account type(savings or checking),"+
	
	"then the minimum balance you would like to maintain, as well as the desired max balance.");
	
	 
	
	 
	
	 
	
	System.out.println("Example input: 46728 S 1000 2700");
	
	 
	
	input = sc.nextLine();
	
	StringTokenizer tokenizer = new StringTokenizer(input, " ");
	
	 
	
	accountNumber = Integer.parseInt( ((Iterator<String>) tokenizer).next() );
	
	type = ((Iterator<String>) tokenizer).next().charAt(0);
	
	minimum = Double.parseDouble( ((Iterator<String>) tokenizer).next() );
	
	balance = Double.parseDouble( ((Iterator<String>) tokenizer).next() );
	
	 
	
	 

	 
	
	if ((balance < minimum)||(type == 'S' || type == 's'))
	
	            {
	
	            balance = balance - OVERDRAFT_SAVINGS;
	
	            }
	
	else if(type == 'C' || type == 'c')
	
	    {
	
	    balance = balance - OVERDRAFT_CHECKING;
	
	    }
	
	else 
	
	    {
	
	    return;
	
	    }
	
//	else if
	
	    {
	
	        if (type == 'S' || type == 's')
	
	            {
	
	            balance = balance + (balance * IR_SAVINGS);
	
	            }
	
	    }
	
	else if(type == 'C' || type == 'c')
	
	    {
	
	    if (balance - minimum < MAX_CHECKING)
	
	        {
	
	        balance = balance + (balance * IR_CHECKING_BELOW_MAX);
	
	        }
	
	    }
	
	else if
	
	    {
	
	    balance = balance + (balance * IR_CHECKING_ABOVE_MAX);
	
	    }
	
	else 
	
	    {
	
	    return;
	
	    }
	
	}
	
	 
	
	}
*/


