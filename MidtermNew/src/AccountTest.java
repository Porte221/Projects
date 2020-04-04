import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {


	@Before
	public void setUp() throws Exception {
	}

	
	@Test
	public void testAccount() {
		
		double initial = 200;
		String customerName = "Xavier";
		String customerAddress = "123 Lucky Drive";
		long account = 123;
		Account test = new Account(account, initial, customerName, customerAddress);

		assertTrue(test.getAccountNum() == account);
		
		

	}

	@Test
	public void testDebitAmount() {
		double initial = 200;
		double added = 300;
		String customerName = "Xavier";
		String customerAddress = "123 Lucky Drive";
		long account = 123;
		Account test = new Account(account, initial, customerName, customerAddress);
		test.setBalance(initial + added);
		
		assertTrue(test.getBalance() == initial + added);
		
		
	}

	@Test
	public void testCreditAmount() {

		double initial = 200;
		String customerName = "Xavier";
		String customerAddress = "123 Lucky Drive";
		long account = 123;
		Account test = new Account(account, initial, customerName, customerAddress);
		test.setBalance(initial);
		
		assertTrue(test.getBalance() == initial);
	}

}
