package com.cg.nsa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.nsa.service.IScholarshipService;

public class NationalScholarshipApp {
	@SpringBootTest
	class NationalScholarshipAppApplicationTests {

		@Autowired
		
		IScholarshipService service;
		
//		@Test
//		void testInstitution() {
//			Officer officer = new Officer("141","deepu","officer","Deepali verma","Goa");
//		 		
//			assertEquals(officer,service.addOfficer(officer));
//			
//		}
		
//		@Test
//		void testInstitution1() {
//			Officer officer = new Officer("","","","","");
//		 		
//			assertThrows(ValidationException.class,()->service.addOfficer(officer));
//			
//		}

	}
}


