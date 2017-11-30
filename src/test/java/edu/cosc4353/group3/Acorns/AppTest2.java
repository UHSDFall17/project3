package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class AppTest2
{
	
	@Test
	public void AccountTypetest()
	{
		
			String user = "Smeet";
			String password = "111111";
			String cardNo = "4929933965135652";
			int portIden = 1;
			double balance = 100;
			String accountType = "corporate";
			boolean isInvest = true;
			double[] stock = new double[10];
			double[] bond = new double[10];
			int investLength = 4;
		
		Customer customer = new Customer(user, password, cardNo, portIden, balance, accountType
						,isInvest, stock, bond, investLength);
		
		Assert.assertEquals(accountType, customer.getUser_AccountType());
		
	}
	
	@Test
	public void Passwordtest()
	{
		
			String user = "Smeet";
			String password = "111111";
			String cardNo = "4929933965135652";
			int portIden = 1;
			double balance = 100;
			String accountType = "corporate";
			boolean isInvest = true;
			double[] stock = new double[10];
			double[] bond = new double[10];
			int investLength = 4;
		
		Customer customer = new Customer(user, password, cardNo, portIden, balance, accountType
						,isInvest, stock, bond, investLength);

		Assert.assertEquals(password, customer.getUser_Pass());
						
	}
}
