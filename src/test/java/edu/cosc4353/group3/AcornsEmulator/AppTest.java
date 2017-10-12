package edu.cosc4353.group3.AcornsEmulator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

public class AppTest extends HashUser
{
//	// Test for Customer class
//    @Test
//    public void testAddCustomer() {
//    	Customer customer = new Customer("asdf","1234",1234);
//    	assertEquals(1234, customer.getCardNumber());
//    }
//    // Test for Create User
//    @Test
//    public void testAddUser() {
//    	Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter User: ");
//		String username = input.next();
//		
//		System.out.println("Enter Password: ");
//		String password = input.next();
//		
//		System.out.println("Enter Credit Card Number");
//		int cardNumber = input.nextInt();
//		
//		Customer customer = new Customer(username, password, cardNumber);
//		assertEquals(cardNumber, customer.getCardNumber());
//    }
//    // TODO make test for calling UserCreation
//    @Test
//    public void addUser() {
//    	Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter User: ");
//		String username = input.next();
//		
//		System.out.println("Enter Password: ");
//		String password = input.next();
//		
//		System.out.println("Enter Credit Card Number");
//		int cardNumber = input.nextInt();
//		
//		Customer customer = new Customer(username, password, cardNumber);
//    	UserCreation.createUser();
//
//		assertEquals(cardNumber, customer.getCardNumber());
//    }
	// Hash function tests
    @Test
    public void testHashFunction(){
//    	String test = "b";
//    	int something = test.charAt(0)%5;
//    	assertEquals(something, hashUsername(test));
    	String test = "azx";
    	int something = 97 + 97 + 23 + 25 + 97;
    	assertEquals(something%5, hashUsername(test));
    }
}
