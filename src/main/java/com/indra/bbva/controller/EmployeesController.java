package com.indra.bbva.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.indra.bbva.model.Department;
import com.indra.bbva.model.Employees;
import com.indra.bbva.model.Jobs;
import com.indra.bbva.service.DepartmentService;
import com.indra.bbva.service.EmployeesService;
import com.indra.bbva.service.JobsService;

@Controller
@RequestMapping(value = "/listaemp")
public class EmployeesController {
	@Autowired
	private EmployeesService employeesservice;
    @Autowired 
    private JobsService serviceJ;
    @Autowired
    private DepartmentService serviceD;
    
    private List<Jobs> regjob = new ArrayList<Jobs>();
    private List<Department> regdep = new ArrayList<Department>();
	@GetMapping("/")
	public String listaempleado() {
		return "listaemp";
	}
	
	@GetMapping("/listaempleado")
	public String listaempleado(Model model) {
		if(employeesservice.buscar().isEmpty())
		{
			
		}else{
			
		}
		model.addAttribute("employees", employeesservice.buscar());
		return "listaempleado";
	}
	@GetMapping("/nuevoempleado")
	public String nuevo(Model model) {
		regjob = serviceJ.buscar();
	    regdep = serviceD.buscar();
		model.addAttribute("jobs", regjob);
		model.addAttribute("deps", regdep);
		return "agregarempleado";
	}
	
	
	@PostMapping("/agregarempleado")
	public String agregar(Employees employees, Model model, RedirectAttributes attributes) {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		attributes.addFlashAttribute("msg", "Usuario Creado Correctamente");
		model.addAttribute("employees", employees.getFirstname() + employees.getLastname() + employees.getEmail() 
		+ employees.getPhonenumber() + employees.getHiredate() + employees.getJob() + employees.getSalary() + employees.getManagerid()
		+ employees.getDepartment());
		regjob = serviceJ.buscar();
	    regdep = serviceD.buscar();
		model.addAttribute("jobs", regjob);
		model.addAttribute("deps", regdep);
		employeesservice.guardar(employees);
		return "redirect:/listaemp/listaempleado";
	}

	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") int id, Model model) {
		regjob = serviceJ.buscar();
	    regdep = serviceD.buscar();
	    for(Employees emple :employeesservice.buscar()) {
	    	if(emple.getEmployee_id()==id)
	    	{
	    	model.addAttribute("jobs", regjob);
			model.addAttribute("deps", regdep);
			model.addAttribute("emple", emple);
	    	}
	    }
		return "actualizarempleado";
	}
	
	@PostMapping("/actualizarempleado/{id}")
	public String actualizar(Employees employees,ModelMap mp , @PathVariable("id") int id, RedirectAttributes attributes) {
	    Employees emp = new Employees();
	    
		emp.setDepartment(employees.getDepartment());
		emp.setEmail(employees.getEmail());
		//emp.setFirst_name(employees.getFirst_name());
		emp.setLastname(employees.getLastname());
		regjob = serviceJ.buscar();
	    regdep = serviceD.buscar();
		mp.addAttribute("jobs", regjob);
		mp.addAttribute("deps", regdep);
		employeesservice.actualizar(employees, id);
		attributes.addFlashAttribute("msg", "Usuario Actualizado");
		return "redirect:/listaemp/listaempleado";
		
	}

	
	@GetMapping("/eliminar/{id}")
	public String delete(ModelMap mp , @PathVariable int id, RedirectAttributes attributes) {
		employeesservice.eliminar(id);
		attributes.addFlashAttribute("msg", "Usuario Eliminado Correctamente");
	return "redirect:/listaemp/listaempleado";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
		}
	 
	
}
