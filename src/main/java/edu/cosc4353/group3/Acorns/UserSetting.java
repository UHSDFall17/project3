package edu.cosc4353.group3.Acorns;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserSettings {

	
	public static boolean changeUsername() {
        Scanner UserInput =  new Scanner(System.in);
		System.out.println("Enter your Current Username:");
		String username = UserInput.nextLine();
		System.out.println("Enter your Current Password:");
		String password = UserInput.nextLine();

	
		try {    
			File file = new File("LoginInfo.txt");
			Scanner sc = new Scanner(file);
		    while (sc.hasNextLine()) {
		    	String TempScan = sc.nextLine();
		        String[] passString = TempScan.split(" ");

		        if (username.equals( passString[0]) &&  password.equals(passString[1])) {
		            System.out.println("Enter New Username:");
		    		String newUsername = UserInput.nextLine();
		    		passString[0]=newUsername;
		    		return true;
		    		
		        }else {
		            System.out.println("Password is Incorrect");
		            return false;
	}
}


		}catch(Exception e) {
            System.out.println("Error");
    		return false;

		}
		return false;
	}

public static boolean changePassword() {
    Scanner UserInput =  new Scanner(System.in);
	System.out.println("Enter your Current Username:");
	String username = UserInput.nextLine();
	System.out.println("Enter your Current Password:");
	String password = UserInput.nextLine();


	try {    
		File file = new File("LoginInfo.txt");
		Scanner sc = new Scanner(file);
		FileInputStream fstream = new FileInputStream("LoginInfo.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
	    while (sc.hasNextLine()) {
	    	String TempScan = sc.nextLine();
	        String[] passString = TempScan.split(" ");

	        if (username.equals( passString[0]) &&  password.equals(passString[1])) {
	            System.out.println("Enter New Username:");
	    		String newUsername = UserInput.nextLine();
	    		passString[0]=newUsername;
	    		return true;
	    		
	        }else {
	            System.out.println("Password is Incorrect");
	            return false;
}
}


	}catch(Exception e) {
        System.out.println("Error");
		return false;

	}
	return false;
}
}


        
