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

/**
 * 
 *@author Ankita Jha
 *Version: 1.0
 *Description: This is the service interface of Scholarship module.
 *Created date: 22-04-2021
 *
 */
@Service
public interface IScholarshipService {

	public Scholarship addScholarshipDetails(Scholarship scholarship);

	public List<Scholarship> getAllScholarships();
}
