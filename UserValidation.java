package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidation {
	
	private final String REGEX_FOR_FIRST_NAME = "^[A-Z]{1}[a-z]{2,}$";
	private final String REGEX_FOR_LAST_NAME  = "^[A-Z]{1}[a-z]{2,}$";
	private final String REGIX_FOR_Email = "^[a-zA-Z0-9+.-]+@[a-zA-Z0-9.]+$";
	private final String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
	
	
	public boolean validateFirstName(String firstname) {
	
 	return Pattern.matches(REGEX_FOR_FIRST_NAME, firstname);
	}
 	
 	public boolean validateLastName(String lastName) {
 	
 	return Pattern.matches(REGEX_FOR_LAST_NAME, lastName);
 	
 	}
 	
 	public boolean validateEmail(String email) {
 		return Pattern.matches(REGIX_FOR_Email, email);
 		
 	}
 	
 	public boolean validateMobileNumber(String mobileNumber) {
 		return Pattern.matches(regex_for_mobileNumber, mobileNumber);
 		
 	}
 	
 	
 	
 	
 	
}