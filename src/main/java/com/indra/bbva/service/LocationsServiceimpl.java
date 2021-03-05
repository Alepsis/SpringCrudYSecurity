package com.indra.bbva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Employees;
import com.indra.bbva.model.Locations;
import com.indra.bbva.repository.LocationsRepository;

@Service
public class LocationsServiceimpl implements LocationsService{

	@Autowired
	private LocationsRepository locationsrepo;
	@Override
	public List<Locations> buscar() {
		// (List<Employees>) employeeRepo.findAll()
		return (List<Locations>) locationsrepo.findAll();
	}

	@Override
	public String guardar(Locations locations) {
		try {
			locationsrepo.save(locations);
			return "Guardado correctamente";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	@Override
	public boolean eliminar(int id) {
		if (locationsrepo.existsById(id))
		{
		locationsrepo.deleteById(id);
		return true;
		
	}
		return false;
	}

	@Override
	public boolean actualizar(Locations locations) {
		try {
			locationsrepo.save(locations);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

}
