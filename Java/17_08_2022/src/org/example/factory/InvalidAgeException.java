package org.example.factory;

public class InvalidAgeException extends Exception {
	
	String message;

	public InvalidAgeException(String message) {
		super();
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
	
	
	
}
