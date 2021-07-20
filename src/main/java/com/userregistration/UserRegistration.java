package com.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		UserRegistrationInterface obj;
		obj = () -> {
			System.out.println("Welcome to User Registration");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first Name : ");
			String firstName = scanner.next();
			System.out.println(Pattern.matches("^[A-Z]{1}([a-z]{2})+$", firstName));

			System.out.println("Enter last Name : ");
			String lastName = scanner.next();
			System.out.println(Pattern.matches("^[A-Z]{1}([a-z]{2})+$", lastName));

			System.out.println("Enter email : ");
			String email = scanner.next();
			System.out.println(Pattern.matches("^[a-zA-z0-9.+_-]{2,}@[a-zA-z0-9]{1,}[.]{1}[a-z]{2,}$", email));

			System.out.println("Enter phone number: ");
			String phoneNum = scanner.next();
			System.out.println(Pattern.matches("^[0-9]{0,2}\\s{0,1}[0-9]{10}$", phoneNum));

			System.out.println("Enter password : ");
			String password = scanner.next();
			System.out.println(Pattern.matches(
					"^(?=.*[A-Z])(?=.*[a-z])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[0-9]).{8,}$", password));

		};
		obj.userValidate();
	}

}