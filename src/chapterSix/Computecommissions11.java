package chapterSix;

public class Computecommissions11 {
	
	
	public static void main(String[] args) {
		// Display table
		System.out.println("\n SalesAmount     Commission");
		System.out.println("-----------------------------");
		double salesAmount;
		for ( salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) 
		{
			System.out.printf(" %-16.0f", salesAmount);
			System.out.printf("%8.1f\n", computeCommission(salesAmount));
		}
	}

	/** Method commputeCommission computes the commission */
	public static double computeCommission(double salesAmount) {
		double balance = 0, 					// Holds the balance
		       commission = 0;				// Employee commission
			// Initialize balance and commission to 0
 
	
	
		if (salesAmount >= 0.01 && salesAmount <= 5000)
			commission = salesAmount * 0.08;
		
		else if ( salesAmount >= 5000.01 && salesAmount <= 10000)
			 commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
		else 
			   commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000) * 0.12;
		
	/*	if (salesAmount > 10000) {
			   commission = (5000 * 0.08) + (5000 * 0.1) + (salesAmount - 10000)
			     * 0.12;
			  } else if (salesAmount > 5000) {
			   commission = 5000 * 0.08 + (salesAmount - 5000) * 0.1;
			  } else {
			   commission = salesAmount * 0.08;
			  } */
		
		
/*	// If sales amount is $10.000.01 and above commission rate is 12%
		if (salesAmount >= 10000.01)
			commission += (balance = salesAmount - 10000) * 0.12;

		// If sales amount is $5,000.01 to $10,000 commissin rate is 10%
		if (salesAmount >= 5000.01)
			commission += (balance -= balance - 5000) * 0.10;

		// If sales amount is $0.01 to $5,000.01 commissin rate is 8%
		if (salesAmount >= 0.01 )
				commission += balance * 0.08;   */
			
		return commission;
	}
}
