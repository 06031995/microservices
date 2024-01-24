package com.userService.exception;

public class UserException extends RuntimeException{
	
	private String measage;

	public UserException(String measage) {
		super(measage);
		
	}
	
	

}
