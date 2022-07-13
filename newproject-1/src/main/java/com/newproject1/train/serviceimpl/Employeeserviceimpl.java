package com.newproject1.train.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newproject1.train.Entity.Employee;
import com.newproject1.train.repository.Employeerepository;
import com.newproject1.train.service.Employeeservic;










@Service
@Transactional
public class Employeeserviceimpl implements Employeeservic {
	
	
	@Autowired
	 private Employeerepository employeerepo;
	
	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		if(employee != null) {
			employee.setEmpname(employee.getEmpname());
			employee.setEmpId(employee.getEmpId());
			employeerepo.save(employee);
		}
		
		return employee;
		
		
	}
	@Override
	public List<Employee> getAllEmployee() throws NotFoundException {
		// TODO Auto-generated method stub
		List<Employee> employees = employeerepo.getAllEmp();
		if(employees != null) {
			return employees;
		}else {
			throw new NotFoundException();
		}
	}

	
	@Override
	public String deleteEmp(String Id) {
		// TODO Auto-generated method stub
		Employee empObj = employeerepo.getById(Id);
		if(empObj != null) {
			employeerepo.delete(empObj);
		}
		return "Employee deleted successfully";
	}
	@Override
	public String updateEmployee(String Id, String employee) {
		// TODO Auto-generated method stub
		Employee empObj = employeerepo.getById(Id);
		if(empObj != null) {
			empObj.setEmpId(Id);
			empObj.setEmpname(employee);
			employeerepo.save(empObj);
		}
		return employee;
	}
	public Employee getByEmployeeId(String Id) throws NotFoundException {
		// TODO Auto-generated method stub
		if(Id != null) {
			Employee Obj = employeerepo.getById(Id);    //i create object of employee class
			if(Obj != null) {
				return Obj;
			}else {
				 System.out.println("true");
			}
			
		}
		return null;
	}

//	@Override
//	public Employee createEmployee(Employee employee) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String deleteEmp(String Id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Employee> getAllEmployee() throws NotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Employee getByEmployeeId(String Id) throws NotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}
}






