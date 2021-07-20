package com.userregistration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailTest {

	String email;
	boolean expectedOutput;

	public EmailTest(String email, boolean expectedOutput) {
		this.email = email;
		this.expectedOutput = expectedOutput;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> emailIdsWithExpectedOutput() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@gamil.com", true }, { "abc-100@abc.net", true },
				{ "abc@1.com", true }, { "abc@gmail.com.com", true }, { "abc+100@gmail.com", true }, { "abc", false },
				{ "abc123@gmail.a", false }, { "abc@.com.my", false }, { "abc123@.com", false },
				{ "abc123@com.com", false }, { ".abc@abc.com", false }, { "abc()*@gmail.com", false },
				{ "abc@%*.com", false }, { "abc..2002@gmail.com", false }, { "abc.@gmail.com", false },
				{ "abc@abc@gmail,com", false }, { "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } });
	}

	@Test
	public void givenEmail_WithExpectedOutput_ShouldReturnExpectedResult() {
		UserRegistration userRegistration = new UserRegistration();
		boolean actualResult = userRegistration.validateEmail(email);
		Assert.assertEquals(this.expectedOutput, actualResult);
	}
}