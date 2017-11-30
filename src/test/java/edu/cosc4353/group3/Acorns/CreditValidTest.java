package edu.cosc4353.group3.Acorns;

import org.junit.Assert;
import org.junit.Test;

public class CreditValidTest {
	@Test 
	public void testSumOdd() {
		long num = 1111;
		int test = CreditCardValidation.sumOfOddPlace(num);
		Assert.assertEquals(2, test);
	}
	@Test 
	public void testSumDbEven() {
		long num = 1111;
		int test = CreditCardValidation.sumOfDoubleEvenPlace(num);
		System.out.println(test);
		Assert.assertEquals(4, test);
	}
	@Test 
	public void testSumOddNull() {
		long num = 0000;
		int test = CreditCardValidation.sumOfOddPlace(num);
		Assert.assertEquals(0, test);
	}
	@Test 
	public void testSumDbEvenNull () {
		long num = 0000;
		int test = CreditCardValidation.sumOfDoubleEvenPlace(num);
		Assert.assertEquals(0, test);
	}
	@Test 
	public void testSumOddOrdered() {
		long num = 123456;
		int test = CreditCardValidation.sumOfOddPlace(num);
		Assert.assertEquals(12, test);
	}
	@Test 
	public void testSumDbEvenOrdered() {
		long num = 123456;
		int test = CreditCardValidation.sumOfDoubleEvenPlace(num);
		Assert.assertEquals(9, test);
	}
	@Test 
	public void testGetSize() {
		long num = 123456;
		int test = CreditCardValidation.getSize(num);
		Assert.assertEquals(6, test);
	}
	@Test 
	public void testGetSizeNull() {
		long num = 0;
		int test = CreditCardValidation.getSize(num);
		Assert.assertEquals(1, test);
	}
	@Test 
	public void testGetNumber0() {
		int num = 0;
		int test = CreditCardValidation.getDigit(num);
		Assert.assertEquals(0, test);
	}
	@Test 
	public void testGetNumberInt() {
		int num = 6;
		int test = CreditCardValidation.getDigit(num);
		Assert.assertEquals(num, test);
	}
	@Test 
	public void testGetNumberLarge() {
		int num = 12;
		int test = CreditCardValidation.getDigit(num);
		Assert.assertEquals(3, test);
	}
}

