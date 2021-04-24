package com.cg.nsa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalException {
	@ExceptionHandler(ValidationException.class)
	public ResponseEntity<Object> handleException(ValidationException exception){
		return new  ResponseEntity<Object> (exception.getMessages(),HttpStatus.BAD_REQUEST);

	}
	@ExceptionHandler(NotNullException.class)
	public ResponseEntity<Object> handleException(NotNullException exception){
		return new  ResponseEntity<Object> (exception.getMessage(),HttpStatus.BAD_REQUEST);

}
}