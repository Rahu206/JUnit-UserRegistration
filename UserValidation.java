package com.lambda.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserValidation {
	IUserValidation regex_for_firstName = (firstName) -> {
		 String regex_for_firstName = "^[A-Z]{1}[a-z]{2,}$";
		
		 try {
             Pattern pattern1 = Pattern.compile(regex_for_firstName); //Compiles Pattern we want to match
             Matcher m = pattern1.matcher(firstName); //matches the compiled patten with the user input
             Boolean matches = m.matches(); //Returns true if the user input matches the pttern
             return matches;
         } catch (Exception e) {
             throw new UserValidationException("First name is not valid", UserValidationException.ExceptionType.NAME_NOT_VALID);
         }
     };
     
     IUserValidation regex_for_lastName = (String lastName) -> {
    	 String regex_for_lastName = "^[A-Z]{1}[a-z]{2,}$";
		
		 try {
             Pattern pattern1 = Pattern.compile(regex_for_lastName); //Compiles Pattern we want to match
             Matcher m = pattern1.matcher(lastName); //matches the compiled patten with the user input
             Boolean matches = m.matches(); //Returns true if the user input matches the pttern
             return matches;
         } catch (Exception e) {
             throw new UserValidationException("Last name is not valid", UserValidationException.ExceptionType.lAST_NAME_NOT_VALID);
         }
     };
     
     IUserValidation regex_for_email = (email) -> {
    	 String regex_for_email = "^[a-zA-Z0-9+.-]+@[a-zA-Z0-9.]+$";
		
		 try {
             Pattern pattern1 = Pattern.compile(regex_for_email); //Compiles Pattern we want to match
             Matcher m = pattern1.matcher(email); //matches the compiled patten with the user input
             Boolean matches = m.matches(); //Returns true if the user input matches the pttern
             return matches;
         } catch (Exception e) {
             throw new UserValidationException("Email is not valid", UserValidationException.ExceptionType.EMAIL_NOT_VALID);
         }
     };
     
     IUserValidation regex_for_mobileNumber = (mobileNumber) -> {
    	 String regex_for_mobileNumber = "^[0-9+ ]{0,3}[0-9]{0,10}";
		
		 try {
             Pattern pattern1 = Pattern.compile(regex_for_mobileNumber); 
             Matcher m = pattern1.matcher(mobileNumber); 
             Boolean matches = m.matches();
             return matches;
         } catch (Exception e) {
             throw new UserValidationException("MobileNumber is not valid", UserValidationException.ExceptionType.NUMBER_NOT_VALID);
         } 
     };
     
     IUserValidation regex_for_password = (password) -> {
    	 String regex_for_password = "(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$";
		
		 try {
             Pattern pattern1 = Pattern.compile(regex_for_password); 
             Matcher m = pattern1.matcher(password); 
             Boolean matches = m.matches();
             return matches;
         } catch (Exception e) {
             throw new UserValidationException("Password is not valid", UserValidationException.ExceptionType.PASSWORD_NOT_VALID);
         } 
     };
	
}