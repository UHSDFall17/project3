package edu.cosc4353.group3.Acorns;
import org.junit.Assert;
import org.junit.Test;

public class AppTest1
{
	@Test
	public void testCardNumb()
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
	
	Assert.assertEquals(cardNo, customer.getUser_CardNumb());
					
	}
	
	public static void main(String[] args)
	{
    	
        // TODO code application logic here
              StartMenu start = new StartMenu();

              start.DisplayMenu();
    }
}
