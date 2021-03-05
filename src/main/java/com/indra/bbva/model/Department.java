package com.indra.bbva.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="Departments")
public class Department {

	@Id
	@GeneratedValue(generator="sequenciadep")
	@SequenceGenerator(name="sequenciadep",sequenceName="DEPARTMENTS_SEQ" ,  initialValue = 1, allocationSize = 10)
	private int department_id;
	@Column(name="department_name")
	private String departmentname;
	private Integer manager_id;
	private Integer location_id;
	
	
	
	public Department() {
		
	}
	
    public Department(int department_id, String departmentname, Integer manager_id , Integer location_id) {
    	this.department_id = department_id;
    	this.departmentname = departmentname;
    	this.manager_id = manager_id;
    	this.location_id = location_id;
		
	}

	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String department_name) {
		this.departmentname = department_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", department_name=" + departmentname + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}
	
	
	

}
