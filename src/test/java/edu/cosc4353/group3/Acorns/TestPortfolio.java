package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class TestPortfolio {
	@Test
	public void testPortfolioCreation() {
		double growth = .15;
		String sector = "test";
		Portfolio test = new Portfolio(growth, sector);
		Assert.assertEquals(growth, test.returnPortfolioGrowth(), .001);
		Assert.assertEquals(sector, test.returnPortfolioSector());
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
