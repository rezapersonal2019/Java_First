package chapterEleven;

public class TestAccount3 {

	public static void main(String[] args) {
	
		// Create Account, SavingsAccount and Checking Account objects
				Account3 account = new Account3(1122, 20000);
				SavingsAccount savings = new SavingsAccount(1001, 20000, 0.0);
				//CheckingAccount checking = new CheckingAccount(1004, 20000, 50);
				CheckingAccount checking = new CheckingAccount(50);
			//	Account3 account2 = new CheckingAccount(50);
				
				// Set annual interest rate of 4.5%
				account.setAnnualInterestRate(4.5);
				savings.setAnnualInterestRate(4.5);
			//	checking.setAnnualInterestRate(4.5);

				// Withdraw $2,500
				account.withdraw(2500);
				savings.withdraw(2500);
			//	checking.withdraw(2500);

				// Deposit $3,000
				account.deposit(3000);
				savings.deposit(3000);
			//	checking.deposit(3000);

				// Invoke toString methods
				System.out.println(account.toString());
				System.out.println();
				System.out.println(savings.toString());
				System.out.println();
				System.out.println(checking.toString());
				//System.out.println(account2.toString());

		
		
	/*	Account3 acct = new Account3(1001, 500, 3.5, "02-05-2014");
		CheckingAccount cacct = new CheckingAccount(1002, 1000, 4.0, "06-08-2014");
		SavingsAccount sacct = new SavingsAccount(1003, 750, 4.0, "05-07-2013");
		System.out.println(acct.toString());
		System.out.println(cacct.toString());
		System.out.println(sacct.toString());
		
		*/
	}

}
