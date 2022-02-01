package chapterNine;

import java.util.Date;

public class Account {
  
	// Define variable
	
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// No arg constructor
	
	Account(){
		id = 0;
		balance =0;
		annualInterestRate = 0;
	}
	
	// Constructor with specified id and initial balance
	
	Account(int newId, double newBalance){
		
		id = newId;
		balance = newBalance;
		
	}
	
	//The accessor(get) and mutator(set)  methods for id, balance, and annualInterestRate
	
	public int getId() {
		return id;
	}
	
	public double getbalance() {
		
	return balance;
	}
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	
	public void setId(int newIdd) {
		id = newIdd;
	}
	
	public void setbalance(double newBbalance) {
		
	  balance = newBbalance;
	}
	public void setannualInterestRate(double newannualInterestRate) {
	 annualInterestRate = newannualInterestRate;
	}
	
	
	//The Accessor method for dateCreated
	
	    public void setDateCreated(Date newDateCreated) {
	
	        dateCreated = newDateCreated;
	
	    }
	
	     
	
	    //A method named getMonthlyInterestRate() that returns the monthly interest rate
	
	    double getMonthlyInterestRate() {
	
	        return (annualInterestRate/100/12);
	
	    }
	
	 
	
	    //A method named getMonthlyInterest() that returns the monthly interest
	
	    double getMonthlyInterest() {
	
	        return balance * getMonthlyInterestRate();
	
	    }
	
	 
	
	    //A Method named withdraw that withdraws a specified amount from the account
	
	    double withdraw(double amount) {
	
	      
	return balance-= amount;
	    }  
	
	 
	
	    //A method named deposit that deposits a specified amount to the account
	
	    double deposit(double amount) {
	
	       // return setBalance(getBalance() + amount);
	return balance+= amount;
	    }

	
	
}
