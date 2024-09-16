package com.example.crudspringback.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.crudspringback.entity.Employee;



@EnableJpaRepositories
@Repository
public interface CrudRepo extends JpaRepository<Employee,Integer> {

	Employee findById(Long id);
	
//	Optional<LoginDto> findOneByNameandPassword(String name,String password);
	

}

