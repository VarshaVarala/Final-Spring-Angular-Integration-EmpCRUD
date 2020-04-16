package com.pdw.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pdw.entity.Employee;

@Service
public interface EmployeeServiceInterace {

	   Employee findEmployeeById(int id);

	    String createEmployee(Employee employee);
	    List<Employee> findAllEmployees();
	    String deleteEmployee(int eid);
	    String updateEmployee(Employee employee);

	
	
}