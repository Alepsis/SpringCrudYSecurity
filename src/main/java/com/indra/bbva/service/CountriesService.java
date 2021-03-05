package com.indra.bbva.service;

import java.util.List;

import com.indra.bbva.model.Countries;


public interface CountriesService {
	
	List<Countries> buscar();
	
	String guardar(Countries countries);
	
   
	
	String eliminar(Countries countries);

	String actualizar(Countries countries);

}
