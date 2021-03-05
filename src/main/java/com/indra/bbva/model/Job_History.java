package com.indra.bbva.model;


import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="Job_history") 
public class Job_History {
	
	@EmbeddedId
	private JobHistoryIdentity id;
	private Date end_Date;
	private String job_id;
	private int department_id;
	
	@ManyToOne
	@JoinColumn(name="EMPLOYEE_ID", nullable= false, updatable=false, insertable=false)
	private Employees employees;
	
	public Job_History() {
		
	}
	
	public Job_History(JobHistoryIdentity id , Date end_date ,  String job_id , int department_id){
	    super();
	    this.id = id;
		this.end_Date = end_date;
		this.job_id = job_id;
		this.department_id = department_id;
	}
 

	
	public JobHistoryIdentity getId() {
		return id;
	}

	public void setId(JobHistoryIdentity id) {
		this.id = id;
	}

	public void setStart_Date(Date start_Date) {
		start_Date = start_Date;
	}
	public Date getEnd_Date() {
		return end_Date;
	}
	public void setEnd_Date(Date end_Date) {
		end_Date = end_Date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		job_id = job_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		department_id = department_id;
	}
	@Override
	public String toString() {
		return "Job_History [employee_id=" + id   + ", end_Date=" + end_Date
				+ ", job_id=" + job_id + ", department_id=" + department_id + "]";
	}
 
    
}
