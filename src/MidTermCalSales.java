import java.util.Scanner;

public class MidTermCalSales {
	
	
	public static void main(String[] args) {
		
		int product;
		int quantity = 0;
		double total= 0;
		double price = 0;
		Scanner keyboard = new Scanner(System.in);
		
		boolean done = false;
		
		for(int i=1;i<5 && !done;i++){
		
		    System.out.println("Enter product number (1-5),or -1 to quit");
		
		     product = keyboard.nextInt();
		
		 //   double price = 0;
		
		    switch (product){
		
		    case 1:
		//totalRetail+=2.98*quantitySold;

		       //   price = 2.98;
		        total += 2.98 * quantity;
		        //   total += 2.98;
		        
		        break;
		
		    case 2:
		
		      //  price = 4.5;
		    	
		    	 total += 4.5 * quantity;
		    	//total += 4.5;

		
		        break;
		
		    case 3:
		
		     //   price = 9.98;
		    	total += 9.98 * quantity;
		    	//total += 9.98;

		
		        break;
		
		    case 4:
		
		       // price = 4.49;
		    	 total += 4.49 * quantity;
		    	//total += 4.49;

		        break;
		
		    case 5:
		
		      //  price = 6.87;
		    	 total += 6.87 * quantity;
		    	//total += 6.87;

		
		        break;
		
		    default:
		
		        done = true;
		
		    }
		
		 //   int quantity = 0;
		
		    if (!done) {
		
		    System.out.println("Enter number of quantities sold:");
		
		    quantity = keyboard.nextInt();
		
		    }
		
		  //  total += price * quantity;
		
		}
		
		System.out.printf("Total income: $%.2f ", total);

		
		
		
		
		
		
		
		
		
		
	}

}
