package com.indra.bbva.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.indra.bbva.model.Employees;

public interface EmployeeRepository extends Repository<Employees, Integer> {
	
   List<Employees> findByfirstnameEndingWith(String  firstname);
   
   List<Employees> findByFirstnameAndLastname(String firstname , String lastname);
   
   @Query(value="SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE %?1" , nativeQuery = true)
   List<Employees> findByLastname(String lastname);
   
   @Query(value="SELECT * FROM EMPLOYEES WHERE SALARY > 6000" , nativeQuery = true)
   List<Employees> findBySalario();
}
