
package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class Portfolio {
	private double growth = 0.0;
	private String sect = "";
	
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
	
	public int selectPortfolioType(){
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
		 inputOptionPortfolio.close();		 
	     return 1;
		 case 2:
		 System.out.println("Moderately Conservative portfolio added!");
		 inputOptionPortfolio.close();	 
	     return 2;
		 case 3:
		 System.out.println("Moderate portfolio added!");
		 inputOptionPortfolio.close();	 
         return 3;
		 case 4:
		 System.out.println("Moderately Aggressive portfolio added!");
		 inputOptionPortfolio.close();	 
	     return 4;
		 default:
		 System.out.println("Aggressive portfolio added!");
		 inputOptionPortfolio.close();	 
		 return 5;

		 
		 }
	}
} 


