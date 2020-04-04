/*	This is the entry into the Bank Application program
 * 
 */

import java.util.ArrayList;

public class BankApplication {

	public static void main (String [] args) {
		
		//Create an object of the class Bank (Bank name and address)
		Bank myBank = new Bank("TellsWells Bank", " 123 Luckly Lane, MN, 77777");
		
		
		//Create an object of the class Account (Name, Address, accountNumber(index) and balance)
		Account account0 = new Current_Account("Walyon Dalton", " 351 Surrey Circle Brooklyn NY 11209", 0, 1356.00);				
		Account account1 = new Savings_Account("Walyon Dalton", " 351 Surrey Circle Brooklyn NY 11209", 1, 599.00);
		Account account2 = new Current_Account("Justine Henders", "9858 Glen Eagles Ave. NY 11237", 2, 156.00);
		Account account3 = new Savings_Account("Justine Henders", "9858 Glen Eagles Ave. NY 11237", 3, 3599.00);
		Account account4 = new Current_Account("Abdullah Lang" , "9927 Woodside Lane NY 11213", 4, 1156.00);
		Account account5 = new Savings_Account("Marcus Cruzing" , "71 Depot Lane Brooklyn NY 11212", 5, 99.00);
		Account account6 = new Current_Account("Thalia Cobbing" ,  "7233 NE. Summer St. NY 11235", 6, 2016.00);
		Account account7 = new Savings_Account("Thalia Cobbing" ,  "7233 NE. Summer St. NY 11235", 7, 35099.00);
		Account account8 = new Current_Account("Mathias Little" ,  "87 Deerfield Ave.S.Valley NY 10977", 8, 3599.00);
		Account account9 = new Current_Account("Eddie Randolph", "718 East Howard Rd. NY 10977 ", 9, 7146.00);
		Account account10 = new Savings_Account("Eddie Randolph", "718 East Howard Rd. NY 10977 ", 10, 9449.00);
		Account account11 = new Current_Account("Angela Walker", "9786 Fieldstone Rd. Bronx, NY 10456", 11, 156.00);
		Account account12 = new Savings_Account("Angela Walker", "9786 Fieldstone Rd. Bronx, NY 10456", 12, 3599.00);
		Account account13 = new Current_Account("Lia Shelton", "226 High Noon Ave. Bronx, NY 10463", 13, 31356.00);
		Account account14 = new Savings_Account("Lia Shelton", "226 High Noon Ave. Bronx, NY 10463", 14, 353399.00);
		Account account15 = new Current_Account("Hadassah Hartman", "642 Windfall Drive New York NY 11370", 15, 21256.00);
		Account account16 = new Savings_Account("Hadassah Hartman", "642 Windfall Drive New York NY 11370", 16, 359922.00);
		Account account17 = new Current_Account("Joanna Shaffer", " 99 Heritage St.New York, NY 10040", 17, 16.00);
		Account account18 = new Current_Account("Jonathon Sheppard" , "7 Cactus Ave. New York, NY 12550", 18, 56.00);
		Account account19 = new Savings_Account("Jonathon Sheppard" , "7 Cactus Ave. New York, NY 12550", 19, 99.00);
		
		
		//Add each account object into bank list
		myBank.addAccount(account0);
		myBank.addAccount(account1);
		myBank.addAccount(account2);
		myBank.addAccount(account3);
		myBank.addAccount(account4);
		myBank.addAccount(account5);
		myBank.addAccount(account6);
		myBank.addAccount(account7);
		myBank.addAccount(account8);
		myBank.addAccount(account9);
		myBank.addAccount(account10);
		myBank.addAccount(account11);
		myBank.addAccount(account12);
		myBank.addAccount(account13);
		myBank.addAccount(account14);
		myBank.addAccount(account15);
		myBank.addAccount(account16);
		myBank.addAccount(account17);
		myBank.addAccount(account18);
		myBank.addAccount(account19);
		
		//Remove account Eddie Randolph from list
		myBank.removeAccount(account9);
		myBank.removeAccount(account10);
		
		//Create an arraylist or collection of accounts
		ArrayList<Account> accounts = myBank.getAllAccounts();
		

		//Lamdba functions that traverses each object and prints the values in printReports
		accounts.forEach(x -> x.PrintReports());
		
		System.out.println();
		
		



	}
}
