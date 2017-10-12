package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class StartMenu {
    
    public static void DisplayMenu()
    {
        //STARTUP MENU OPTIONS
        System.out.println("     Welcome!      ");
        System.out.println("");
        System.out.println("===================");
        System.out.println("    1: Login          ");
        System.out.println("    2: Sign Up ");
        System.out.println("    3: Exit ");
        System.out.println("===================");
        
    }
    public static void UserInput()
    {
        int temp = 0;
		while(temp !=3)
        {
			DisplayMenu();
			System.out.println("exited at display menu");
            Scanner userScan = new Scanner(System.in);
            System.out.println("exited at scanner error");
            temp = 0;
            System.out.println("system accept 0");
            temp = userScan.nextInt();
            System.out.println("exited at scanner input error");
            
            if(temp == 1) {
            	DisplayLogin();
            	System.out.println("display login exited");
            	}
            else if(temp == 2) {
            	createUser();
            }
            else if(temp == 3) {
        		break;
        	}
            else {
            	System.out.println("Input not valid!");
            }

            userScan.close();
        }
    	System.out.println("Exit success");
        System.exit(0);
    }
    
    public static void DisplayLogin(){
		String usernameInput;
		String passwordInput;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Usermame: " );
		usernameInput = input.nextLine();
	    System.out.println("Enter Password: " );
	    passwordInput = input.nextLine();
	    input.close();
    	System.out.println(usernameInput + " " + passwordInput);
	}
    public static Customer createUser() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter User: ");
		String username = input.nextLine();
		
		System.out.println("Enter Password: ");
		String password = input.nextLine();
		
		System.out.println("Enter Credit Card Number");
		int cardNumber = input.nextInt();
		
		Customer customer = new Customer(username, password, cardNumber);
		input.close();
		return customer;
	}
}
