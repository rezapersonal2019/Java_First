package chapterThree;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {

       double a, b, c;

       Scanner input = new Scanner(System.in);
       
       System.out.print(" Enter the value a: ");
        a = input.nextDouble();
        
        System.out.print(" Enter the value b: ");
        b = input.nextDouble();
        
        System.out.print(" Enter the value c: ");
        c = input.nextDouble();

        
        double result = b * b - 4.0 * a * c;
        
        
        if (result > 0)
        {
        double r1 = (-b + Math.pow(result, 0.5))/ (2 * a);	
        double r2 = (-b + Math.pow(result, 0.5))/ (2 * a);	
        System.out.print(" The equation has two roots  " + r1 + " and " + r2);
        	
        }
        else if ( result == 0)
        {
        	double r1 = -b / (2 * a);
        	System.out.print(" The equation has one root " + r1);
        	
        }
        else 
        	
        System.out.print(" The equation has no real roots. ");
        
       

        
        


		

	}

}
