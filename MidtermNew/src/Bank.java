import java.util.ArrayList;

//The Bank class
public class Bank {

	//Set initial value
	private String name = "Bank";
	private String address = "Address, city, zip";
	
	
	//Creates an array list of account
	ArrayList<Account> list = new ArrayList <Account>();
	
	public Bank(String owner, String address) {
		name = owner;
		this.address = address;
		
	}
		
	
	//Method to add account
	public void addAccount(Account addAccount) {
		//Create a new account and add to acc object
		list.add(addAccount);

	}
	
	//Method to remove account
	public void removeAccount(Account removeAccount) {
	
		//Remove account from list
		list.remove(removeAccount);

	}
	
	//Method to get account
	public Account getAccount(long id) {
		for(Account account:list){
			
			if(account.getAccountNum() == id) {
				return account;
			}
			
		}
		return null;
		
	}

	public ArrayList getAllAccounts() {
		return list;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}



	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}



	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}



	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
