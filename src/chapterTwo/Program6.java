package chapterTwo;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		 int digits, n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        
	        System.out.print("Enter the number:");
	        
	        digits = s.nextInt();
	        
	        while(digits > 0)
	        {
	            n = digits % 10;
	            sum = sum + n;
	            digits = digits / 10;
	        }
	        System.out.println("Sum of Digits:"+sum);
		
		
	}

}
