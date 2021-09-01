package com.bridgelabz.userreg;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidateEmailTest {
	private String email;
	private boolean expectedResult;
	private UserReg user ;

	
	public ValidateEmailTest(String email, boolean expectedResult) {
		super();
		this.email = email;
		this.expectedResult = expectedResult;
	}
	
	@Before
	public void initialize() {
		user = new UserReg();
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{"abc@gmail.com",true},{"abc@.gmail.com",false},{"abc#12@.gmail.com",false},
			{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});	
	}
	
	@Test
	public void testUserRegistrationTest(){
		Assert.assertEquals(expectedResult,user.email(email));
	}
	
}
