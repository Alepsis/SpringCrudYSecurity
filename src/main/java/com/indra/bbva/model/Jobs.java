package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Jobs")
public class Jobs {
	
	@Id
	@Column(name="JOB_ID")
	private String jobid;
	@Column(name="JOB_TITLE")
	private String jobtitle;
	private int min_salary;
	private int max_salary;
	
	public Jobs(){
		
	}
	
	public Jobs(String jobid , String jobtitle, int min_salary, int max_salary){
		this.jobid = jobid;
		this.jobtitle = jobtitle;
		this.min_salary = min_salary;
		this.max_salary = max_salary;
	}

	public String getJobid() {
		return jobid;
	}

	public void setJob_id(String jobid) {
		this.jobid = jobid;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public int getMin_salary() {
		return min_salary;
	}

	public void setMin_salary(int min_salary) {
		this.min_salary = min_salary;
	}

	public int getMax_salary() {
		return max_salary;
	}

	public void setMax_salary(int max_salary) {
		this.max_salary = max_salary;
	}

	@Override
	public String toString() {
		return "Jobs [job_id=" + jobid + ", job_title=" + jobtitle + ", min_salary=" + min_salary + ", max_salary="
				+ max_salary + "]";
	}
	
	
	
	
	

}
