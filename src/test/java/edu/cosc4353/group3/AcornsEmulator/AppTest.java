package edu.cosc4353.group3.AcornsEmulator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest
{
    @Test
    public void testAddCustomer() {
    	Customer customer = new Customer("adcdef",123456);
    	assertEquals(123456, customer.getCardNumber());
    }
}
