package chapterTwo;

import java.util.Scanner;

public class ClassActivity {

	public static void main(String[] args) {
		
		double InterestRate = 0.00417;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print( "Enter the monthy saving amount: $");
		
		Double Account  = input.nextDouble();
		
		Double FirstMonth = (1 + InterestRate);
		
		Double AfterFirstMonth = Account * FirstMonth;
		
		System.out.println(" After the First month, the account value is $" + 
				AfterFirstMonth);
		
		Double After2ndMonth = (Account + AfterFirstMonth)* (FirstMonth);
		System.out.println(" After the Second month, the account value is $" + 
				After2ndMonth);
		Double After3rdMonth = (Account + After2ndMonth)* FirstMonth;
		
		System.out.println(" After the Three month, the account value is $" + 
				After3rdMonth);
		
		
		
		Double AfterFourthMonth = (Account + After3rdMonth)* FirstMonth;
		
		System.out.println(" After the four month, the account value is $" + 
				AfterFourthMonth);
		
		Double AfterFifthMonth = (Account + AfterFourthMonth)* FirstMonth;
		
		System.out.println(" After the fifth month, the account value is $" + 
				AfterFifthMonth);
		
		Double AfterSixMonth = (Account + AfterFifthMonth)* FirstMonth;
		
		System.out.print(" After the Sixth month, the account value is $" + 
		AfterSixMonth);
		

	}

}
