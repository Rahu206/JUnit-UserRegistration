package com.lambda.userregistration;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class UserValidationTest {

    UserValidation userValidation = new UserValidation();

    
    @Test
    public void validateFirstName() {
        String firstName = "Rahul";
        try {
            Boolean isValid = userValidation.regex_for_firstName.validate(firstName);
            Assertions.assertTrue(isValid,"First Name is valid");
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void given_Invalid_FirstName_Returns_Exception() {
        String firstName = "Rahulgg67";
        try {
        	userValidation.regex_for_firstName.validate(firstName);
        } catch (UserValidationException e) {
            Assertions.assertTrue(UserValidationException.ExceptionType.NAME_NOT_VALID.equals(e.type));
        }
    }
    
    @Test
    public void validateLastName() {
        String lastName = "Deshpande";
        try {
            Boolean isValid = userValidation.regex_for_lastName.validate(lastName);
            Assertions.assertTrue(isValid,"Last Name is valid");
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }

    @Test
    void given_Invalid_LastName_Returns_Exception() {
        String regex_for_lastName = "Deshpande";
        try {
        	userValidation.regex_for_lastName.validate(regex_for_lastName);
        } catch (UserValidationException e) {
            Assertions.assertTrue(UserValidationException.ExceptionType.lAST_NAME_NOT_VALID.equals(e.type));
        }
    }
    @Test
    public void validateEmail() {
        String email = "Deshpande@co.in";
        try {
            Boolean isValid = userValidation.regex_for_email.validate(email);
            Assertions.assertTrue(isValid,"email is valid");
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    
    
    @Test
    public void given_Invalid_Email_Returns_Exception() {
        String email = "abc@abc@gmail.com";
        try {
        	userValidation.regex_for_email.validate(email);
        } catch (UserValidationException e) {
            Assertions.assertTrue(UserValidationException.ExceptionType.EMAIL_NOT_VALID.equals(e.type));
        }
    }
    
    @Test
    public void validateMobileNumber() {
        String mobileNumber = "91 9834211574";
        try {
            Boolean isValid = userValidation.regex_for_mobileNumber.validate(mobileNumber);
            Assertions.assertTrue(isValid,"mobileNumber is valid");
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void given_Invalid_Number_Returns_Exception() {
        String mobileNumber = " 91 9834211574";
        try {
        	userValidation.regex_for_mobileNumber.validate(mobileNumber);
        } catch (UserValidationException e) {
            Assertions.assertTrue(UserValidationException.ExceptionType.NUMBER_NOT_VALID.equals(e.type));
        }
    }
    
    @Test
    public void validatePassword() {
        String password = "RahuD#h@123";
        try {
            Boolean isValid = userValidation.regex_for_password.validate(password);
            Assertions.assertTrue(isValid,"password is valid");
        }
        catch (UserValidationException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void given_Invalid_Password_Returns_Exception() {
        String password = "RahuD#h@123";
        try {
        	userValidation.regex_for_password.validate(password);
        } catch (UserValidationException e) {
        	
            Assertions.assertTrue(UserValidationException.ExceptionType.PASSWORD_NOT_VALID.equals(e.type));
        }
    }
}