
public class Customer {

	//Create private variables
	
	private int Cust_ID;
	
	private String Name = "";
	
	private String Address = "";
	
	private String Phone = "";

	
	//Create a constructor for the class Customer
	public Customer(String customerName, String customerAddress) {
		Name = customerName;
		Address = customerAddress;
		
	}
	//Create accessors and mutators to change private data
	/**
	 * @return the cust_ID
	 */
	public int getCust_ID() {
		return Cust_ID;
	}

	/**
	 * @param cust_ID the cust_ID to set
	 */
	public void setCust_ID(int cust_ID) {
		Cust_ID = cust_ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}
	
	
	
}
