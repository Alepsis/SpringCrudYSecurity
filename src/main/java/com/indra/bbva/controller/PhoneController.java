package com.indra.bbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.bbva.service.PhoneService;

@Controller
@RequestMapping(value="/")
public class PhoneController {
	
	@Autowired
	private PhoneService phoneservice;


}
