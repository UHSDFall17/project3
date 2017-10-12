package edu.cosc4353.group3.AcornsEmulator;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

// Reversion of smeet's code
public class UserCreation {
	public static void createUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter User: ");
		String username = input.next();
		
		System.out.println("Enter Password: ");
		String password = input.next();
		
		System.out.println("Enter Credit Card Number");
		int cardNumber = input.nextInt();
		
		Customer customer = new Customer(username, password, cardNumber);
		assertEquals(cardNumber, customer.getCardNumber());
	}
}
