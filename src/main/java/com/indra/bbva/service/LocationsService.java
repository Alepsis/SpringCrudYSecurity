package com.indra.bbva.service;

import java.util.List;


import com.indra.bbva.model.Locations;

public interface LocationsService {
	List<Locations> buscar();
	
	String guardar(Locations locations);
	
   
	
	boolean eliminar(int id);

	boolean actualizar(Locations locations );

}
