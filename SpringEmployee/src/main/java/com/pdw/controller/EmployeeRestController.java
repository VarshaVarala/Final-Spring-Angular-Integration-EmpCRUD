package com.pdw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.pdw.service.EmployeeService;
import com.pdw.entity.*;

@RestController
@RequestMapping("/Employee")
@CrossOrigin("http://localhost:4200")
public class EmployeeRestController {
			    @Autowired
			    EmployeeService employeeService;

			    @GetMapping("/findEmployeeById/{enter id}")
			    public Employee findEmployeeById(@PathVariable("enter the id") int id) {
			        Employee employee = employeeService.findEmployeeById(id);
			        if (employee == null) {
			        System.out.println("user not found for id="+ id);
			        }
			         return employeeService.findEmployeeById(id);
			    }

			   @PostMapping("/createEmployee")
			    public String createEmployee(@RequestBody Employee employee) {
			    employeeService.createEmployee(employee);
			    	 return "employee created with id : "+employee.getEid();
			     }
			       
			   
			   @PutMapping("/updateEmployee")
			   public String updateEmployee(@RequestBody Employee employee) {
			       employeeService.updateEmployee(employee);
			       return "Employee has been updated";
			   }
			    
			   @DeleteMapping("/deleteEmployee/{eid}")
			   public String deleteEmployee(@PathVariable("eid") int eid) {
			       employeeService.deleteEmployee(eid);
				return "Deleted";}
			       
			   @GetMapping("/findAllEmployees")
			   public List<Employee>findAllEmployees(){
				   List<Employee>employees=employeeService.findAllEmployees();
				   return employees;
				   
			   }
			   
			      
		}
