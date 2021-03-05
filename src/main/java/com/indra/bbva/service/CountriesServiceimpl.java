package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Countries;
import com.indra.bbva.model.Department;
import com.indra.bbva.repository.CountrieRepository;

@Service
public class CountriesServiceimpl implements CountriesService{

	@Autowired
	private CountrieRepository countrirepo;

	@Override
	public List<Countries> buscar() {
		// TODO Auto-generated method stub
		return (List<Countries>) countrirepo.findAll();
	}

	@Override
	public String guardar(Countries countries) {
		try {
			countrirepo.save(countries);
			return "Guardado correctamente";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	@Override
	public String eliminar(Countries countries) {
		try {
			countrirepo.deleteById(countries.getCountry_id());
			return "Error al eliminar";
		}catch(Exception ex) {
			return "Error al eliminar";
		}
	}

	@Override
	public String actualizar(Countries countries) {
		try {
			countrirepo.save(countries);
			return "Error al eliminar";
		}catch(Exception ex) {
			return "Error al eliminar";
		}
	}
	
	

}
