package chapterTen;

public class Circle2D {

	  //■ Two double data fields named x and y that specify the center of the circle with
	
	    //get methods.
	
	    double x; //center1
	
	    double y; //center2
	
	    double getX(){
	
	        return x;
	
	    }
	
	    double getY(){
	
	        return y;
	
	    }
	
	     
	
	    //■ A data field radius with a get method.
	
	    double radius;
	
	    double getRadius(){
	
	        return radius;
	
	    }
	
	     
	
	    //■ A constructor that creates a circle with the specified x, y, and radius.
	
	    Circle2D(double newX, double newY, double newRadius){
	
	        x = newX;

	        y = newY;
	
	        radius = newRadius;
	
	    }
	
	     
	
	    //■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1 for
	
	    //radius.
	
	    Circle2D(){
	
	        x = 0;
	
	        y = 0;
	
	        radius = 1;
	
	    }
	
	     
	
	    //■ A method getArea() that returns the area of the circle.
	
	    double getArea(){
	
	        double area = Math.PI * Math.pow(radius, 2);
	
	        return area;
	
	    }
	
	     
	
	    //■ A method getPerimeter() that returns the perimeter of the circle.
	
	    double getPerimeter(){
	
	        double perimeter = Math.PI * (2*radius);
	
	        return perimeter;
	
	    }

	    boolean contains(double x1, double y1){
	    	
	    	    double distance = Math.sqrt(Math.pow(x-x1, 2)-Math.pow(y1-y, 2));
	    	
	    	    if (distance > radius){
	    	
	    	        return false;
	    	
	    	    }
	    	
	    	    else{
	    	
	    	        return true;
	    	
	    	    }
	    	
	    }
	    	    boolean contains(Circle2D circle)
	    	    {
	    	    	
	    	    	    if (this.x > x){
	    	    	
	    	    	        double bigRadius = this.x;
	    	    	
	    	    	        double smallRadius = x;
	    	    	
	    	    	        double distance = Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.x, 2));
	    	    	
	    	    	        double x = bigRadius - distance;
	    	    	
	    	    	        if (x < smallRadius){
	    	    	
	    	    	            return false;
	    	    	
	    	    	        }
	    	    	
	    	    	        else{
	    	    	
	    	    	            return true;
	    	    	
	    	    	        }
	    	    	
	    	    	    }
	    	    	
	    	    	    else{
	    	    	
	    	    	        double bigRadius = x;
	    	    	
	    	    	        double smallRadius = this.x;
	    	    	
	    	    	        double distance = Math.sqrt(Math.pow(x-this.x, 2) + Math.pow(y-this.x, 2));
	    	    	
	    	    	        double x = bigRadius - distance;
	    	    	
	    	    	        if (x < smallRadius){
	    	    	
	    	    	            return false;
	    	    	
	    	    	        }
	    	    	
	    	    	        else{
	    	    	
	    	    	            return true;
	    	    	
	    	    	        }
	    	    	
	    	    	    }
	    	    	
	    	    	}
  
	    	    
	    	    
	    	    boolean overlaps(Circle2D circle){
	    	    	
	    	    	        if (this.x > x){
	    	    	
	    	    	            double bigRadius = this.x;
	    	    	
	    	    	            double smallRadius = x;
	    	    	
	    	    	            double distance = bigRadius - smallRadius;
	    	    	
	    	    	            if (distance > 0){
	    	    	
	    	    	                return true;
	    	    	
	    	    	            }
	    	    	
	    	    	            else{
	    	    	
	    	    	                return false;
	    	    	
	    	    	            }
	    	    	
	    	    	        }
	    	    	
	    	    	        else{
	    	    	
	    	    	            double bigRadius = x;
	    	    	
	    	    	            double smallRadius = this.x;
	    	    	
	    	    	            double distance = bigRadius - smallRadius;
	    	    	
	    	    	            if (distance > 0){
	    	    	
	    	    	                return true;
	    	    	
	    	    	            }
	    	    	
	    	    	            else{
	    	    	
	    	    	                return false;
	    	    	
	    	    	            }
	    	    	
	    	    	        }
	    	    	
	    	    	    
	    	    	
	    	    	        

	    	
	    	    }

	
	
	
}
