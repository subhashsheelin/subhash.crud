package com.newproject1.train.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.newproject1.train.Entity.Employee;



@SpringBootTest
class EmployeeControllerTest {
	
	@Autowired
	EmployeeController employeeController;

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}
	

//	@Test
//	void testCreateEmployee() {
//		Employee Employeeobj=new Employee();
//		Employeeobj.setEmpId("121");
//		Employeeobj.setEmpname("virat");
//		 
//		Employee employeeobj=null;
//		try {
//			employeeobj=employeeController.createEmployee(employeeobj);
//			System.out.println("created");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		
//	}
//
//	@Test
//	void testGetAllemp() throws Exception, com.newproject1.train.serviceimpl.NotFoundException {
//		List<Employee> obj=employeeController.getAllemp();
//		 System.out.println("GetAllEmployees");
//			assertThat( obj).isNotEmpty();
//	}
//
//	@Test
//	void testDeleteEmployee() {
//		employeeController.deleteEmployee("123");
//		System.out.println("deleted");
//		
//	}

}
