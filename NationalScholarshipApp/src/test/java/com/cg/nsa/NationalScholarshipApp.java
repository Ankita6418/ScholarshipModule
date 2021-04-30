	package com.cg.nsa;

	import static org.junit.jupiter.api.Assertions.assertThrows;

	import org.junit.jupiter.api.Test;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;

	import com.cg.nsa.entity.Scholarship;
	import com.cg.nsa.exception.UniqueElementException;
	import com.cg.nsa.service.IScholarshipService;
    /*********************************************************
     * 
     * @author Ankita Jha
     * Version 1.0
     * Description:It shows the test cases for the method used
     * Created date:22-04-2021
     * 
     ***********************************************************/
	@SpringBootTest
	public class NationalScholarshipApp {
		@Autowired
		IScholarshipService iScholarshipService;
	
		@Test
		void testScholarship() {
			Scholarship scholarship = new Scholarship (15,"PM scholarship",82,92,950000);
			assertThrows(UniqueElementException.class,()->iScholarshipService.addScholarshipDetails(scholarship));
		}
	
		@Test
		void testScholarship1() {
			Scholarship scholarship1 = new Scholarship(25,"General scholarship",48,98,700000);
 		    assertThrows(UniqueElementException.class,()->iScholarshipService.addScholarshipDetails(scholarship1));
		}
		@Test
		void testScholarship2(){		
			Scholarship scholarship2 = new Scholarship(11,"AJ Scholarship",86,96,850000);
			assertThrows(UniqueElementException.class,()->iScholarshipService.addScholarshipDetails(scholarship2));    
		}
	}
