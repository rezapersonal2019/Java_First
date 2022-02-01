package chapterTwo;

public class ArithmeticExpression {

	public static void main(String[] args) {
		
		int a, b, c, x, y;
		
		double total;
		
		
		
		a = 8;
		b = 3;
		c = 4;
		x = 6;
		y = 2;
		
		total = (3 + 4 * x)/5 - 10 * (y - 5) * ( a + b + c)/ x + 
				
				9 * ( 4 / x + ( 9 + x) / y);
		
		System.out.print(" The Total amount is: " + total);
		
		
		

	}

}
