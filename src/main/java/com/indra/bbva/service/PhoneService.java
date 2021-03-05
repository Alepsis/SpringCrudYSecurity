package com.indra.bbva.service;

import java.util.List;


import com.indra.bbva.model.Phone;

public interface PhoneService {
	
	List<Phone> buscar();
	
	String guardar(Phone phone);
	
   
	
	boolean eliminar(int id);

	boolean actualizar(Phone phone);


}
