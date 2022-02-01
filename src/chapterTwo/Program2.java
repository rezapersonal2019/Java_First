package chapterTwo;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double radi, len, area, volume;
		
		System.out.print(" Enter the radius and length of a cylindernumber: ");
		
		radi = input.nextDouble();
		
		len = input.nextDouble();
		
		area = radi * radi * 3.1416;
		volume = area * len;
		
		System.out.println(" The area is " + area);
		System.out.print(" The volume is " + volume);
		
		
		
		

	}

}
