package com.newproject1.train.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newproject1.train.Entity.Employee;
import com.newproject1.train.service.Employeeservic;




@RequestMapping("/Employee")
@RestController
public class EmployeeController {
	
	
	@Autowired
	private Employeeservic employeeservice;
	

	@PostMapping("/createEmp")
	 Employee createEmployee(@RequestBody Employee employee) {
		//employeeservice.createEmployee(employee);
		return   employeeservice.createEmployee(employee);
	}
   
	
	@GetMapping("/getAllEmp")
	List<Employee> getAllemp() throws NotFoundException, com.newproject1.train.serviceimpl.NotFoundException{
		return employeeservice.getAllEmployee();
	}
	@GetMapping("/getEmp/{Id}")
	Employee getEmployee(@PathVariable String Id) throws NotFoundException, com.newproject1.train.serviceimpl.NotFoundException {
		return employeeservice.getByEmployeeId(Id);
	}
	
	
	@DeleteMapping("/deleteEmp/{Id}")
	String deleteEmployee(@PathVariable String Id) {
		return employeeservice.deleteEmp(Id);
	}
//	@PutMapping("/updateemp/{Id}")
//	Employee updateEmployee(@PathVariable String Id, @RequestBody Employee employee) {
//		return employeeservice.updateEmployee(Id, employee);
//	}

	@PutMapping("/updateemp/{Id}")
	public String updateEmployee(String id, String string) {
		// TODO Auto-generated method stub
		return employeeservice.updateEmployee(id, string);
	}

	
}



