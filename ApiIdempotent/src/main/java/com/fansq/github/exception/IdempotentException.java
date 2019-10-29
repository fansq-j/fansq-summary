package com.fansq.github.exception;

public class IdempotentException extends RuntimeException {
	public IdempotentException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
}
