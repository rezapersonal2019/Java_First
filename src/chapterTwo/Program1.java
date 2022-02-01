package chapterTwo;

import java.util.Scanner;

public class Program1 {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		double  cels, farn;
		System.out.print(" Enter any celsius number: ");
		
		cels = input.nextDouble();
		
		 farn = 1.8 * cels + 32;
		
		System.out.print(" Fahrenheit is:" + farn);
		
		
		
		
	}

}
