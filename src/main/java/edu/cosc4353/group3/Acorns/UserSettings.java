package edu.cosc4353.group3.Acorns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserSettings {

	
	private static final int PASS_LENGTH =6;

	public static boolean changePassword(Customer c) {
        Scanner UserInput =  new Scanner(System.in);
		System.out.println("Enter your Current Username:");
		String username = UserInput.nextLine();
		System.out.println("Enter your Current Password:");
		String password = UserInput.nextLine();
		boolean CreateError = true;
		while(CreateError) {
			if(username.equals(c.getUser_Name())&&password.equals(c.getUser_Pass())){
				CreateError= false;
				
			}else {
				System.out.println("Incorrect Username or Password");
				changePassword(c);
			}
		}
		
			CreateError = true;
	        while (CreateError) {
	        	System.out.println("Enter A " + PASS_LENGTH + " Character password: ");
	        	String newPassword = UserInput.next();
	                
	        	if (newPassword.length()!= PASS_LENGTH){ 
	        		CreateError = true; 
	        			System.out.println("Password Length Error, Try Again!" + "\n");
	        			
	        	}
	            else {  
	            	c.setPassword(newPassword);
	    			UserInterface.UpdateData(c, 0, newPassword, 4);
	    			return true;
	            }
	        }
			System.out.println("Password Length Error, Try Again!" + "\n");

			return true;
		
		
	
	

}

}
