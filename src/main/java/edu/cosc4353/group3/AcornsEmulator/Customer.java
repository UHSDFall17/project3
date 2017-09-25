package edu.cosc4353.group3.AcornsEmulator;

public class Customer {
	
	private String passwd;
	private int card;
	
	Customer(String password, int cardNumber){
		passwd = password;
		card = cardNumber;
	}
	public String getPassword() {
		return passwd;
	}
	public int getCardNumber() {
		return card;
	}
}
