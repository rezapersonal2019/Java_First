package chapterThree;

import java.util.Scanner;

public class Program33 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.print(" Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		
		System.out.print(" Enter weight and price for package 2:" );
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		if (weight1 / price1 > weight2 / price2)
			System.out.print(" Package one is a better price.");
		
		else if ( weight1 / price1 < weight2 / price2)
			System.out.print(" Package two is a better price. ");
		
		else
			System.out.print(" Both package are same price. ");

	}

}
