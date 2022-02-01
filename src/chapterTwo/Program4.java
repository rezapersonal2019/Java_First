package chapterTwo;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		double pound, kilogram;
		
		System.out.print(" Enter a number in pounds");
		
		pound = input.nextDouble();
		
		kilogram = pound * 0.454;
		
		System.out.print(" 55.5 pounds is " + kilogram + " kilograms");
	}

}
