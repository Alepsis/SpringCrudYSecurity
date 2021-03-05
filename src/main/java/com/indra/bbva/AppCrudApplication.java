package com.indra.bbva;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.indra.bbva.model.Countries;
import com.indra.bbva.model.Department;
import com.indra.bbva.model.Employees;

import com.indra.bbva.model.JobHistoryIdentity;
import com.indra.bbva.model.Job_History;
import com.indra.bbva.model.Jobs;
import com.indra.bbva.model.Locations;
import com.indra.bbva.model.Phone;
import com.indra.bbva.model.Regions;
import com.indra.bbva.repository.EmployeeRepository;
import com.indra.bbva.repository.EmployeesRepository;
import com.indra.bbva.repository.Job_HistoryRepository;
import com.indra.bbva.service.CountriesServiceimpl;
import com.indra.bbva.service.DepartmentServiceimpl;
import com.indra.bbva.service.EmployeeServiceimpl;
import com.indra.bbva.service.EmployeesService;
import com.indra.bbva.service.Job_HistoryServiceimpl;
import com.indra.bbva.service.JobsServiceimpl;
import com.indra.bbva.service.LocationsServiceimpl;
import com.indra.bbva.service.PhoneServiceimpl;
import com.indra.bbva.service.RegionsServiceimpl;


@SpringBootApplication
public class AppCrudApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(AppCrudApplication.class, args);
		
	}
	
   
	@Autowired
	private Job_HistoryServiceimpl jobhistoServieImp;
	@Autowired
	private EmployeeServiceimpl employeeServiceImp;
	@Autowired
	private JobsServiceimpl jobsServiceImp;
	@Autowired
	private CountriesServiceimpl countriImp;
	@Autowired
	private DepartmentServiceimpl departmentImp;
	@Autowired
	private LocationsServiceimpl locationsImp;
	@Autowired 
	private PhoneServiceimpl phoneImp;
	@Autowired
	private RegionsServiceimpl regionsImp;
	@Autowired
    private Job_HistoryRepository Jhrepo;
	@Autowired 
	private EmployeeRepository repoe;
	@Override
	public void run(String... args) throws Exception{
		//if(jobhistoServieImp != null) {
		//	System.out.println("El repositorio se inyecto");
		
		//Tabla Employee
			//findAll();
		//	save();
			//delete();
			//update();
		
		//Tabla Job_History
		//Job_HistoryfindAll()
      	//Job_HistoryUpdate()
		
		//Tabla Jobs
		//JobsfindAll();
		//JobsSave();
		//JobsUpdate();
		//JobsDelete();

		
		//Tabla Countries
		//CountriesfindAll();
		//CountriesSave();
		//CountriesUpdate();
		//CountriesDelete();
		
		//Tabla Departments
		//DepartmentfindAll();
		//DepartmentSave();
		//DepartmentUpdate();
		//DepartmentDelete();
		
		findByName();
		
		//Tabla Locations 
		//LocationsfindAll();
		//LocationsSave();
		//LocationsUpdate();
		//LocationsDelete();
		
		//Tabla Phone
		//PhonefindAll();
		//PhoneSave();
		//PhoneUpdate();
	    //PhoneDelete();
		
		//Tabla Regions
		//RegionsfindAll();
		//RegionsSave();
		//RegionsUpdate();
		//RegionsDelete();
	//	}
	}
	
	private void findByName() {
		
		System.out.println(repoe.findByfirstnameEndingWith("n").toString());
		
		System.out.println(repoe.findByFirstnameAndLastname("Juan Alexis", "Rosales").toString());
		
		System.out.println(repoe.findByLastname("Rosales").toString());
		
		System.out.println(repoe.findBySalario().toString());

	}
	
//	private void findAll() {
	//	System.out.println("Estamos en buscar todos");
