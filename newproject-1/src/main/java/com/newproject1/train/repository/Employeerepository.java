package com.newproject1.train.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.newproject1.train.Entity.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, String> {
	
//	Employee createEmployee(Employee employee);
//
//	Employee getByEmpId(String id);
//     List<Employee> getAllEmployee();
//
//	Employee findByName(String name);

	
	@Query("select e from Employee e")
	List<Employee> getAllEmp();
	
	

}
