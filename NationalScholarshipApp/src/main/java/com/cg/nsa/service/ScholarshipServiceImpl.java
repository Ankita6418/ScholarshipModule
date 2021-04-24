package com.cg.nsa.service;

import java.util.List;
import com.cg.nsa.exception.NotNullException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Scholarship;
import com.cg.nsa.exception.InvalidScholarshipException;
import com.cg.nsa.repository.IScholarshipRepository;

@Service

/***
 * 
 * @author Ankita Jha
 * Version:1.0
 * Description: This is the service method implementation of IScholarshipService interface
 * Created date:22-04-2021
 * 
 */

public class ScholarshipServiceImpl implements IScholarshipService {
	
@Autowired
IScholarshipRepository iRepository;
	
/**
 * @return this method returns an scholarship status
 * @param this method takes in scholarship id of type int as a parameter
 * @throws this method throws an InvalidScholarshipException
 * 
 */

	
@Override
	public Scholarship statusUpdate(int ScholarshipId, Scholarship scholarship) {
		Scholarship scholarship1 = iRepository.findById(ScholarshipId).get();
		if(scholarship1==null)
		{
			throw new NotNullException();
		}
		else
		{
			scholarship1.setAppStatus(null);
			return iRepository.save(scholarship1);
		}
		
		
		
	}

/**
 * 
 * @return this method returns a list of all scholarships
 * 
 */

@Override
	public List<Scholarship> getAllScholarships() {
		// TODO Auto-generated method stub
		return iRepository.findAll();
	}

}
