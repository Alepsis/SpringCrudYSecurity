package com.indra.bbva.repository;

import org.springframework.data.repository.CrudRepository;

import com.indra.bbva.model.Countries;

public interface CountrieRepository extends CrudRepository<Countries, String> {

}
