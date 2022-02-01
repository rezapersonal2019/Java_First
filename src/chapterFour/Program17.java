package chapterFour;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		System.out.print(" Enter a year:");
		int year = input.nextInt();
		System.out.print(" Enter a month: ");
		String month = input.next();
		
		
		// Test for leap year
				boolean leapYear = 
					((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

				// Display the number of day in the month
				System.out.print(month + " " + year + " has ");
				
				if ( month.equals("Jan") || month.equals("Mar") || 
					  month.equals("May") || month.equals("Jul") ||
					  month.equals("Aug") || month.equals("Oct") ||
					  month.equals("Dec"))
					System.out.println(31 + " days");
				else if (month.equals("Apr") || month.equals("Jun") || 
					month.equals("Sep") || month.equals("Nov"))
					System.out.println(30 + " days");
				else if( month.equals("jan") || month.equals("mar") || 
						  month.equals("apr") || month.equals("may") ||
						  month.equals("jun") || month.equals("jul") ||
						  month.equals("aug") || month.equals("sep") ||
						  month.equals("oct") || month.equals("nov") || 
						  month.equals("dec"))
					System.out.println(" not a correct month name.");
				else
					System.out.println(((leapYear) ? 29 : 28) + " days");	
				
		
		/* int days = 0;
		switch (month) {
		case "Feb": if((year % 4 == 0 && year % 100 !=0) || (year % 400 == 0))
		{
			days = 29;
			break;
		}
		days = 28;
		break;
		
		 
		 
		  case "Apr":
		  case "Jun":
		  case "Sep":
		  case "Nov":
		   days = 30;
		   break;
		 
		  case "Jan":
		  case "Mar":
		  case "May":
		  case "Jul":
		  case "Aug":
		  case "Oct":
		  case "Dec":
		   days = 31;
		   break;
		 
		  default:
		   System.out.println("Invalid month.");
		   System.exit(0);
		 
		  }
		 
		  System.out.println(month + " " + year + " has " + days + " days"); */

	}

}
