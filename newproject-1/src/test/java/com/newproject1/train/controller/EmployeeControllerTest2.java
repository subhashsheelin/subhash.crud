package com.newproject1.train.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.newproject1.train.Entity.Employee;
@SpringBootTest
class EmployeeControllerTest2 {
	
//	@Autowired
//	EmployeeController employeeController;
	
	@Mock
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
    
	@Test
	void testUpdateEmployee() {
		Employee Employeeobj=new Employee();
		Employeeobj.setEmpId("124");
		Employeeobj.setEmpname("sub");
		
		Mockito.when(employeeController.updateEmployee("124", "sub"));
		 System.out.println("updated Employees");
	}
//		
//		String employee=null;
//		try {
//			employee=employeeController.updateEmployee("124", "virat");
//		}
//		catch(Exception e) {
//			System.out.println("not found");
//			
//		}
//	}
	
	
	
	@Test
	void testGetAllemp() throws NotFoundException, com.newproject1.train.serviceimpl.NotFoundException {
		List<Employee> obj=employeeController.getAllemp();
		 System.out.println("GetAllEmployees");
		//	assertThat( obj).isNotEmpty();
	
		Mockito.when(employeeController.getAllemp()).thenReturn(obj);
		
	}

	
	@Test
	void testCreateEmployee() {
		Employee employeeobj=new Employee();
		employeeobj.setEmpId("121");
		employeeobj.setEmpname("virat");
		Mockito.when(employeeController.createEmployee(employeeobj)).thenReturn(employeeobj);
	
	}
	
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

		
	

	@Test
	void testGetEmployee() throws NotFoundException, com.newproject1.train.serviceimpl.NotFoundException {
		
		Employee OBJ=new Employee();
		OBJ=employeeController.getEmployee("125");
		Mockito.when(employeeController.getEmployee("125")).thenReturn(OBJ);
//		Mockito.when(employeeController.getEmployee("123"));
		System.out.println("getEmployee");
	}
//		
//		try {
//			employeeController.getEmployee("125");
//			System.out.println("true");
//		} catch (NotFoundException | com.newproject1.train.serviceimpl.NotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

	@Test
	void testDeleteEmployee() {
		//employeeController.deleteEmployee("124");
		System.out.println("deleted");
		Mockito.when(employeeController.deleteEmployee("124"));
	}


}
	
