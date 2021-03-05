package com.indra.bbva.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone")
public class Phone {
	
	@Id
	private int id;	
	private String extension;
	private String isd_code;
	private String phone_number;
	private String type;
	private int employee_id;
	
	
	public Phone() {
		
	}
	
	public Phone(int id , String extension , String isd_code, String phone_number , String type, int employee_id) {
		this.id = id;
		this.extension = extension;
		this.isd_code = isd_code;
		this.phone_number = phone_number;
		this.type = type;
		this.employee_id = employee_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public String getIsd_code() {
		return isd_code;
	}
	public void setIsd_code(String isd_code) {
		this.isd_code = isd_code;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	@Override
	public String toString() {
		return "Phone [id=" + id + ", extension=" + extension + ", isd_code=" + isd_code + ", phone_number="
				+ phone_number + ", type=" + type + ", employee_id=" + employee_id + "]";
	}
	
	
	

}
