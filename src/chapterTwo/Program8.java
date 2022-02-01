package chapterTwo;

import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		
		Scanner time = new Scanner(System.in);
		System.out.print(" Enterr the time zone offset to GMT: ");
		int offset = time.nextInt();
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;

	    long totalMinutes = totalSeconds / 60;
	    long currentMinute = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		currentHour = currentHour + offset;

	System.out.println(" Current time is " + currentHour + ":"
	     + currentMinute + ": " + currentSecond);


	}

}
