package edu.cosc4353.group3.AcornsEmulator;

import java.util.Scanner;

public class Customer {
	private String user;
	private String passwd;
	private int card;

	public Customer(String username, String password, int cardNumber) {
		user = username;
		passwd = password;
		card = cardNumber;
	}
	
	public int getCardNumber() {
		return card;
	}
	
	public int hashUsername(String username) {
		int nameLength = username.length();
		int user[] = new int[nameLength];
		int total = 0;
		
		for(int i = 0; i < nameLength; i++) {
			user[i] = username.charAt(i);
		}
		for(int i = 0; i < nameLength; i++) {
			System.out.println(user[i] + " ");
		}
		for(int i = 0; i < nameLength; i++) {
			total += user[i];
		}
		System.out.println("Total is: " + total);
		return((total)%5);
	}
	// Username hash to store and identify object
	public void storeUser() {
		
	}
	// TODO Pull user object if pass match
	public static void createUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter User: ");
		String username = input.next();
		
		System.out.println("Enter Password: ");
		String password = input.next();
		
		System.out.println("Enter Credit Card Number");
		int cardNumber = input.nextInt();
		
		Customer customer = new Customer(username, password, cardNumber);
	}
}
