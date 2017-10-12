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
