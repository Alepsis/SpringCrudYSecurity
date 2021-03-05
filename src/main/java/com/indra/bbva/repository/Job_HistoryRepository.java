package com.indra.bbva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.indra.bbva.model.JobHistoryIdentity;
import com.indra.bbva.model.Job_History;

@Repository
public interface Job_HistoryRepository extends CrudRepository<Job_History, JobHistoryIdentity>{

}
