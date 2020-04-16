package com.gp.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemdaooApplicationTests {
	
	@Autowired
	EmployeeDAO dao;

	@Test
	void testCreate() {
		Employee employee = new Employee();
		/*
		 * employee.setId(123); employee.setName("gp");
		 */
		employee.setId(456);
		employee.setName("pg");
		dao.create(employee);
		
	}

}
