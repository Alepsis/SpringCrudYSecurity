package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.Jobs;

public interface JobsService {
    List<Jobs> buscar();
	
	String guardar(Jobs jobs);
	
   
	
	String eliminar(Jobs jobs);

	String actualizar(Jobs jobs);

}
