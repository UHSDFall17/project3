/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cosc4353.group3.Acorns;
import java.util.Scanner;


/**
 *
 * @author Detrich
 */
public class UserInterface {
    
    //Displayed After User Completes Login
    private static int Select = 0;

        public static void UserInterface(String loginUser)
    {
        
        System.out.println("     Hello " + loginUser + " !"     );
        System.out.println("");
        System.out.println("===================");
        System.out.println("    1: Porfolios          ");
        
        System.out.println("    2: Account Settings    "); //Dosent really matter
        System.out.println("    3: Account Info    ");     //Dosent really matter
        System.out.println("    4: Logout       ");
        System.out.println("===================");
        
        

    }
        
        
        
    public static void UserInput(Customer c) //need to get user account
    {
             System.out.println("In User Interface....");
             //System.out.println("Customer: " + c.getUser_Name());
             //System.out.println("Customer: " + c.getUser_Pass());
             //System.out.println("Customer: " + c.getUser_CardNumb());
             
        UserInterface(c.getUser_Name());

        //FUNCTION TO GET USER INPUT
        int Temp = 9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();
        setSelect(Temp);
        
    
    {
        //ACCESS USER SELECTED OPTION
        Customer custom = new Customer();
        //Portfolio port = new Portfolio();

        switch(getSelect())
        {
            
            case 1: 
            {
                //port.PortFolioInterface(custom); //Links to Portfolio Function
                break;
            }
            case 2: 
            {     

                break;
            }
            case 3: 
            {
            
                TheExit();
            }
        }
    }
    
    }
    
    public static void TheExit()
    {
        System.exit(0);
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
    

    

    
}
