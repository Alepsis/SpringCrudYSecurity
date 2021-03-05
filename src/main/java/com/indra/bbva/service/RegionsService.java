package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.Regions;



public interface RegionsService {
	
	List<Regions> buscar();
	
	String guardar(Regions regions);
	
	boolean eliminar(int id);

	boolean actualizar(Regions regions , int id);


}
