package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserRegistrationTestFile {

	private UserValidation userValidation;

	@Before
	public void setup() {
		userValidation = new UserValidation();
	}

	@Test
	public void testFirstName() {
		assertEquals(true, userValidation.validateFirstName("Rahul"));
	}

	@Test(expected = NullPointerException.class)
	public void testFirstNameNegativeScenerio() {
		assertEquals(true, userValidation.validateFirstName(null));
	}

	@Test
	public void testLastName() {
		assertEquals(true, userValidation.validateLastName("Deshpande"));
	}

	@Test(expected = NullPointerException.class)
	public void testLastNameNameNegativeScenerio() {
		assertEquals(true, userValidation.validateLastName(null));
	}

	@Test
	public void testEmail() {
		assertEquals(true, userValidation.validateEmail("abc@yahoo.com"));
		assertEquals(true, userValidation.validateEmail("abc-100@yahoo.com"));
		assertEquals(true, userValidation.validateEmail("abc.100@yahoo.com"));
		assertEquals(true, userValidation.validateEmail("abc111@abc.com"));
		assertEquals(true, userValidation.validateEmail("abc-100@abc.net"));
		assertEquals(true, userValidation.validateEmail("abc.100@abc.com.au"));
		assertEquals(true, userValidation.validateEmail("abc@1.com"));
		assertEquals(true, userValidation.validateEmail("abc@gmail.com.com"));
		assertEquals(true, userValidation.validateEmail("abc+100@gmail.com"));
		assertEquals(false, userValidation.validateEmail("abc"));
		assertEquals(false, userValidation.validateEmail("abc@.com.my"));
		assertEquals(false, userValidation.validateEmail("abc123@gmail.a"));
		assertEquals(false, userValidation.validateEmail("abc123@.com"));
		assertEquals(false, userValidation.validateEmail("abc123@.com.com"));
		assertEquals(false, userValidation.validateEmail(".abc@abc.com"));
		assertEquals(false, userValidation.validateEmail("abc()*@gmail.com"));
		assertEquals(false, userValidation.validateEmail("abc@%*.com"));
		assertEquals(false, userValidation.validateEmail("abc..2002@gmail.com"));
		assertEquals(false, userValidation.validateEmail("abc.@gmail.com"));
		assertEquals(false, userValidation.validateEmail("abc@abc@gmail.com"));
		assertEquals(false, userValidation.validateEmail("abc@gmail.com.1a"));
		assertEquals(false, userValidation.validateEmail("abc@gmail.com.aa.au"));
	}

	@Test(expected = NullPointerException.class)
	public void testEmailNegativeScenerio() {
		assertEquals(true, userValidation.validateEmail(null));
	}

	@Test
	public void testMobileNumber() {
		assertEquals(true, userValidation.validateMobileNumber("91 9919819801"));
	}

	@Test(expected = NullPointerException.class)
	public void testMobileNumberNegativeScenerio() {
		assertEquals(true, userValidation.validateMobileNumber(null));
	}

	@Test
	public void testPassword() {
		assertEquals(true, userValidation.validatePassword("M#85Rgt5"));
	}

	@Test(expected = NullPointerException.class)
	public void testPasswordNegativeScenerio() {
		assertEquals(true, userValidation.validatePassword(null));
	}

}
