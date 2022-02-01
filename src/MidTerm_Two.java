
import java.util.*;
public class MidTerm_Two {
	
/*	static final double OVERDRAFT_SAVINGS = 10.00;
	
	static final double OVERDRAFT_CHECKING = 25.00;
	
	static final double IR_SAVINGS = 0.04;
	
	static final double IR_CHECKING_BELOW_MAX = 0.03;
	
	static final double IR_CHECKING_ABOVE_MAX = 0.05;
	
	static final double MAX_CHECKING = 5000.00; */
	
	public static void main(String[] args) 
	{ 
		
		final double SERVICE_CHARGE_SAVINGS = 10.00; 
		final double SERVICE_CHARGE_CHECKING = 25.00; 
		final double INTEREST_SAVINGS = 0.04; 
		final double INTEREST_CHECKING_BELOW_THRESHOLD = 0.03; 
		final double INTEREST_CHECKING_ABOVE_THRESHOLD = 0.05; 
		final double THRESHOLD_CHECKING = 5000.0; 

		String input; 
		int accountNumber; 
		char type; 
		double minimum; 
		double balance; 

		Scanner sc = new Scanner(System.in); 

		System.out.println("Input the account number then the type then the minimum balance and the balance"); 
		System.out.println("Example input: 46728 S 1000 2700"); 

		input = sc.nextLine(); 
		StringTokenizer tokenizer = new StringTokenizer(input, " "); 

		accountNumber = Integer.parseInt( ((Iterator<String>) tokenizer).next() ); 
		type = ((Iterator<String>) tokenizer).next().charAt(0); 
		minimum = Double.parseDouble( ((Iterator<String>) tokenizer).next() ); 
		balance = Double.parseDouble( ((Iterator<String>) tokenizer).next() ); 

		// Output the account number. 

		if (balance < minimum) 
		{ 

		if (type == 'S' || type == 's') 
		{ 
		// Output account type. 
		// Output a message to say a service charge has been applied. 
		balance = balance - SERVICE_CHARGE_SAVINGS; 
		} 
		else if(type == 'C' || type == 'c') 
		{ 
		// Output account type. 
		// Output a message to say a service charge has been applied. 
		balance = balance - SERVICE_CHARGE_CHECKING; 
		} 
		else 
		{ 
		// Output a message to say the wrong type of account was input. 
		return; 
		} 

		} 
		else 
		{ 

		if (type == 'S' || type == 's') 
		{ 
		// Output account type. 
		// Output a message to say account receive interest. 
		balance = balance + (balance * INTEREST_SAVINGS); 
		} 
		else if (type == 'C' || type == 'c') 
		{ 

		if (balance - minimum < THRESHOLD_CHECKING) 
		{ 
		// Output account type. 
		// Output a message to say account receive interest. 
		balance = balance + (balance * INTEREST_CHECKING_BELOW_THRESHOLD); 
		} 
		else 
		{ 
		// Output account type. 
		// Output a message to say account receive interest. 
		balance = balance + (balance * INTEREST_CHECKING_ABOVE_THRESHOLD); 
		} 

		} 
		/*else 
		{ 
		// Output a message to say the wrong type of account was input. 
		return; 
		} */

		
		}
		
	}
	

}
	

