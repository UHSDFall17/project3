package edu.cosc4353.group3.Acorns;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LoginMenu extends Menu{

	public static void displayMenu() {
		Scanner input = new Scanner(System.in);
		int tempCard = 0;
		boolean InvalidCheck = false;
			System.out.println("Enter User: ");
            String username = input.next();
		
            System.out.println("Enter Password: ");
            String password = input.next();
            if(CheckLogin(username, password)) {
            	InvalidCheck = true; 
            }
            else {
            	StartMenu.displayMenu();
            }
		
	}
	
	public void userInput() {
		// TODO Auto-generated method stub
		
	}
}
