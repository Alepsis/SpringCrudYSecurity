package com.indra.bbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.bbva.service.CountriesService;

@Controller
@RequestMapping(value="/home")
public class CountriesController {
	@Autowired
	private CountriesService countriservice;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/listacountries")
	public String listacountries(Model model) {
		if(countriservice.buscar().isEmpty())
		{
			
		}else{
			
		}
		model.addAttribute("countries", countriservice.buscar());
		return "home";
	}

}
