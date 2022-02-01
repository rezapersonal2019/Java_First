package chapterTwo;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double feet, meter;
		
		System.out.print(" Enter a value for feet: ");
		
		feet = input.nextDouble();
		
		meter = feet * 0.305;
		
		System.out.print(" 16.5 feet is " + meter + " meters" );
		
				

	}

}
