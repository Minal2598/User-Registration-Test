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

	// Test-Cases for PhoneNumber
	@Test
	public void givenPhoneNumber_WhenPhoneNumberValid_ShouldReturnTrue() {

		boolean actual = userRegistration.validatePhoneNumber("91 8953452345");
		Assert.assertTrue(actual);

	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumber_Contain_char_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePhoneNumber("91 895345234a");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumber_Contain_Specialchar_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePhoneNumber("91 895345234%");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumber_Contain_moreThanOnespace_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePhoneNumber("91  8953452345");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumber_Contain_moreThantenNumber_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePhoneNumber("91 895345233221");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenPhoneNumber_WhenPhoneNumber_Contain_LessThantenNumber_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePhoneNumber("91 89534523");
		Assert.assertFalse(actual);
	}

	// Check Password

	@Test
	public void givenpassword_WhenPassword_is_Valid_ShouldReturnTrue() {
		boolean actual = userRegistration.validatePassWord("A123acfgsgdsAvSgg");
		Assert.assertTrue(actual);
	}

	@Test
	public void givenpassword_WhenPassword_does_not_have_number_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePassWord("AbcdefgAFhi");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_does_not_have_capital_char_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePassWord("123bcdefghi");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_does_not_have_lowerase_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePassWord("123AFKITFIKFGP2334");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_does_not_contain_Special_char_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePassWord("123AFKITFassdfr");
		Assert.assertFalse(actual);
	}

	@Test
	public void givenpassword_WhenPassword_does_not_have_space_ShouldReturnFalse() {

		boolean actual = userRegistration.validatePassWord("123b Acdefghi");
		Assert.assertFalse(actual);
	}

}
