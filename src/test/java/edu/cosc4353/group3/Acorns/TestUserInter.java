package edu.cosc4353.group3.Acorns;

import org.junit.Test;
import org.junit.Assert;

public class TestUserInter {
	@Test
	public void testSelectGet() {
		Assert.assertEquals(0, UserInterface.getSelect());
	}
	@Test
	public void testDifferentSetSelects() {
		int sel = 0;
		sel = 1;
		UserInterface.setSelect(sel);
		Assert.assertEquals(sel, UserInterface.getSelect());
		sel = 9;
		UserInterface.setSelect(sel);
		Assert.assertEquals(sel, UserInterface.getSelect());
		sel = 99999;
		UserInterface.setSelect(sel);
		Assert.assertEquals(sel, UserInterface.getSelect());
		sel = -99999;
		UserInterface.setSelect(sel);
		Assert.assertEquals(sel, UserInterface.getSelect());
	}
}
