package com.newproject1.train.service;

import java.util.List;
import java.util.Optional;

import com.newproject1.train.Entity.Employee;
import com.newproject1.train.serviceimpl.NotFoundException;

public interface Employeeservic {
	
	
	
	public Employee createEmployee(Employee employee);

	String deleteEmp(String Id);

	//Employee updateEmployee(String Id, String employee);

	//public List<Employee> getEmployee() throws NotFoundException;

	List<Employee> getAllEmployee() throws NotFoundException;

	Employee getByEmployeeId(String Id) throws NotFoundException;

	String updateEmployee(String Id, String string);

	//List<Employee> getAllEmployee() throws NotFoundException;

	

	
	//public List<Employee> getEmployee();

	

}
