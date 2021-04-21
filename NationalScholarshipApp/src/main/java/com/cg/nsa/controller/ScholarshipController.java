package com.cg.nsa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.nsa.entity.Scholarship;
import com.cg.nsa.service.IScholarshipService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api("Scholarship controller")
@RestController
@RequestMapping("/scholarship")
public class ScholarshipController {
	
	@Autowired
	IScholarshipService service;
	
	@ApiOperation(value="getAllScholarship")
	@GetMapping("/getAllScholarshipss")
	public List<Scholarship> getAllScholarship()
	{
		return service.getAllScholarships();
	}
	
	
	@PutMapping("/statusUpdate/{scholarshipId}")
	public ResponseEntity<Object> statusUpdate(@PathVariable int scholarshipId, @RequestBody Scholarship scholarship)
	{
		service.statusUpdate(scholarshipId, scholarship);
		return new ResponseEntity<Object>("Updated successfully", HttpStatus.OK);
	}
}
