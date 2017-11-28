package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class AppTest
{
	
	@Test
	public void testCustomerCreation(){
		
			String user = "Dee";
			String password = "111111";
			String cardNo = "4929933965135652";
			int portIden = 1;
			double balance = 100;
			String accountType = "corporate";
			boolean isInvest = true;
			double[] stock = new double[10];
			double[] bond = new double[10];
			int investLength = 4;
		
		Customer customer = new Customer(user, password, cardNo, portIden, balance, accountType
						,isInvest, stock, bond, investLength);
		
		Assert.assertEquals(user, customer.getUser_Name());
		
	}
	
	@Test
	public void testDeposit(){
		
			String user = "Dee";
			String password = "111111";
			String cardNo = "4929933965135652";
			int portIden = 1;
			double balance = 100;
			String accountType = "corporate";
			boolean isInvest = true;
			double[] stock = new double[10];
			double[] bond = new double[10];
			int investLength = 4;
		
		Customer customer = new Customer(user, password, cardNo, portIden, balance, accountType
						,isInvest, stock, bond, investLength);
		double amount = 100;
		double temp = customer.getUser_balance();
		FundsHandler.depositFunds(customer);
		
		Assert.assertEquals(amount, temp, 0);
						
	}
	
// Tests for Customer class
/*	@Test
	public void testAddCustomer() {
		String testUser = "asdf";
		String testPass = "1234";
		int testCard = 1234;
	    Customer customer = new Customer(testUser, testPass, testCard);
	    Assert.assertEquals(testCard, customer.returnCardNumber());
	    Assert.assertEquals(testUser, customer.returnUsername());
	}
	@Test 
	public void testHashUserForInt() {
		String testUser = "1234";
		String testPass = "1234";
		int testCard = 1234;
	    Customer customer = new Customer(testUser, testPass, testCard);
		int someHash = Customer.hashUsername(customer.returnUsername());
		int userHash = 0;
		for(int i = 0; i < testUser.length(); i++) {
			userHash =+ (int)testUser.charAt(i);
		}
		int number = (userHash)%5;
		Assert.assertEquals(number, someHash);
	}
	@Test 
	public void testHashUserForString() {
		String testUser = "test";
		String testPass = "1234";
		int testCard = 1234;
	    Customer customer = new Customer(testUser, testPass, testCard);
		int someHash = Customer.hashUsername(customer.returnUsername());
		int userHash = 0;
		for(int i = 0; i < testUser.length(); i++) {
			userHash += (int)testUser.charAt(i);
		}
		int number = (userHash)%5;
		Assert.assertEquals(number, someHash);
	}
	@Test 
	public void testHashUserForStringInt() {
		String testUser = "test123";
		String testPass = "1234";
		int testCard = 1234;
	    Customer customer = new Customer(testUser, testPass, testCard);
		int someHash = Customer.hashUsername(customer.returnUsername());
		int userHash = 0;
		for(int i = 0; i < testUser.length(); i++) {
			userHash += (int)testUser.charAt(i);
		}
		int number = (userHash)%5;
		Assert.assertEquals(number, someHash);
	}
	@Test
	public void testUsercreation() {
		Customer newUser = new Customer();
		newUser = StartMenu.createUser();
		Assert.assertEquals("12345", newUser.returnUsername());
		Assert.assertEquals(12345, newUser.returnCardNumber());
	}
	*/
	
    public static void main(String[] args) {
    	
        // TODO code application logic here
              StartMenu start = new StartMenu();

              start.DisplayMenu();
    }

}
