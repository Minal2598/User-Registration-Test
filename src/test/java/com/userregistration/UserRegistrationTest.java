package com.userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration;

	@Before
	public void setUp() {
		userRegistration = new UserRegistration();
	}

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

}