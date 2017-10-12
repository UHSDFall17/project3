package edu.cosc4353.group3.AcornsEmulator;

public class HashUser {
	// Hash username
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
	// Pull user object if pass match
}
