package chapterEleven;

import java.util.Date;

public class Account3 {

	// Data fields
		private int id;
		private double balance;
		private static double annualInterestRate;
		private Date dateCreated;

		// Constructors
		/** Creates a default account */
		Account3() {
			//this(0, 0); 
		}

		/** Creates an account with the specified id and initial balance */
		Account3(int id, double balance) {
			this.id = id;
			this.balance = balance;
			annualInterestRate = 0;
			dateCreated = new Date();
		}

		// Mutator methods
		/** Set id */
		public void setId(int id) {
			this.id = id;
		}

		/** Set balance */
		public void setBalance(double balance) {
			this.balance = balance;
		}

		/** Set annualInterestRate */
		public void setAnnualInterestRate(double annualInterestRate) {
			this.annualInterestRate = annualInterestRate;
		}

		// Accessor methods
		/** Return id */
		public int getId() {
			return id;
		}

		/** Return balance */
		public double getBalance() {
			return balance;
		}

		/** Return annualInterestRate */
		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		/** Return dateCreated */
		public String getDateCreated() {
			return dateCreated.toString();
		}

		/** Return monthly interest rate */
		public double getMonthlyInterestRate() {
			return annualInterestRate / 12;
		}

		// Methods
		/** Return monthly interest */
		public double getMonthlyInterest() {
			return balance * (getMonthlyInterestRate() / 100);
		}

		/** Decrease balance by amount */
		public void withdraw(double amount) {
			balance -= amount;
		}

		/** Increase balance by amount */
		public void deposit(double amount) {
			balance += amount;
		}
	//	System.out.println();

		/** Return a String decription of Account class */
		public String toString() {
			return "Account ID: " + id + "\nDate created: " + getDateCreated()
				+ "\nBalance: $" + String.format("%.2f", balance) + 
				"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
		}
	
	
	
	
	
	
	
/*	int accNumber;
	double balance;
	double annualInterestRate;
	String dateCreated;

	public Account3(int accNumber, double balance, double annualInterestRate, String dateCreated) {
	this.accNumber = accNumber;
	this.balance = balance;
	this.annualInterestRate = annualInterestRate;
	this.dateCreated = dateCreated;
	}

	public void deposit(double amount)
	{
	balance = balance + amount;
	}

	public void withdraw(double amount)
	{
	balance = balance - amount;
	}

	@Override
	public String toString()
	{
	String res = "";
	res += "Account number : " + accNumber + "\n";
	res += "Balance is : " + balance + "\n";
	res += "Annual Interest Rate is : " + annualInterestRate + "\n";
	res += "Date created is : " + dateCreated + "\n";
	return res;
	}   */
}
