package com.indra.bbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.bbva.service.RegionsService;

@Controller
@RequestMapping(value = "")
public class RegionsController {
	
	@Autowired
	private RegionsService regionsservice;
	

}
