package com.indra.bbva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Jobs;
import com.indra.bbva.repository.JobsRepository;

@Service
public class JobsServiceimpl implements JobsService {
    
	
	@Autowired
	private JobsRepository jobrepo;
	@Override
	public List<Jobs> buscar() {
		// TODO Auto-generated method stub
		return (List<Jobs>) jobrepo.findAll();
	}

	@Override
	public String guardar(Jobs jobs) {
		try {
			jobrepo.save(jobs);
			return "Guardado correctamente";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	@Override
	public String eliminar(Jobs jobs) {
		try {
			jobrepo.deleteById(jobs.getJobid());
			return "Error al eliminar";
		}catch(Exception ex) {
			return "Error al eliminar";
		}
	}

	@Override
	public String actualizar(Jobs jobs) {
		try {
			jobrepo.save(jobs);
			return "Error al eliminar";
		}catch(Exception ex) {
			return "Error al eliminar";
		}
	}

	

}
