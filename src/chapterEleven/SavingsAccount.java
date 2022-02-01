package chapterEleven;

public class SavingsAccount extends Account3 {
	
	double overdrawnLimit ;
	/** Construct a default CheckingAccount object */
	public SavingsAccount() {
		super();
	}

	/** Construct a SavingsAccount with specified id, balance */
	public SavingsAccount(int id, double balance, double overdrawnLimit) {
		super(id, balance);
		
		this.overdrawnLimit = overdrawnLimit;
	}

	/** Decrease balance by amount */
	public void withdraw(double amount) {
		
		if (getBalance() - amount > overdrawnLimit) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Amount exceeds overdraft limit.");
	
	}
	
	public String toString() {
		return "Saving" + super.toString() + "\nOverdrawn limit: $" + 
		String.format("%.2f", overdrawnLimit);
	}
	
	
	
	/*
	
	public SavingsAccount(int accNumber, double balance, double annualInterestRate, String dateCreated) {
		super(accNumber, balance, annualInterestRate, dateCreated);
		}

		@Override
		public String toString()
		{
		String res = "Savings account Details\n";
		res += super.toString();
		return res;
		}  */
}
