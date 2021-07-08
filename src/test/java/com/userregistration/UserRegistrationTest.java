package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration;

	//
	@Before
	public void setUp() {
		userRegistration = new UserRegistration();
	}

	// testCases for first name
	@Test
	public void givenName_WhenFirstNameValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validateFirstName("Minal");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenFirstNameIsLowerCase_ShouldReturnFalse() {

		boolean actual = userRegistration.validateFirstName("minal");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstNameContainsSpecialChar_ShouldReturnFalse() {

		boolean actual = userRegistration.validateFirstName("Minal@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenFirstNameContainsNumbers_ShouldReturnFalse() {

		boolean actual = userRegistration.validateFirstName("Minal123");
		Assert.assertFalse(actual);
	}

	// test-Cases for Last Name
	@Test
	public void givenName_WhenLastNameValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validateLastName("Patil");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenName_WhenLastNameIsLowerCase_ShouldReturnFalse() {

		boolean actual = userRegistration.validateLastName("patil");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastNameContainsSpecialChar_ShouldReturnFalse() {

		boolean actual = userRegistration.validateLastName("Patil@");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenName_WhenLastNameContainsNumbers_ShouldReturnFalse() {

		boolean actual = userRegistration.validateLastName("Patil123");
		Assert.assertFalse(actual);
	}
	// test-cases for Email

	@Test
	public void givenEmail_WhenEmailValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validateEmail("Minal124@gmail.com");
		Assert.assertTrue(actual);

	}

	@Test
	public void givenEmail_WhenEmailNotContainsSpecialChar_ShouldReturnFalse() {

		boolean actual = userRegistration.validateEmail("Minalgmailcom");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenEmail_WhenEmail_should_not_end_with_numbers_ShouldReturnFalse() {

		boolean actual = userRegistration.validateEmail("Minal@gmail.com123");
		Assert.assertFalse(actual);
	}

}