//		List<Employees> employeesList =new ArrayList<Employees>();
		//employeesList = employeeServiceImp.buscar();
	//   for(Employees employees: employeesList) {
			//System.out.println(employees.toString());
	//	}
	    //System.out.println(employeeServiceImp.buscar());
	//	Iterable<Employees> iter = repo.findAll();
		//for(Employees employees :iter) {
			//System.out.println(employees.toString());
	//	}
//	}
	
	
	private void update() {
		System.out.println("Estamos en actualizar");
		Employees employee = new Employees();
	    //employee.setJob_id("MK_REP");
     //  employeeService.actualizar(employee);
	employeeServiceImp.actualizar(employee ,220);
	
	}
	private void save() {
		System.out.println("Estamos en guardar");
	//	Employees b = new Employees(b.getEmployee_id(), "Juan",
		//		"Rosales Peña" ,
			//	"juanrossdfadsss@gmail.com" ,
			//	"7222842162" ,
			//	fecha,
			//	"IT_PROG", 
			//	4000.00 , 
			//	102,
			//	60);
		Employees b = new Employees();
		
		//b.setFirst_name("Juan Alexis");
		b.setLastname("Rosales Peña");
		b.setEmail("fdsf43@gmail.com");
		b.setPhonenumber("34324324");
		b.setHiredate(new Date(0));
		//b.setJob_id("IT_PROG");
		b.setSalary(6000.00);
		b.setManagerid(110);
		//b.setDepartment_id(60);
		System.out.println(employeeServiceImp.guardar(b));
	}
	
	private void delete() {
		System.out.println("Estamos en eliminar");
		//System.out.println("El empleado " + repo.findById(207));
	
		//repo.deleteById(207);;
		employeeServiceImp.eliminar(220);

	}
	
	
	//JOB_HISTORY
	private void Job_HistoryfindAll() {
		System.out.println("Estamos en buscar job_History");
		List<Job_History> jobhistoryList =new ArrayList<Job_History>();
		jobhistoryList = jobhistoServieImp.buscar();
		for(Job_History jobHistory: jobhistoryList) {
			System.out.println(jobHistory.toString());
		}
	}
	
    private void Job_HistorySave() {
		
	}
	
	
	private void Job_HistoryUpdate() {
		//System.out.println("Estamos en actualizar");
	   Job_History jh = new Job_History();
	   
	   SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
	   Date date = new Date();
	   try {
		   date = format.parse("10/08/2012");
	   }catch (Exception ex) {}
	   
	 jh.setId(new JobHistoryIdentity(220 , date));
	 try {
		   date = format.parse("10/08/2013");
	   }catch (Exception ex) {}
	   
       jh.setEnd_Date(date);
       jh.setDepartment_id(50);
	}
	
	
	private void Job_HistoryDelete() {
		//SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		
		
	}
	
	//Jobs 
	
	private void JobsfindAll() {
		System.out.println("Estamos en buscar jobs");
		List<Jobs> jobsList =new ArrayList<Jobs>();
		jobsList = jobsServiceImp.buscar();
		for(Jobs jobs: jobsList) {
			System.out.println(jobs.toString());
		}
	}
	
	private void JobsSave() {
		Jobs job = new Jobs();
		job.setJob_id("PD_PRE");
		job.setJobtitle("Prueba");
		job.setMax_salary(3000);
		job.setMin_salary(1000);
		
		jobsServiceImp.guardar(job);
	}
	
	private void JobsUpdate() {
		Jobs job = new Jobs();
		job.setJob_id("PD_PRE");
		job.setJobtitle("Prueba Actualizar");
		jobsServiceImp.actualizar(job);
	}
	
	private void JobsDelete() {
		Jobs job = new Jobs();
		job.setJob_id("PD_PRE");
		jobsServiceImp.eliminar(job);
	}
	
	//Countries
	
	private void CountriesfindAll() {
		System.out.println("Estamos en buscar jobs");
		List<Countries>  countriesList =new ArrayList<Countries>();
		countriesList = countriImp.buscar();
		for(Countries countries: countriesList) {
			System.out.println(countries.toString());
		}
	}
	
	
	private void CountriesSave() {
		
		Countries countr = new Countries();
		
		countr.setCountry_id("LA");
		countr.setCountry_name("Pruebasd");
	    countr.setRegion_id(2);
	    countriImp.guardar(countr);
		
	}
	
	private void CountriesUpdate() {
		System.out.println("Estamos en actualizar");
		Countries countr = new Countries();

 			countr.setCountry_id("OF");
 			countr.setRegion_id(1);
			countriImp.actualizar(countr);
		
	}
	
	private void CountriesDelete() {
		System.out.println("Eliminando");
		Countries count = new Countries();
		count.setCountry_id("OF");
		
		countriImp.eliminar(count);
	
	}
	
	//Department
	private void DepartmentfindAll() {
		System.out.println("Estamos en buscar jobs");
		List<Department>  departmentList =new ArrayList<Department>();
		departmentList = departmentImp.buscar();
		for(Department department: departmentList) {
			System.out.println(department.toString());
		}
	}
	
	private void DepartmentSave() {
		
		Department dep = new Department();
		
		dep.setDepartmentname("Sistemdasdas");
		dep.setLocation_id(1700);
		departmentImp.guardar(dep);
		
		
	}
	
	private void DepartmentUpdate() {
		System.out.println("Estamos en actualizar");
		Department department = new Department();
		
			department.setDepartmentname("SistemasPrueba");
			departmentImp.actualizar(department, 331);


	}
	
	private void DepartmentDelete() {
		departmentImp.eliminar(331);
	}
	
	
	//Locations
	private void LocationsfindAll() {
		System.out.println("Estamos en buscar jobs");
		List<Locations>  locationsList =new ArrayList<Locations>();
		locationsList = locationsImp.buscar();
		for(Locations locations: locationsList) {
			System.out.println(locations.toString());
		}
	}
	
	private void LocationsSave() {
		Locations location = new Locations();
		location.setStreet_address("Asuncion");
		location.setPostal_code("423423");
		location.setCity("Toluca");
		location.setState_province("Mexico");
		location.setCountry_id("US");
		locationsImp.guardar(location);
	}
	
	private void LocationsUpdate() {
		Locations location = new Locations();
		location.setLocation_id(3201);
		location.setCity("Meteoec");
		locationsImp.actualizar(location);
	}
	
	private void LocationsDelete() {
		locationsImp.eliminar(3201);
	}
	
	//Phone
	private void PhonefindAll() {
		System.out.println("Estamos en buscar jobs");
		List<Phone>  phoneList =new ArrayList<Phone>();
		phoneList = phoneImp.buscar();
		for(Phone phone: phoneList) {
			System.out.println(phone.toString());
		}
	}
	
	private void PhoneSave() {
		Phone p1 = new Phone();
		p1.setId(1);
		p1.setExtension(null);
		p1.setIsd_code(null);
		p1.setPhone_number(null);
		p1.setType("Test");
		p1.setEmployee_id(0);
		
		phoneImp.guardar(p1);
	}
	
	private void PhoneUpdate() {
	
        Phone p1 = new Phone();
        p1.setId(1);
        p1.setType("Act");
        phoneImp.actualizar(p1);
		
	}
	
	private void PhoneDelete() {
		phoneImp.eliminar(1);
	}
	
	//Regions
	private void RegionsfindAll() {
		System.out.println("Estamos en buscar jobs");
		List<Regions>  regionsList =new ArrayList<Regions>();
		regionsList = regionsImp.buscar();
		for(Regions regions: regionsList) {
			System.out.println(regions.toString());
		}
	}
	
	private void RegionsSave() {
		Regions region = new Regions();
		region.setRegion_id(5);
		region.setRegion_name("Prueba");
		regionsImp.guardar(region);
	}
	
	private void RegionsUpdate() {
		Regions region = new Regions();
		region.setRegion_name("PruebaActua");
		regionsImp.actualizar(region , 5);
	}
	
	private void RegionsDelete() {
		regionsImp.eliminar(5);
	}
	

}
