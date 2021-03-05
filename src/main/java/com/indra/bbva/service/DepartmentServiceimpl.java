package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Department;

import com.indra.bbva.repository.DepartmentRepository;

@Service
public class DepartmentServiceimpl implements DepartmentService{

	
	@Autowired 
	private DepartmentRepository departmetnrepo;
	@Override
	public List<Department> buscar() {
		// (List<Employees>) employeeRepo.findAll()
		return (List<Department>) departmetnrepo.findAll();
	}

	@Override
	public String guardar(Department department) {
		try {
			departmetnrepo.save(department);
			return "Departamento guardado guardado";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	@Override
	public boolean eliminar(int id) {
		if (departmetnrepo.existsById(id))
		{
		departmetnrepo.deleteById(id);
		return true;
		
	}
		return false;
	}

	@Override
	public boolean actualizar(Department department , int id) {
		
		Optional<Department> regreso = departmetnrepo.findById(id);
		if(regreso.isPresent()) {
			Department departmen = regreso.get(); 
			departmen.setDepartmentname("SistemasPrueba");
			departmetnrepo.save(departmen);
			return true;
	}
		return false;
	}

	@Override
	public Optional<Department> findCustomerById(int id) {
		Optional<Department> department = departmetnrepo.findById(id);		
		if(department.isPresent()) {
			Department departmen = department.get(); 
			departmetnrepo.save(departmen);
			
		}
		return department;
	}
	





}
