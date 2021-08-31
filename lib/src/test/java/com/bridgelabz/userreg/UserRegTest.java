package com.bridgelabz.userreg;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class UserRegTest {

	@Test
	public void firstName_ValidReturnTrue()throws Exception {
		UserReg user = new UserReg();
		boolean res = user.firstName("Raaj");
		Assert.assertEquals(true, res);
	}
	
	@Test
	public void lastName_ValidReturnTrue()throws Exception {
		UserReg user = new UserReg();
		boolean res = user.lastName("Shetye");
		Assert.assertEquals(true, res);
	}
}
