package com.example.crudspringback.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudspringback.entity.Employee;
import com.example.crudspringback.repository.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private CrudRepo repo;
	
	private int id1;
	

	public List<Employee> getAllEmployee() {
		
		return this.repo.findAll();
	}

	public String addEmployee(Employee employee1) {
		 this.repo.save(employee1);
		 return "saved";
		
	}

	public Employee getById(Long id) {
		// TODO Auto-generated method stub
		
		
		return this.repo.findById(id);
	}

	public Employee updateEmployee(Long id,Employee employee3) {
		// TODO Auto-generated method stub
		 Employee employee4=this.repo.findById(id);
		 employee4.setEmailId(employee3.getEmailId());
		 employee4.setFirstName(employee3.getFirstName());
		 employee4.setLastName(employee3.getLastName());
		 return this.repo.save(employee4);
	}

}
