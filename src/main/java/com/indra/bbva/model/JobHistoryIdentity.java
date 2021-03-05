package com.indra.bbva.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class JobHistoryIdentity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Column(name="EMPLOYEE_ID")
	private int employee_id;
	@Column(name="START_DATE")
    private Date startDate;
    
    public  JobHistoryIdentity() {
		// TODO Auto-generated constructor stub
	}
    	
  
    
	public JobHistoryIdentity(int employee_id, Date startDate) {
		super();
		setEmployee_id(employee_id);
		setStartDate(startDate);
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "JobHistoryEmbedded [employee_id=" + employee_id + ", startDate=" + startDate + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + employee_id;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JobHistoryIdentity other = (JobHistoryIdentity) obj;
		if (employee_id != other.employee_id)
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}
    
    
    
}
