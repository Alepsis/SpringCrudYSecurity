package com.indra.bbva.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.indra.bbva.model.Regions;
import com.indra.bbva.repository.RegionsRepository;
@Service
public class RegionsServiceimpl implements RegionsService{

	@Autowired
	private RegionsRepository regionsrepo;

	@Override
	public List<Regions> buscar() {
		// TODO Auto-generated method stub
		return (List<Regions>) regionsrepo.findAll();
	}

	@Override
	public String guardar(Regions regions) {
		try {
			regionsrepo.save(regions);
			return "Departamento guardado guardado";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	@Override
	public boolean eliminar(int id) {
		if (regionsrepo.existsById(id))
		{
		regionsrepo.deleteById(id);
		return true;
		
	}
		return false;
	}

	@Override
	public boolean actualizar(Regions regions , int id) {
		try {
			regionsrepo.save(regions);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}

	
}
