package chapterTwelve;

public class CircleWithCustomException {
	
	private double radius;
	private static int numberOfObjects = 0;
	public CircleWithCustomException() throws ExamInvaliRadiusException{
		this(1.0);
		
		
	}
	public CircleWithCustomException( double newRadius)
	throws ExamInvaliRadiusException{
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
		
	}
	
	public void setRadius(double newRadius)
	throws ExamInvaliRadiusException{
		if (newRadius >= 0)
			radius = newRadius;
		else 
			throw new ExamInvaliRadiusException(newRadius) ;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return radius * radius * 3.14159;
	}
	

}
