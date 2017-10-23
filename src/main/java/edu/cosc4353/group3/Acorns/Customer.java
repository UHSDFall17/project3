package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class Customer {
	private String user;
	private String passwd;
	private int card;
	private char[] ports;

	public Customer(String username, String password, int cardNumber) {
		user = username;
		passwd = password;
		card = cardNumber;
		ports = new char[4];
	}
	
	public Customer() {
		passwd = "";
		card = 0;
		ports = new char[4];
	}

	public String returnUsername() {
		return user;
	}
	public int returnCardNumber() {
		return card;
	}
	
	public static int hashUsername(String username) {
		int total = 0;
		
		for(int i = 0; i < username.length(); i++) {
			total += (int)username.charAt(i);
		}
		return((total)%5);
	}
	// Username hash to store and identify object
	public void storeUser() {
		
	}
	// TODO Pull user object if pass match
	//some code
}
