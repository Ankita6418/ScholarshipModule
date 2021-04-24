package com.cg.nsa.service;

import java.util.List;

/**
 * @author Ankita Jha
 * Version: 1.0
 * Description: This is service of the IScholarshipService interface
 * Created date: 22-04-2021
 * 
 */

import org.springframework.stereotype.Service;

import com.cg.nsa.entity.Scholarship;

@Service
public interface IScholarshipService {

	Scholarship statusUpdate(int scholarshipId,Scholarship scholarship);

	List<Scholarship> getAllScholarships();
}
