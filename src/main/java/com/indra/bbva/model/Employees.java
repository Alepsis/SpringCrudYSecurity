package com.indra.bbva.model;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




@Entity
@Table(name="Employees")
public class Employees {
	
    @Id
	@GeneratedValue(generator="sequencia")
	@SequenceGenerator(name="sequencia",sequenceName="EMPLOYEES_SEQ", allocationSize=1)    
	private int employee_id;
    @Column(name= "first_name")
	private String firstname;
    @Column(name= "last_name")
	private String lastname;
	private String email;
	@Column(name="phone_number")
	private String phonenumber;
	@Column(name="hire_date")
	private Date hiredate;
	@Column(name="job_id")
	private String jobid;
	@Column(name="department_id")
	private Integer departmentid;
	@ManyToOne
	@JoinColumn(name = "JOB_ID", nullable = false, updatable=false, insertable=false)
	private Jobs job;
	private Double salary;
	@Column(name="manager_id")
	private Integer managerid;
	
    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false, updatable=false, insertable=false)
	private Department department;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "employees", fetch = FetchType.LAZY)
    private List<Job_History> jobHistoryList;
	//Constructor vacio
	public Employees()
	{
		
	}
	

	



	public Integer getDepartmentid() {
		return departmentid;
	}






	public void setDepartmentid(Integer department_id) {
		this.departmentid = department_id;
	}






	public Department getDepartment() {
		return department;
	}






	public void setDepartment(Department department) {
		this.department = department;
	}






	public String getJobid() {
		return jobid;
	}




	public void setJobid(String jobid) {
		this.jobid = jobid;
	}

	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Jobs getJob() {
		return job;
	}




	public void setJob(Jobs job) {
		this.job = job;
	}




	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Integer getManagerid() {
		return managerid;
	}
	public void setManagerid(Integer managerid) {
		this.managerid = managerid;
	}

	@Override
	public String toString() {
		return "Employees [employee_id=" + employee_id + ", first_name=" + firstname + ", last_name=" + lastname
				+ ", email=" + email + ", phone_number=" + phonenumber + ", hire_date=" + hiredate + ", job_id="
				+ job + ", salary=" + salary + ", manager_id=" + managerid + ", department_id=" + department
				+ "]";
	}
}
