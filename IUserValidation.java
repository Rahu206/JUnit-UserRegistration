package com.lambda.userregistration;

@FunctionalInterface
public interface IUserValidation {
	public Boolean validate(String data) throws UserValidationException;

}
