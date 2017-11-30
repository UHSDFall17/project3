package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class Portfolio {
	
	private double growth = 0.0;
	private String sect = "";
    private static int Select = 0;

	 public static void PortFolioInterface(Customer account) {
	        //STARTUP MENU OPTIONS
	        System.out.println("     Portfolios' !"     );
	        System.out.println("");
	        System.out.println("===================");
	        System.out.println("    1: Setup Portfolio          ");
	        System.out.println("    2: Check available industries    ");
	        System.out.println("    3: Back       ");
	        System.out.println("===================");
	    }
	 
	 public static int UserInput(Customer account) {
	        //FUNCTION TO GET USER INPUT
		 
		 	PortFolioInterface(account);
	        int Temp = 9999;
	        Scanner UserScan =  new Scanner(System.in);
	        Temp = UserScan.nextInt();
	        setSelect(Temp);
	        //FUNTION TO ACCESS USER SELECTED OPTION
	        switch(getSelect()) {
	        	case 1: {
	            	int userPortiId = selectPortfolioType();
	            	System.out.println("Updating Profile....");
	            	return userPortiId;
	            }
	            case 2: { 
	            	
	                UserInput(account);
	            }
	            case 3: {
                    UserInterface.UserInput(account);
	            }
	            default: {
	            	UserInput(account);
	            }
	        }
	        return -1;
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

	public Portfolio(double growthRate, String sector) {
		growth = growthRate;
		sect = sector;
	}
	public String returnPortfolioSector() {
		return sect;
	}
	public double returnPortfolioGrowth() {
		return growth;
	}
	
	public static int selectPortfolioType() {
		 System.out.println("Select an Investment Porfolio Type");
		 System.out.println("1. Conservative");
		 System.out.println("2.Moderately Conservative");
		 System.out.println("3. Moderate");
		 System.out.println("4. Moderately Aggressive");
		 System.out.println("5. Aggressive");

		 Scanner inputOptionPortfolio = new Scanner(System.in);
		 int portfolioNumber;
		 portfolioNumber = inputOptionPortfolio.nextInt();
		 
		 switch (portfolioNumber){
		 
		 case 1:
		 System.out.println("Conservative portfolio added!");
		 //inputOptionPortfolio.close();		 
	     return 1;
		 case 2:
		 System.out.println("Moderately Conservative portfolio added!");
		 //inputOptionPortfolio.close();	 
	     return 2;
		 case 3:
		 System.out.println("Moderate portfolio added!");
		 //inputOptionPortfolio.close();	 
         return 3;
		 case 4:
		 System.out.println("Moderately Aggressive portfolio added!");
		 //inputOptionPortfolio.close();	 
	     return 4;
		 case 5:
		 System.out.println("Aggressive portfolio added!");
		 //inputOptionPortfolio.close();	 
		 return 5;
		 default:
	     System.out.println("Your Selection was not valid");
	     //inputOptionPortfolio.close();	 
	     return -1;
		 }
	}
} 
