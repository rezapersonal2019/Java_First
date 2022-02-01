package chapterNine;

import java.util.Scanner;

public class TestCellPhone {

	public static void main(String[] args) {
		String testmanu;
		String testmod;
		double testprice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the manufacture: ");
		testmanu = input.nextLine();
		
		System.out.print(" Enter the model: ");
		testmod = input.nextLine();
		
		System.out.print(" Enter the retailprice: ");
		testprice = input.nextDouble();
		
		Cellphone phone = new Cellphone(testmanu, testmod, testprice);
		
		phone.display();
	

	}

}
