package com.example.Hibernate.exception;

public class StudentNotFound extends RuntimeException {

	public StudentNotFound(String message) {
		super(message);
	}

}
