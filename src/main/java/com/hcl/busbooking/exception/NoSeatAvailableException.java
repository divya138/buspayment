package com.hcl.busbooking.exception;

public class NoSeatAvailableException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public NoSeatAvailableException(String message) {
		super(message);
	}
	
	

}
