package chapterNine;

public class TestAccount {

	public static void main(String[] args) {
		
		
		 //Create an instance object of class Stock
		
		        Account myAccount = new Account(1122, 20000);
		        
		        myAccount.setannualInterestRate(4.5);
		
		        myAccount.withdraw(2500);
		
		        myAccount.deposit(3000);
		
		         
		
		        //display balance, monthly interest and date of account
		
		        System.out.println("Balance: $" + myAccount.getbalance());
		
		        System.out.println("Monthly Interest: " + myAccount.getMonthlyInterest());
		
		         
		
		        java.util.Date dateCreated = new java.util.Date();
		
		        System.out.println("Account created on: " + dateCreated.toString());

	}

}
