package edu.cosc4353.group3.Acorns;

import java.util.Random;

public class Simulate {
	
	public static boolean ping(Customer c)
	{
		if (c.getStatus_Invest() == false)
		{
			System.out.println("Account has not yet Invested");
			return false;
		}
		else{	return true;	}
	}
	
	
	
	public static void Start(Customer c)
	{
		int Counter =0;
		
		
		double[] temp_Bond = c.getInvestData(0);
		double[] temp_Stock = c.getInvestData(1);
		
		System.out.println("Callculating Bonds....");
		while(Counter < c.getInvestArray_Length()){
			int Fluctuation = 0;
			
			Random randomIntegerRange = new Random();
			int MarketSplit = randomIntegerRange.nextInt(4 + 1 - 1) + 1;
			

			
		
			
			
			System.out.println("Choice: " + MarketSplit);
			
		switch(MarketSplit)
		{
			case 1:{	Fluctuation = NumberGenerator.positiveHighInteger();	break;}
			case 2:{	Fluctuation = NumberGenerator.positiveLowInteger();		break;}
			case 3:{	Fluctuation = NumberGenerator.negativeLowInteger();		break;}
			case 4:{	Fluctuation = NumberGenerator.negativeHighInteger();	break;}
		}
		
		System.out.println("Fluct: " + Fluctuation);
		System.out.println("Stock: " + temp_Bond[Counter] + " + " + Fluctuation + " = ");

		
		temp_Bond[Counter] = temp_Bond[Counter] + Fluctuation;
		System.out.println(temp_Bond[Counter]);
		System.out.println(" ");

		Counter++;
		}
		Counter = 0;
		
		
		System.out.println("Callculating Stock....");
		while(Counter < c.getInvestArray_Length()){
			int Fluctuation = 0;
			Random rn = new Random();
			int range = 5 - 1 + 1;
			int MarketSplit =  rn.nextInt(range) + 1;
			
			System.out.println("Choice: " + MarketSplit);
			
		switch(MarketSplit)
		{
			case 1:{	Fluctuation = NumberGenerator.positiveHighInteger();	}
			case 2:{	Fluctuation = NumberGenerator.positiveLowInteger();		}
			case 3:{	Fluctuation = NumberGenerator.negativeLowInteger();		}
			case 4:{	Fluctuation = NumberGenerator.negativeHighInteger();	}
		}
		
		System.out.println("Fluct: " + Fluctuation);
		System.out.println("Stock: " + temp_Stock[Counter] + " + " + Fluctuation + " = ");
		System.out.println(" ");
		
		temp_Stock[Counter] = temp_Stock[Counter] + Fluctuation;
		System.out.println(" ");
		System.out.println(temp_Bond[Counter]);

		Counter++;
		}
		Counter = 0;
		
		
		c.setInvestData(temp_Bond, 0);
		c.setInvestData(temp_Stock, 1);

		InvestmentHandler.SyncExternal(c);
	}
	

}
