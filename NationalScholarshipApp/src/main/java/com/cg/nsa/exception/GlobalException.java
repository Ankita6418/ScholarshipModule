	package com.cg.nsa.exception;

	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.ExceptionHandler;
	import org.springframework.web.bind.annotation.RestControllerAdvice;
	/**
	 * 
	 *@author Ankita Jha
	 *Version: 1.0
	 *Description: This is the implementation class of GlobalException.
	 *Created date: 22-04-2021
	 *
	 */
	@RestControllerAdvice
	public class GlobalException 
	{
		/***************************************
		 * 
		 *@param exception
		 *@return - error messages
		 * 
		 ***************************************/
		
		@ExceptionHandler(ValidationException.class)
		public ResponseEntity<Object> handleException(ValidationException exception){
			return new  ResponseEntity<Object> (exception.getMessages(),HttpStatus.BAD_REQUEST);
		}
		/*************************************************************************************
		 * 
		 * @param exception
		 * @return this method returns a new ResponseEntity with an appropriate response code.
		 * 
		 *************************************************************************************/
		
		@ExceptionHandler(UniqueElementException.class)
		public ResponseEntity<Object> handleException(UniqueElementException exception){
			return new  ResponseEntity<Object> (exception.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}