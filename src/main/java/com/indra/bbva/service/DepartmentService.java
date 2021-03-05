package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import com.indra.bbva.model.Department;

public interface DepartmentService {
	List<Department> buscar();
	
	String guardar(Department department);

	
	public Optional<Department> findCustomerById(int id);
	
	boolean eliminar(int id);

	boolean actualizar(Department department , int id);


}
