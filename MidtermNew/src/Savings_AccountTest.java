import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Savings_AccountTest {

	@Before
	public void setUp() throws Exception{
		
	}
	
	@Test
	public void testPrintReports() {
		double balance = 100;
		String customer ="name";
		String customerAddress = "address";
		
		Savings_Account test = new Savings_Account(customer, customerAddress, 0, balance);
		assertTrue(test.getBalance() == balance);
	}
	





}
