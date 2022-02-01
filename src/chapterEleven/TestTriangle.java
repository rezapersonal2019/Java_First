package chapterEleven;

import java.util.Scanner;

public class TestTriangle {
	
	
	public static void main(String args[])
	{
       
		
		
	    Scanner input = new Scanner(System.in);

	    System.out.println("Enter three sides of the Triangle");
	    double side1 = input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3 = input.nextDouble();

	    System.out.println("Enter the color of the Triangle");
	    String color = input.next();

	    System.out.println("Is the Triangle filled? Reply with 'True' or 'False' ");

	    boolean filled = input.nextBoolean();
	    
	    Triangle triangle = new Triangle(side1, side2, side3);
	   triangle.setFilled(filled);
	    triangle.setColor(color);


	    // Display 
	    
	    System.out.println(" The Triangle" + triangle.toString());
	    System.out.println("The Triangle Sides are: \n side 1: " 
	            + triangle.getSide1() + "\n Side 2: " + triangle.getSide2() 
	            + "\n Side 3: " + triangle.getSide3());

	    System.out.printf("The Triangle's Area is %.2f \n", triangle.getArea());
	    System.out.printf("The Triangle's Perimeter is %.2f \n", triangle.getPerimeter());
	    System.out.printf("The Triangle's Color is %s. \n", triangle.getColor());
	    System.out.println("Is the Triangle filled? " + triangle.isFilled());
	}


	}
