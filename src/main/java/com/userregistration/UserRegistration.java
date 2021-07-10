package com.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	private static final String NAME_PATTERN = "^[A-Z]{1}([a-z]{2})+$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z]+([.+-_][a-zA-Z0-9]+)*@[a-zA-Z]+[.]+[a-zA-Z]{2,3}+([a-zA-Z]+)*$";
	private static final String PHONE_PATTERN = "^[0-9]{0,2}\\s{0,1}[0-9]{10}$";
	private static final String PASSWORD_PATTERN = "^[A-Z]{1}+[a-zA-Z]{7,}$";

	// Check valid First Name
	public boolean validateFirstName(String firstName) {

		return patternChecker(firstName, NAME_PATTERN);
	}

	// Check valid Last Name
	public boolean validateLastName(String lastName) {

		return patternChecker(lastName, NAME_PATTERN);
	}

	// Check valid Email
	public boolean validateEmail(String email) {
		return patternChecker(email, EMAIL_PATTERN);

	}

	// Check valid PhoneNumber
	public boolean validatePhoneNumber(String phoneNumber) {
		return patternChecker(phoneNumber, PHONE_PATTERN);

	}

	// Check valid Password
	public boolean validatePassWord(String passWord) {
		return patternChecker(passWord, PASSWORD_PATTERN);

	}

	private boolean patternChecker(String input, String fieldPattern) {
		Pattern pattern = Pattern.compile(fieldPattern);
		Matcher matcher = pattern.matcher(input);
		boolean result = matcher.matches();

		return result;
	}
}