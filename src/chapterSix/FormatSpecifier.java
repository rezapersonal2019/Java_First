package chapterSix;

import javax.swing.JOptionPane;

public class FormatSpecifier {

	
	public static void main(String[] args) {
		
		// Declare a variety of double variables.
	   /*   double num1 = 1270.899;
	      double num2 = 3465.148;
	      double num3 = 3.776;
	      double num4 = 264.821;
	      double num5 = 88.081;
	      double num6 = 1799.999;
	      
	      // Display each variable in a field of
	      // 8 spaces with 2 decimal places. 
	      System.out.printf("%8.2f\n", num1);
	      System.out.printf("%8.2f\n", num2);
	      System.out.printf("%8.2f\n", num3);
	      System.out.printf("%8.2f\n", num4);
	      System.out.printf("%8.2f\n", num5);
	      System.out.printf("%8.2f\n", num6);
		*/
		
		/*double monthlyPay = 5000.0;
	      double annualPay = monthlyPay * 12;
	      System.out.printf("Your annual pay is $%,.2f\n", annualPay);
		
		*/
		
	/*	 double monthlyPay = 5000.0;
	      double annualPay = monthlyPay * 12;
	      String output = String.format("Your annual pay is $%,.2f\n", annualPay);
	      JOptionPane.showMessageDialog(null, output);
	      */
		
		 // Declare a variety of double variables.
	      double number1 = 1.234;
	      double number2 = 12.345;
	      double number3 = 123.456;
	      
	      // Display each variable with leading
	      // zeros, in a field of 9 spaces, rounded
	      // to 2 decimal places.
	      System.out.printf("%09.3f\n", number1);
	      System.out.printf("%09.3f\n", number2);
	      System.out.printf("%09.3f\n", number3);
	      
		

	      // Declare a variety of int variables.
	 /*     int num1 = 123;
	      int num2 = 12;
	      int num3 = 45678;
	      int num4 = 456;
	      int num5 = 1234567;
	      int num6 = 1234;
	      
	      // Display each variable left-justified
	      // in a field of 8 spaces.
	      System.out.printf("%-8d %-8d\n", num1, num2);
	      System.out.printf("%-8d %-8d\n", num3, num4);
	      System.out.printf("%-8d %-8d\n", num5, num6); */
	}
}
