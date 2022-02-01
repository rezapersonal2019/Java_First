package chapterEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double>list = new ArrayList<Double>();
		
		System.out.print (" Enter the five numbers: ");
		
		for (int i = 0; i < 5; i++)
		{
			list.add(input.nextDouble());
		}
		
		System.out.println(" Total sum are: " + sum(list));
		

	}
	
	public static double sum(ArrayList<Double> list) {
		double sum = 0;
		/*for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		} */
		
		for ( double val : list) {
			sum += val; }
		return sum;
	}

}
