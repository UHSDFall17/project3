/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cosc4353.group3.Acorns;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.omg.CORBA.Environment;


/**
 *
 * @author Detrich
 */
public class UserInterface {   //MENU 1
    
    //Displayed After User Completes Login
    private static int Select = 0;

    public static void DisplayMenu(String loginUser)
    {
        
        System.out.println("     Hello " + loginUser + " !"     );
        System.out.println("");
        System.out.println("===================");
        System.out.println("    1: Porfolios          ");
        
        System.out.println("    2: Account Settings    "); //Dosent really matter
        System.out.println("    3: Account Summary    ");     //Dosent really matter
        System.out.println("    4: Make A Purchase       ");
        System.out.println("    5: Make A Deposit       ");

        System.out.println("    6: Logout       ");
        System.out.println("===================");
        
        

    }
    public static void AcctSetMenu(Customer c)  //MENU 2
    {
        
        System.out.println("     Account Settings"     );
        System.out.println("");
        System.out.println("-------------------------");
        System.out.println("    1: Update Credit/Debit Card          ");
        
        System.out.println("    2:      "); //Dosent really matter
        System.out.println("    3:      ");     //Dosent really matter
        System.out.println("    4: Back to Main Menu       ");
        System.out.println("-------------------------");
        int Temp = 9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();
        setSelect(Temp);
        
    
    
        //ACCESS USER SELECTED OPTION
        Customer custom = new Customer();

        switch(getSelect())
        {
            
            case 1: 
            {
            	String cardNo = CreditCardValidation.CardWizard(c);
            	System.out.println("Updating Card No. To: " + cardNo);
            	
            	UpdateData( c, -1, cardNo, 2);
            	System.out.println("Account Updated!");

            	UserInput(c);
                break;
            }
            case 2: 
            {     

                break;
            }
            case 3: 
            {
            
            	UserInput(c);
            }
        }
        

    }
        
        
        
    public static void UserInput(Customer c) //need to get user account MENU 1
    {
             //System.out.println("In User Interface....");
             //System.out.println("Customer: " + c.getUser_Name());
             //System.out.println("Customer: " + c.getUser_Pass());
             //System.out.println("Customer: " + c.getUser_CardNumb());
             
        DisplayMenu(c.getUser_Name());

        //FUNCTION TO GET USER INPUT
        int Temp = 9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();
        setSelect(Temp);
        
    
    
        //ACCESS USER SELECTED OPTION
        Customer custom = new Customer();

        switch(getSelect())
        {
            
            case 1: 
            {
            	int PortiId = Portfolio.UserInput(c); //Links to Portfolio Function
            	System.out.println(PortiId);
            	UpdateData( c,  PortiId, "", 1);
            	System.out.println("Portfolio Updated!");
            	UserInput(c);
                break;
            }
            case 2: 
            {     
            	AcctSetMenu(c);
                break;
            }
            case 3: 
            {
                System.out.println( "Hello " + c.getUser_Name()+"! Here is your Account Summary:");
                System.out.println("");
                System.out.println("-------------------------");
                System.out.println("Account Balance: " + c.getUser_balance());
                System.out.println("Account Type: "+c.getUser_AccountType() );
                switch(c.getUser_PortId()) {
                case 1:
                    System.out.println("Account Portfolio: Conservative");
                    break;
                case 2:
                    System.out.println("Account Portfolio: Moderately Conservative");
                    break;
                case 3:
                    System.out.println("Account Portfolio: Moderate");
                    break;
                case 4:
                    System.out.println("Account Portfolio: Moderately Aggressive");
                    break;
                default:        
                    System.out.println("Account Portfolio: Aggressive");
                    break;
   	
                	}
                System.out.println("Credit Card Information: " + c.getUser_CardNumb());
                UserInput(c);
                
            }
            case 4:
            { 
            	//Purchase and add change
            	FundsHandler.makePurchase(c);
            	UpdateData( c,  -1, "", 3);
            	UserInput(c);

            }
            case 5:
            {
            	switch(c.getUser_AccountType()) {
            	case "corporate":
            		CorporateHandler.depositFunds(c);
            		UpdateData( c,  -1, "", 3);
                	UserInput(c);	
            	default:
            		FundsHandler.depositFunds(c);
                	UpdateData( c,  -1, "", 3);
                	UserInput(c);
            	}
            }
            
            case 6:
            {
            	StartMenu.DisplayMenu();
            	
            }
            
            
        }
        
        //UserScan.close();
    
    
    }
    
    public static void portfoliFind(Customer c)
    {
    	//switch ()
    	
    	
    	
    	
    	
    	
    }
    public static void UpdateData(Customer c, int poriId, String cardId, int UpdateType)
    {
        try {
            // Open the file that is the first
            // command line parameter
        	int updateType = UpdateType;
            FileInputStream fstream = new FileInputStream("LoginInfo.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            StringBuilder fileContent = new StringBuilder();
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                System.out.println(strLine);
                
                String tokens[] = strLine.split(" ");
            	System.out.println(tokens[0]);
            	System.out.println("Current balance -> " + c.getUser_balance());

                if (tokens.length > 0) {
                	System.out.println("check ");

                    // Here tokens[0] will have value of ID
                    if (tokens[0].equals(c.getUser_Name())) 
                    {
                    	System.out.println("Found " + tokens[0]);
                    	
                    	if (updateType == 1){  //PORTFOLIO UPDATE
                    	String Convert = Integer.toString(poriId);
                        tokens[3] = Convert;
                    	}
                    	if (updateType == 2){ //CARD UPDATE
                        tokens[2] = cardId;
                    	}
                    	if (updateType == 3){ //Balance UPDATE
                    		String Convert = Double.toString(c.getUser_balance());
                    		tokens[4] = Convert;
                        	}
                        
                        String newData = tokens[0] + " " + tokens[1] + " " + 
                        				 tokens[2] + " " + tokens[3] + " " +
                        				 tokens[4] + " " + tokens[5] + " ";
                        fileContent.append(newData + System.getProperty("line.separator"));
                    } 
                    
                    else 
                    {
                        // update content as it is
                    	
                        fileContent.append(strLine + System.getProperty("line.separator"));
                        //fileContent.Append(Environment.NewLine);
                        //fileContent.append("\n");
                    }
                }
            }
            
            System.out.println(fileContent);
            // Now fileContent will have updated content , which you can override into file
            FileWriter fstreamWrite = new FileWriter("LoginInfo.txt");
            BufferedWriter out = new BufferedWriter(fstreamWrite);
            out.write(fileContent.toString());
            out.close();
            //Close the input stream
            //in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
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
