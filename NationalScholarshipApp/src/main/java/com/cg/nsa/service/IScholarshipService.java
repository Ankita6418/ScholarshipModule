package com.cg.nsa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Scholarship;

@Service
public interface IScholarshipService {

	Scholarship statusUpdate(int scholarshipId,Scholarship scholarship);

	List<Scholarship> getAllScholarships();
}
