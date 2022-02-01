


package chapterTwelve;
public class ExamInvaliRadiusException extends Exception {

	
	private double radius;
	
	public ExamInvaliRadiusException(double radius) {
		super(" Invalid radius " + radius);
		this.radius = radius;
		
	}
	
	public double getRadius() {
		return radius;
	}
}
