package com.cg.nsa.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nsa.entity.Scholarship;
import com.cg.nsa.exception.InvalidScholarshipException;
import com.cg.nsa.exception.NotNullException;
import com.cg.nsa.exception.ValidationException;
import com.cg.nsa.service.IScholarshipService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Scholarship controller")
@RestController
@RequestMapping("/scholarship")

/***
 * 
 * @author Ankita Jha
 * Version 1.0
 * Description this is a controller class
 * created date 22-04-2021
 * 
 */

public class ScholarshipController {
	
	@Autowired
	IScholarshipService service;
	
	@ApiOperation(value="getAllScholarship")
	
	/******************************************************************
	 * 
	 * @param scholarship
	 * @return ResponseEntity 
	 * @return this method returns a list of objects of type scholarship
	 * 
	 ******************************************************************/
	
	@GetMapping("/getAllScholarshipss")
	public List<Scholarship> getAllScholarship()
	{
		return service.getAllScholarships();
	}
	
	/***********************************************************************************
	 * 
	 * @param scholarshipId
	 * @param scholarship
	 * @return this method returns a new ResponseEntity with an appropriate response code
	 * @throws this method throws InvalidScholarshipException
	 * 
	 **********************************************************************************/
	
	@ApiOperation("Update status")
	@PutMapping("/statusUpdate/{scholarshipId}")
	public ResponseEntity<Object> statusUpdate(@PathVariable int scholarshipId, @RequestBody Scholarship scholarship) throws NotNullException 
	{
		try {
			
		      service.statusUpdate(scholarshipId, scholarship);
		      return new ResponseEntity<Object>("Updated successfully", HttpStatus.OK);
	}
		catch(NotNullException exception) {
			throw new NotNullException("Entered scholarship id does not exist");
		}
	}
}

