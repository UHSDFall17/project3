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
	public static boolean CheckLogin(String user, String pass) { //Check if User login exists and is correct
		double[] InvestStats = new double[1];
		boolean isInvestor = false;
        	
		File file = new File("LoginInfo.txt");
		try {    
			Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
            	String TempScan = sc.nextLine();
                String[] passString = TempScan.split(" ");
                //System.out.println(passString[0] + " " + passString[1]);

                if (user.equals( passString[0]) &&  pass.equals(passString[1])) {
                    System.out.println("Login Success!" + "\n");

                    String cardNo = passString[2];
                    int portId = Integer.parseInt(passString[3]);
                    double accBal = Double.parseDouble(passString[4]);
                    String accountType = passString[5];
                    Customer CurrentCustomer = new Customer(passString[0],passString[1], cardNo, portId, accBal, accountType,isInvestor, InvestStats, InvestStats, -1);
                    
                    InvestmentHandler.CheckAccount(CurrentCustomer);
                    
                    UserInterface.UserInput(CurrentCustomer);
                    
                    return true;
                }
                else if (user.equals(passString[0]) && !pass.equals(passString[1])) {
                    System.out.println("Password Error..." + "\n");
                    return false;
                }
            }
            System.out.println("User Does Not Exist.....");
            return false;
        } catch (IOException e) { 
        	e.printStackTrace();    
        }
        return false;
    }
}
