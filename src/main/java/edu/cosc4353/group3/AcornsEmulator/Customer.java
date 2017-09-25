package edu.cosc4353.group3.AcornsEmulator;

// First Implementation of a Customer object
// TODO Remove user variable and create hash instead
// TODO Method to compare passwords after matching with obj in hashtable
public class Customer{
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
}
