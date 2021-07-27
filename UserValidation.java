package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidation {

	private final String regex_for_firstName = "^[A-Z]{1}[a-z]{2,}$";
	private final String regex_for_lastName = "^[A-Z]{1}[a-z]{2,}$";
	private final String regex_for_email = "^[a-zA-Z0-9+.-]+@[a-zA-Z0-9.]+$";
	private final String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";

	public boolean validateFirstName(String firstname) {

		return Pattern.matches(regex_for_firstName, firstname);
	}

	public boolean validateLastName(String lastName) {

		return Pattern.matches(regex_for_lastName, lastName);

	}

	public boolean validateEmail(String email) {
		return Pattern.matches(regex_for_email, email);

	}

	public boolean validateMobileNumber(String mobileNumber) {
		return Pattern.matches(regex_for_mobileNumber, mobileNumber);

	}

}