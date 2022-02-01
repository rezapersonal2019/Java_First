package chapterNine;

public class TestProgram {
	
	// main method
	public static void main(String[] args) {
		
		
	// create a rectangle object 1
		
		Rectangle rectangle1 = new Rectangle(4,40);
		
		// create a rectangle object 2
		
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		// Calling a methods
		
		System.out.println( " The width of the rectangle    : " + rectangle1.getWidth());
		System.out.println( " The height of the rectangle   : " + rectangle1.getHeight());
		System.out.println( " The area of the rectangle     : " + rectangle1.getArea());
		System.out.println( " The perimeter of the rectangle: " + rectangle1.getPerimeter());
		
		System.out.println("\n");
	
		
		System.out.println( " The width of the rectangle    : " + rectangle2.getWidth());
		System.out.println( " The height of the rectangle   : " + rectangle2.getHeight());
		System.out.println( " The area of the rectangle     : " + rectangle2.getArea());
		System.out.println( " The perimeter of the rectangle: " + rectangle2.getPerimeter());
		
		
		
		
		
		
		
		
		
	}

}
