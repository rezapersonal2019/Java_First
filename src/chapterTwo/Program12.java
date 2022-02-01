package chapterTwo;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		
		
		double speed, acceleration, len, length;
		
		Scanner input = new Scanner( System.in);
		
		System.out.print("Enter speed and acceleration: ");
		
		speed= input.nextDouble();
		acceleration = input.nextDouble();
		
		length = (speed * speed)/( acceleration * 2);
		
		System.out.print("THe minium runway length for this airplane is " + length);

	}

}
