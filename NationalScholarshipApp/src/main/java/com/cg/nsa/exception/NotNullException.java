package com.cg.nsa.exception;

/**
 * 
 *@author Ankita Jha
 *Version: 1.0
 *Description: This is the implementation class of NotNullException
 *Created date: 22-04-2021
 *
 */
public class NotNullException extends RuntimeException {
	
	/*******************************************
	 * 
	 * Non Parameterized Constructor
	 *
	 *******************************************/
     public NotNullException() {
	  
     }

 	/********************************************
 	 * 
 	 * Parameterized Constructor
 	 * @param messages
 	 *
 	 ********************************************/
     public NotNullException(String message) {
	      super(message);
	 }
}
