package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class StartMenu extends Menu{
    private static int Select = 0;
    
    public static void displayMenu() {
        //STARTUP MENU OPTIONS
        System.out.println("");
        System.out.println("===================");
        System.out.println("    1: Login          ");
        System.out.println("    2: Sign Up ");
        System.out.println("    3: Exit ");
        System.out.println("===================");
        UserInput();
    }
    
    public static void UserInput() {
        //FUNCTION TO GET USER INPUT
        int Temp = 	9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();

        setSelect(Temp);
        
        switch(getSelect()) {
            case 1: {
                LoginMenu.displayMenu();
                break;
            }
            case 2: 
            {     

            	int choiceOfAccount;
                Scanner input = new Scanner(System.in);
            	System.out.println("Would you like to create a personal account or a corporate account? ");
            	System.out.println("1. Personal ");
            	System.out.println("2. Corporate ");
                choiceOfAccount = input.nextInt();
            	String accountChoice; 

            	switch(choiceOfAccount) {
            	case 2:
            		 accountChoice= "corporate";
            		 boolean accountCheckCorporate = false;   
            		 accountCheckCorporate = Customer.CreateAccountPersonal(accountChoice);
                     System.out.println("\n" + "Corporate Account Created! Please Login.");
                     displayMenu();
                     break;
            	default:
           		     accountChoice= "personal";
           		     boolean accountCheckPersonal = false;   
            		 accountCheckPersonal = Customer.CreateAccountCorporate(accountChoice);
                     System.out.println("\n" + "Personal Account Created! Please Login.");
                     displayMenu();
                     break;
            	}
            }
            case 3: {
                TheExit();
            }
        }
        UserScan.close();
    }
    
    public static int getSelect() {
        return Select;
    }
    
    public static void setSelect(int newNumb) {
        Select = newNumb;
    }
    
    public static void ResetSelect() {
        setSelect(0);
    }
    
    public static void TheExit() {
        System.exit(0);
    }
}