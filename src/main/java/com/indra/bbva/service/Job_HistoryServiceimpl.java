package com.indra.bbva.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Department;
import com.indra.bbva.model.Job_History;
import com.indra.bbva.repository.Job_HistoryRepository;
@Service
public class Job_HistoryServiceimpl implements Job_HistoryService {
	
	@Autowired
    private Job_HistoryRepository jobhistoRepo;
	
	@Override
	public List<Job_History> buscar() {
		
	    return (List<Job_History>) jobhistoRepo.findAll(); 
	}

	@Override
	public String guardar(Job_History job_history) {
		try {
			jobhistoRepo.save(job_history);
			return "Guardado con exito";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	

	@Override
	public boolean eliminar(Job_History job_history) {  
		return false;
	}

	@Override
	public boolean actualizar(Job_History job_history) {
		try {
			jobhistoRepo.save(job_history);
			return true;
		}catch (Exception ex) {
			return false;
		}
	}
	

}
