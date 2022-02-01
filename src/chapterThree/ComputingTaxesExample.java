package chapterThree;

import java.util.Scanner;

public class ComputingTaxesExample {

	public static void main(String[] args) {
		
		final double TAX_RATE1 = 0.10;
		final double TAX_RATE2 = 0.15;
		final double TAX_RATE3 = 0.25;
		final double TAX_RATE4 = 0.28;
		final double TAX_RATE5 = 0.33;
		final double TAX_RATE6 = 0.35;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" (0-single filler, 1- married jointly or" + 
		" Qualifying widow(er),\n 2- married separately, 3- head of "+
				" household)\n Enter the filing statues: ");
		int status = input.nextInt();
		
		System.out.print( " Enter the taxable income: ");
		double income = input.nextDouble();
		
		double tax = 0;
		
		// Single
		
		if (status == 0)
		{
		if (income <= 8350)
			tax = income * TAX_RATE1;
		else if (income >= 8351 && income <= 33950)
			tax = 8350 * TAX_RATE1 + (income - 8350) * TAX_RATE2;
		else if (income >= 33951 && income <= 82250)
			tax = 8350 * TAX_RATE1 + (33950 - 8350 ) * TAX_RATE2 + (income - 33950) * TAX_RATE3;
		else if (income >= 82251 && income <= 171550)
			tax = 8350 * TAX_RATE1 + (33950 - 8350) * TAX_RATE2 + (82250 - 33950) * TAX_RATE3 + (income - 82250) * TAX_RATE4;
		else if (income >= 171551 && income <= 372950)
			tax = 8350 * TAX_RATE1 + (33950 - 8350) * TAX_RATE2 + (82250 - 33950) * TAX_RATE3 + (171550 - 82250) * TAX_RATE4 + (income - 171550) * TAX_RATE5;
		else 
			tax = 8350 * TAX_RATE1 + (33950 - 8350)* TAX_RATE2 + (82250 - 33950) * TAX_RATE3 + (171550 - 82250) * TAX_RATE4 + (372950 - 171550) * TAX_RATE5 + (income - 372950) * TAX_RATE6;
		
		}
       
		// Married Filing Jointly or Qualifying Widow(er) 
		
		if (status == 1)
		{
		if (income <= 16700)
			tax = income * TAX_RATE1;
		else if (income >= 16701 && income <= 67900)
			tax = 16700 * TAX_RATE1 + (income - 16700) * TAX_RATE2;
		else if (income >= 67901 && income <= 137050)
			tax = 16700 * TAX_RATE1 + (67900 - 16700 ) * TAX_RATE2 + (income - 67900) * TAX_RATE3;
		else if (income >= 137051 && income <= 208850)
			tax = 16700 * TAX_RATE1 + (67900 - 16700) * TAX_RATE2 + (137050 - 67900) * TAX_RATE3 + (income - 137050) * TAX_RATE4;
		else if (income >= 208851 && income <= 372950)
			tax = 16700 * TAX_RATE1 + (67900 - 16700) * TAX_RATE2 + (137050 - 67900) * TAX_RATE3 + (208850 - 137050) * TAX_RATE4 + (income - 208850) * TAX_RATE5;
		else 
			
		tax = 16700 * TAX_RATE1 + (67900 - 16700) * TAX_RATE2 + (137050 - 67900) * TAX_RATE3 + (208850 - 137050) * TAX_RATE4 + (372950 - 208850) * TAX_RATE5 + (income - 372950) * TAX_RATE6;
		}
		
		  
		// Married filing Separately
		
		if (status == 2)
		{
		if (income <= 8350)
			tax = income * TAX_RATE1;
		else if (income >= 8351 && income <= 33950)
			tax = 8350 * TAX_RATE1 + (income - 8350) * TAX_RATE2;
		else if (income >= 33951 && income <= 68525)
			tax = 8350 * TAX_RATE1 + (33950 - 8350 ) * TAX_RATE2 + (income - 33950) * TAX_RATE3;
		else if (income >= 68526 && income <= 104425)
			tax = 8350 * TAX_RATE1 + (33950 - 8350) * TAX_RATE2 + (68525 - 33950) * TAX_RATE3 + (income - 68525) * TAX_RATE4;
		else if (income >= 104426 && income <= 186475)
			tax = 8350 * TAX_RATE1 + (33050 - 8350) * TAX_RATE2 + (68525 - 33950) * TAX_RATE3 + (104425 - 68525) * TAX_RATE4 + (income - 104425) * TAX_RATE5;
		else 
		
			tax = 8350 * TAX_RATE1 + (33050 - 8350) * TAX_RATE2 + (68525 - 33950) * TAX_RATE3 + (104425 - 68525) * TAX_RATE4 + (186475 - 104425) * TAX_RATE5 + (income - 186475) * TAX_RATE6;
		
		}
		
		
		// Head of Household
		
		if (status == 3)
		{
			if (income <= 11950)
				tax = income * TAX_RATE1;
			else if ( income >= 11951 && income <= 45500)
				tax = 11950 * TAX_RATE1 + (income - 11950) * TAX_RATE2;
			else if ( income >= 45501 && income <= 117450)
				tax = 11950 * TAX_RATE1 + (45500 - 11950) * TAX_RATE2 + (income - 45500) * TAX_RATE3;
			else if ( income >= 117451 && income <= 190200)
				tax = 11950 * TAX_RATE1 + (45500 - 11950) * TAX_RATE2 + (117450 - 45500) * TAX_RATE3 + (income - 117450) * TAX_RATE4;
			else if ( income >= 190201 && income <= 372950)
				tax = 11950 * TAX_RATE1 + (45500 - 11950) * TAX_RATE2 + (117450 - 45500) * TAX_RATE3 + (190200 - 117450) * TAX_RATE4 + (income - 190200) * TAX_RATE5;
			else
				tax = 11950 * TAX_RATE1 + (45500 - 11950) * TAX_RATE2 + (117450 - 45500) * TAX_RATE3 + (190200 - 117450) * TAX_RATE4 + (372950 - 190200) * TAX_RATE5 + (income - 372950) * TAX_RATE6;
		
		}
   // System.out.println( " Tax is " + (int)(tax * 100)/ 100.0); 
		System.out.println(" Tax is " + tax);
	}

}
