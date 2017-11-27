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
}
