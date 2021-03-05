package com.indra.bbva.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Department;
import com.indra.bbva.model.Employees;
import com.indra.bbva.repository.EmployeesRepository;


@Service
public class EmployeeServiceimpl implements EmployeesService {

	@Autowired
	private EmployeesRepository employeeRepo ;
	@Override
	public List<Employees> buscar() {
		
		return (List<Employees>) employeeRepo.findAll();
	}

	@Override
	public String guardar(Employees employees) {
		try {
			employeeRepo.save(employees);
			return "Empleado guardado";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	
	@Override
	public String actualizar(Employees employees , int id) {
		Optional<Employees> regreso = employeeRepo.findById(id);
		Iterable<Employees> iter = employeeRepo.findAll();
		if(regreso.isPresent()) {
			Employees employee = regreso.get(); 
			for(Employees e: iter)
			{
				if(e.getEmail().equals(employees.getEmail())){
					return "No se actualizo ya existe un correo igual";
				}
			}
			employee.setFirstname(employees.getFirstname());
			employee.setLastname(employees.getLastname());
			employee.setPhonenumber(employees.getPhonenumber());
			employee.setHiredate(employees.getHiredate());
			employee.setJob(employees.getJob());
			employee.setSalary(employees.getSalary());
			employee.setManagerid(employees.getManagerid());
			employee.setDepartment(employees.getDepartment());
			employee.setEmail(employees.getEmail());
			employeeRepo.save(employee);
			return "Usuario actualizado";
	}
		return "El usuario no fue actualizado";
	
		}

	@Override
	public String eliminar(int id) {
		if (employeeRepo.existsById(id))
		{
		employeeRepo.deleteById(id);
		return "Empleado eliminado con exito";
		
	}
		return "Erro al eliminar empleado";

	}
}

