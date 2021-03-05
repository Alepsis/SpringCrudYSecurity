package com.indra.bbva.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.indra.bbva.model.Employees;

public interface EmployeesRepository extends CrudRepository<Employees, Integer> {

}
