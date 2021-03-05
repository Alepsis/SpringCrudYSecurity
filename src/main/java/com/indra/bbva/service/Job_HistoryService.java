package com.indra.bbva.service;

import java.util.List;


import com.indra.bbva.model.Job_History;

public interface Job_HistoryService {
	
	List<Job_History> buscar();
	
	String guardar(Job_History job_history);
	
   
	boolean eliminar(Job_History job_history);

	boolean actualizar(Job_History job_history);

}
