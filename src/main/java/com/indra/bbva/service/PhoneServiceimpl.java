package com.indra.bbva.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.bbva.model.Phone;
import com.indra.bbva.repository.PhoneRepository;
@Service
public class PhoneServiceimpl implements PhoneService{

	@Autowired
	private PhoneRepository phonerepo;
	@Override
	public List<Phone> buscar() {
		// TODO Auto-generated method stub
		return (List<Phone>) phonerepo.findAll();
	}

	@Override
	public String guardar(Phone phone) {
		try {
			phonerepo.save(phone);
			return "Guardado correctamente";
		}catch (Exception ex) {
			return "Error al guardar";
		}
	}

	@Override
	public boolean eliminar(int id) {
		if (phonerepo.existsById(id))
		{
		phonerepo.deleteById(id);
		return true;
		
	}
		return false;
	}

	@Override
	public boolean actualizar(Phone phone) {
		try {
			phonerepo.save(phone);
			return true;
		}catch(Exception ex) {
			return false;
		}
	}
	

}
