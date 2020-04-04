import java.time.LocalDate;

public class Current_Account extends Account{
	
	
	//Create variables
	private double interest = 0.04;
	private LocalDate Date_Open;
	
	
	//Constructor
	public Current_Account(String customerName, String customerAddress, long account, double initial) {
		super(account, initial, customerName, customerAddress);
		
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

	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}

	/**
	 * @param interest the interest to set
	 */
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	//Overrides the interface and displays the checking account for each customer

	public void PrintReports() {
		System.out.printf("\nName: " + this.getCustomer().getName() +
				          " Address: " + this.getCustomer().getAddress() + 
				          " Checking: $%1.2f", (double)this.getBalance()); 
	}
}
