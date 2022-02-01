package chapterEleven;

public class Triangle extends GeometricObject {

	private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
   

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
        
        
    }

    
    

    public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	} 
    
   


	public double getSide2() {
		return side2;
	}

 	public void setSide2(double side2) {
		this.side2 = side2;
	} 
	

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	} 
	
	

	 
	
	public double getArea( ) {
		
		double area = 0.0;
       
		if((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1)
		{		
		double	s = (side1 + side2 + side3) / 2.0;
		
		
		 area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		}
		else
		   System.out.println("Area of Triangle not exit");
		
		
		return area;
	
		
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }


	
	
	
	}
