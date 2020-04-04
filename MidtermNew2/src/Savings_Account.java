import java.time.LocalDate;

public class Savings_Account extends Account{

	
	//Create variable of when account is created
	private double Min_balance = 100.00;
	private LocalDate Date_Open;
	private double balance;
	
	
	//Constructor
	public Savings_Account(String customerName, String customerAddress, long account, double initial) {
		super(account, initial, customerName, customerAddress);
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the min_balance
	 */
	public double getMin_balance() {
		return balance;
	}

	/**
	 * @param min_balance the min_balance to set
	 */
	public void setMin_balance(double initial) {
		balance = initial + this.Min_balance;
			
	}

	/**
	 * @return the date_Open
	 */
	public LocalDate getDate_Open() {
		return Date_Open;
	}

	/**
	 * @param date_Open the date_Open to set
	 */
	public void setDate_Open(LocalDate date_Open) {
		Date_Open = date_Open;
	}
	
	//Overrides the interface and displays the savings account for each customer
	public void PrintReports() {
		System.out.printf(" "+"Savings: $%1.2f", (double)this.getBalance()); 

	}
}
