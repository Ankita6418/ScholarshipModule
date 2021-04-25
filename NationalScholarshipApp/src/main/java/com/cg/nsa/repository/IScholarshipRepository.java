package com.cg.nsa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.nsa.entity.Scholarship;
/**
 * 
 *@author Ankita Jha
 *Version: 1.0
 *Description: This is the Repository interface of Scholarship module.
 * Created date: 22-04-2021
 * 
 */
@Repository
public interface IScholarshipRepository extends JpaRepository<Scholarship, Integer>
{

	//Scholarship statusUpdate(Scholarship scholarship);

	//List<Scholarship> fetchAllScholarships();
	
	Scholarship findByScholarshipId(int scholarshipId);
}
 