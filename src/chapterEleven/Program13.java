package chapterEleven;

import java.util.ArrayList;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> duplicat = new ArrayList<Integer>();
		
		System.out.print(" Enter the ten integer numbers: ");
			
			for( int i = 0; i < 10; i++)
			{
				duplicat.add(input.nextInt());
			}
		
			// Invoke removeDuplicate method
			removeDuplicate(duplicat);

			// Display the distinct integers
			System.out.print(" The distinct integers are ");
			for (int i = 0; i < duplicat.size(); i++) {
				System.out.print(duplicat.get(i) + " ");
			}
			System.out.println();

	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}

}
