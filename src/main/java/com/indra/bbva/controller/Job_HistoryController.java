package com.indra.bbva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.indra.bbva.service.Job_HistoryService;

@Controller
@RequestMapping(value="/")
public class Job_HistoryController {

	@Autowired
	private Job_HistoryService jobhistoryservice;
	
}
