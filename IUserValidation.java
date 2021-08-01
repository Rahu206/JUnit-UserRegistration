package com.lambda.userregistration;

import com.lambda.UserRegistrationException;


@FunctionalInterface
public interface IUserValidation {
	public Boolean validate(String data) throws UserValidationException;

}
