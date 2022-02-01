package chapterFour;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		// Prompt the user to enter payroll inforation
		System.out.print("Enter employee’s name: ");
		String name = input.next();	
		System.out.print("Enter number of hours worked in a week: ");
		double hoursWorked = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double hourlyPayRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federalTaxRate = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();

		// Display payroll statement
		double grossPay, federal, state, totalDeduction, netPay;
		
		grossPay = hoursWorked * hourlyPayRate;
		federal = grossPay * federalTaxRate;
		state = grossPay * stateTaxRate;
		totalDeduction = federal + state;
		netPay = grossPay - totalDeduction;
		
		System.out.println("Employee Name:" + name);
		  System.out.println("Hours Worked:" + hoursWorked);
		  System.out.println("Pay Rate: $" + hourlyPayRate);
		  System.out.println("Gross Pay: $" + grossPay);
		  System.out.println("Deduction:");
		  
		//  System.out.printf(" Federal Witholding (20.0%): $ %.2f", federal);
		  
		  System.out.printf("Federal Withholding (%.1f%%): $%.2f\n", federalTaxRate * 100,
				    federal);
		System.out.printf("State Withholding (%.1f%%): $%.2f\n", stateTaxRate * 100, state);
		System.out.printf(" Total Deduction: $%.2f\n",totalDeduction);
		System.out.printf(" Net Pay: $%.2f\n",netPay);
		
	}

}
