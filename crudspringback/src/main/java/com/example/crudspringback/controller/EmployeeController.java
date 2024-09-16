package com.example.crudspringback.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudspringback.entity.Employee;
import com.example.crudspringback.service.CrudService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	private CrudService crudservice;
	//get all employee
		@GetMapping("/getmessage")
		public String getMessage(){
			return "You are getting this message ,from application";
		}
	
	//get all employee
	@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		return this.crudservice.getAllEmployee();
	}
	
	//create employee
	@PostMapping("/employees")
	public String addEmployee(@RequestBody Employee employee1) {
		this.crudservice.addEmployee(employee1);
		return "added Successfully";
	}
	
	//get employee by id
	
	@GetMapping("/employees/{id}")
	public Employee getById(@PathVariable Long id) {
		return this.crudservice.getById(id);
		
	}
	
	//update employee
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee employee3) {
		return this.crudservice.updateEmployee(id, employee3);
		
	}
	

}
