package edu.cosc4353.group3.Acorns;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Random;


public class InvestmentHandler
{
	
	private static String[] stocks = new String[10];
	private static String[] bonds = new String[10];
	
	private static String[] stockIn = new String[10];
	private static String[] bondIn = new String[10];

	private static int stock_Length, bond_Length;
	
	//Aggressive Portfolio – 90% stocks / 10% bonds
	//Moderately Aggressive Portfolio – 75 / 25
	//Moderate Portfolio – 60 / 40
	//Moderately Conservative – 50 /50
	//Conservative 40 / 60
	
	//stocks - Vanguard S&P 500 Stock ETF, Vanguard Small-Cap Stock ETF,  Vanguard FTSE Emerging Markets Stock ETF, Vanguard Mega Cap Growth Stock ETF
	//bonds - Vanguard Short-Term Bond TFF, iShares Core U.S. Aggregate Bond, SPDR Barclays High Yield Bond ETF, PowerShares Senior Loan ETF 
	}
	public static boolean PortfolioSetup_Check(Customer c) //Check if Portfolio is Setup
	{
		if (c.getUser_PortId() == -1 )
		{
			System.out.println("Hey " + c.getUser_Name() + " ,you have not setup an account Portfolio!");
			System.out.println("Setup can be accessed through the user menu");
			
			return false;
		}
		
		else { 
			System.out.println("Portfolio is Active at: " + c.getUser_PortId());
			return true; }
	}
public static boolean AccountBalance_Check(Customer c) //Check if Balance meets minimal req.
	{
		if (c.getUser_balance() >= 5)
		{
			return true;
		}
		else {System.out.println(c.getUser_Name() + " Please Deposit Additional Funds");
				System.out.println("Account Balance Should Have a Minimum of 5$ to Invest");
				return false;
		}
		
	}
//Aggressive Portfolio – 90% stocks / 10% bonds
	//Moderately Aggressive Portfolio – 75 / 25
	//Moderate Portfolio – 60 / 40
	//Moderately Conservative – 50 /50
	//Conservative 40 / 60
	
	public static void InvestRequest(Customer c)
	{
		double b1 = .6, b2 = .5, b3 = .4, b4 = .25, b5 = .1;
		
		switch (c.getUser_PortId())
		{
		case 1: {	AlocateFunds(c, b1);	break;}
		case 2: {	AlocateFunds(c, b2);	break;}
		case 3: {	AlocateFunds(c, b3);	break;}
		case 4: {	AlocateFunds(c, b4);	break;}
		case 5: {	AlocateFunds(c, b5);	break;}
		}
		
		
	}

//Aggressive Portfolio – 90% stocks / 10% bonds
	//Moderately Aggressive Portfolio – 75 / 25
	//Moderate Portfolio – 60 / 40
	//Moderately Conservative – 50 /50
	//Conservative 40 / 60
	
	public static void AlocateFunds(Customer c, double bond)
	{

		double[] BondDeposits = new double[bond_Length];
		double[] StockDeposits = new double[stock_Length];

		int inDep = 0;

        
        
     System.out.println("Current port: " + c.getUser_PortId());

		
			//Conservative 40 / 60      stock / bond
	
			System.out.println("Conservative Class");

			System.out.println("PROCESS BONDS....");
			double allocateAmount =0;
			double BondAmount = c.getUser_balance() * bond;
			c.setUser_balance(-(BondAmount));
			double carryOver = 0;
			double miniAllocate = BondAmount/(bond_Length-1); 
			while (inDep < bond_Length - 1){   
			double randNumb = randInt(0, 1);
			allocateAmount = randNumb * miniAllocate;
			double tempCarry = miniAllocate - allocateAmount;
			carryOver = carryOver + tempCarry;
			BondDeposits[inDep] = allocateAmount;
			inDep++;
			}
			
			
			BondDeposits[inDep] = carryOver;
			miniAllocate =0;
			inDep = 0;
			System.out.println("PROCESS STOCKS....");
			allocateAmount =0;
			double StockAmount = c.getUser_balance();
			c.setUser_balance(-(StockAmount));
			carryOver = 0;
			miniAllocate = StockAmount/(stock_Length-1); 
			while (inDep < stock_Length - 1){   
			double randNumb = randInt(0, 1);
			allocateAmount = randNumb * miniAllocate;
			double tempCarry = miniAllocate - allocateAmount;
			carryOver = carryOver + tempCarry;
			StockDeposits[inDep] = allocateAmount;
			inDep++;
			}
			StockDeposits[inDep] = carryOver;
			inDep = 0;;
			
			
			decimalConvert(BondDeposits, bondIn, bond_Length);
			decimalConvert(StockDeposits, stockIn, stock_Length);

			testFast(BondDeposits, bond_Length);
			testFast(StockDeposits, stock_Length);
			dataSend(c);	
		}

public static double randInt(double min, double max) {
		
	    Random rand = new Random();
	
	    double randomNum = min + rand.nextDouble();

	    return randomNum;
		
	}

	public static void testFast(double[] arrayIn, int size)
	{
		for (int i = 0; i < size; i++ )
		{
			System.out.println(arrayIn[i]);
		}
	}
	
	public static void decimalConvert(double[] stkAr, String[] alpahArray, int stkSize)
	{
		for (int i = 0; i < stkSize; i++)
		{
			double roundOff = Math.round(stkAr[i] * 100.0) / 100.0;
			
			stkAr[i] = roundOff;
			alpahArray[i] = new Double(roundOff).toString();
		}
	}
}
		
		
		
	
	
	
	


