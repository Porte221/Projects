
public class Account implements IBankReports{

	private double balance = 0.0;
	private long accountNum;
	public double credit;
	public double debit;
	private Customer customer;

	
	private final double RATE = 0.035; //Increase rate of 3.5%
	
	//Set up account with a specific owner, account number, and initial balance
	public Account(long account, double initial, String customerName, String customerAddress) {
		
		accountNum = account;
		balance = initial;
		customer = new Customer(customerName, customerAddress);
		
	}
		
	
	//Set the customer information in this method
	public Customer setCustomer(Customer cust) {
		return this.customer = cust;
	}
	
	//Return the customer input
	public Customer getCustomer() {
		return customer;
	}
	
	
	//Return the account number once called
	public long getAccountNum() {
		return accountNum;
	}
	
	//Set the accountNum to this value
	public void setAccountNum(int AccountNum) {
		this.accountNum = AccountNum;
	}
	
	//Deposits amount into account and returns the new balance
	public void debitAmount(double amt) {
		if (amt > 0) 
			balance = balance + amt + RATE;
		this.debit = balance;
		
		if (this.debit <100){
			throw new IllegalArgumentException("minimum must be greater than 100");

		}

	}
	
	//Amount currently in account
	public void creditAmount(double amt) {
		
		//Throw an exception if the minimum balance is less than 100
		if (amt < 100) {
			throw new IllegalArgumentException("Minimum must be greater than 100");
		}
		this.credit = balance;
	}
	
	//Return the current balance of the account 
	public double getBalance() {
		return balance;
	}
	
	//Set the balance entered
	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	//Call method in parent class
	public void PrintReports() {
	
	}
	
	
}
