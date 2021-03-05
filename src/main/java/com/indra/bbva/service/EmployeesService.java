package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.Employees;

public interface EmployeesService {
	
	List<Employees> buscar();
	
	String guardar(Employees employees);
	
    String actualizar(Employees employees, int id); 
	
	String eliminar(int id);


	

}
