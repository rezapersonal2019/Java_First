package chapterThree;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
	
		
		
		
		
		 final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		double feet, inches;
		double weight, bmi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter wieght in pounds: ");
		
		weight = input.nextDouble();
		
		System.out.print("Enter feet: ");
		
		feet = input.nextDouble();
		
		System.out.print("Enter inches: ");
		inches = input.nextDouble();
		
		
		
		double heightInMeter = (feet * 12 + inches) * METERS_PER_INCH;
		
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		
		bmi = weightInKilograms / (heightInMeter * heightInMeter);
		
		System.out.println("BMI is " +bmi);
		
		if (bmi <18.5)
			System.out.println(" Underweight");
		else if (bmi >= 18.5 && bmi < 25)
			System.out.println(" Normal");
		else if ( bmi >= 25 && bmi < 30 )
			System.out.println("Overweight"); 
		else 
			System.out.print(" Obse");
}
} 


















