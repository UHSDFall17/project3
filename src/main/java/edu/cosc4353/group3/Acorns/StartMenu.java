package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class StartMenu {
    private static int Select = 0;
    
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
        
        UserInput();

    }
    public static void UserInput()
    {
        //FUNCTION TO GET USER INPUT
        int Temp = 9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();
        setSelect(Temp);
        
    
    {
        //FUNTION TO ACCESS USER SELECTED OPTION
        switch(getSelect())
        {
            
            case 1: 
            {
                Customer.Login();
                break;
            }
            case 2: 
            {     
                boolean accountCheck = false;   
                accountCheck = Customer.CreateAccount();
                System.out.println("\n" + "Account Created! Please Login.");
                DisplayMenu();
                break;
            }
            case 3: 
            {
                TheExit();
            }
        }
    }
    
    }
    
    public static int getSelect()
    {
        return Select;
    }
    
    public static void setSelect(int newNumb)
    {
        Select = newNumb;
    }
    
    public static void ResetSelect()
    {
        setSelect(0);
    }
    
    public static void main(String[] args) {
        
        DisplayMenu();
    }
    
    public static void TheExit()
    {
        System.exit(0);
    }
    //lol
    //lol
}
