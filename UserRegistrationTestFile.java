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
		assertEquals(true,userValidation.validateFirstName("Rahul") );
		
	}
	
	@Test(expected = NullPointerException.class)
	public void testFirstNameNegativeScenerio() {
		assertEquals(true,userValidation.validateFirstName(null));
	}
	
	


}
