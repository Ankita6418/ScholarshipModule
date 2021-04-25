package com.cg.nsa.exception;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 *@author Ankita Jha
 *Version: 1.0
 *Description: This is the implementation class of ValidationException
 *Created date: 22-04-2021
 *
 */

public class ValidationException extends RuntimeException {
	List<String> messages=new ArrayList<String>();

	public ValidationException()
	{
		
	}
	public ValidationException(List<String> messages) 
	{
		super();
		this.messages = messages;

	}

	public List<String> getMessages() 
	{
		return messages;
	}
}

