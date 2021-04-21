package com.cg.nsa.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Scholarship;
import com.cg.nsa.repository.IScholarshipRepository;

@Service
public class ScholarshipServiceImpl implements IScholarshipService {
	
	@Autowired
	IScholarshipRepository iRepository;

	
	@Override
	public Scholarship statusUpdate(int ScholarshipId,Scholarship scholarship) {
		Scholarship scholarship1 = iRepository.findById(ScholarshipId).get();
		scholarship1.setAppStatus(scholarship1.getAppStatus());
		return iRepository.save(scholarship);
		
		
	}
	@Override
	public List<Scholarship> getAllScholarships() {
		// TODO Auto-generated method stub
		return iRepository.findAll();
	}

}
