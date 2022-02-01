package chapterNine;

public class Rectangle {

	double width;
	double height;
	
	// construct a rectangle object
	
	Rectangle(){
		
		width = 1;
		height = 1;
		
	}
	
	// construct a rectangle object
	
	Rectangle(double wid, double heih){
		
		width = wid;
		height = heih;
	}
	
	// return the area of this rectangle
	
	double getArea() {
		
		return width * height;
		
		
	}
	
	// return the perimeter of this rectangle
	
	double getPerimeter() {
		
		return 2* (height + width);
	}
	
	// return the width of this rectangle
	
	double getWidth() {
		
		return width;
	}
	
	// return the height of this rectangle
	
	double getHeight() {
		
		return height;
	}
}
