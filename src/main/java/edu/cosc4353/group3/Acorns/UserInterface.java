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
public class UserInterface {
    
    //Displayed After User Completes Login
    private static int Select = 0;

    public static void DisplayMenu(String loginUser)
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
             
        DisplayMenu(c.getUser_Name());

        //FUNCTION TO GET USER INPUT
        int Temp = 9999;
        Scanner UserScan =  new Scanner(System.in);
        Temp = UserScan.nextInt();
        setSelect(Temp);
        
    
    {
        //ACCESS USER SELECTED OPTION
        Customer custom = new Customer();

        switch(getSelect())
        {
            
            case 1: 
            {
            	int PortiId = Portfolio.UserInput(c); //Links to Portfolio Function
            	System.out.println(PortiId);
            	UpdateData( c,  PortiId);
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
    
    public static void UpdateData(Customer c, int poriId)
    {
        try {
            // Open the file that is the first
            // command line parameter
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
            	System.out.println(c);

                if (tokens.length > 0) {
                	System.out.println("check ");

                    // Here tokens[0] will have value of ID
                    if (tokens[0].equals(c.getUser_Name())) 
                    {
                    	System.out.println("Found " + tokens[0]);
                    	String Convert = Integer.toString(poriId);
                        tokens[3] = Convert;
                        
                        String newData = tokens[0] + " " + tokens[1] + " " + 
                        				 tokens[2] + " " + tokens[3] + " " +
                        				 tokens[4];
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
