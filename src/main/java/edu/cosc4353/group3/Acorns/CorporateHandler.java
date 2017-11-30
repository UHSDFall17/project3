package edu.cosc4353.group3.Acorns;

import java.util.Scanner;

public class CorporateHandler {

	public static void depositFunds(Customer c)
	{
		System.out.println("Input Amount To Deposit:");
	  Scanner UserScan =  new Scanner(System.in);

		double amount = UserScan.nextDouble();

    double amountWithCorp = amount+(amount*.03);
		c.setUser_balance(amountWithCorp);
		
		System.out.println("You deposited: " + amount);

		System.out.println("With your Corporate Account, you deposited " + amountWithCorp);
		System.out.println("Your new Balance: " + c.getUser_balance());
	}
}