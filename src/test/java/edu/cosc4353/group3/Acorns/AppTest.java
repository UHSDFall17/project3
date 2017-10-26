package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class AppTest
{
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
