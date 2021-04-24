package com.cg.nsa.service;

import java.util.List;

import com.cg.nsa.entity.Institution;
import com.cg.nsa.exception.InvalidScholarshipException;

public interface IInstituteService {

	Institution addInstitute(Institution institute);
	
	Institution editInstitute(Institution institute);
	
	Institution statusUpdate(Institution institute);
	
	Institution getInstitute(int code) throws InvalidScholarshipException;
	
	List<Institution> getAllInstitutes();
	
	List<Institution> getInstitutesByState(String state);
}
