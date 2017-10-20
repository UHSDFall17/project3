
package edu.cosc4353.group3.Acorns;

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
}

/*

import java.util.Scanner;


public class Portfolio {
	
	
	
	 public static void main(String[] args){
		 System.out.println("Select an Investment Porfolio Type");
		 System.out.println("1. Health");
		 System.out.println("2. Technology");
		 System.out.println("3. Sports");
		 System.out.println("4. Energy");
		 System.out.println("5. Business");
		 System.out.println("6. Music");
		 System.out.println("7. Art");


		 Scanner inputOptionPortfolio = new Scanner(System.in);
		 int portfolioNumber;
		 portfolioNumber = inputOptionPortfolio.nextInt();
		 
		 switch (portfolioNumber){
		 
		 case 1:
		 System.out.println("Health portfolio added!");
		 break;
		 
		 case 2:
		 System.out.println("Technology portfolio added!");
	     break;
 
		 case 3:
		 System.out.println("Sports portfolio added!");

	     break;
	     
		 case 4:
		 System.out.println("Energy portfolio added!");
	     break;

		 case 5:
			 System.out.println("Business portfolio added!");
		     break;

		 case 6:
			 System.out.println("Music portfolio added!");
		     break;

		 case 7:
			 System.out.println("Art portfolio added!");
		     break;

		 
		 }
		 





	  }
}
*/
