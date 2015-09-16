package ua.ak.dao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ua.ak.service.FieldOperationService;

@Controller
public class FieldOperationController {
	
	@Autowired
	FieldOperationService	service;

	
	
	
	
	
	
	public FieldOperationService getService() {
		return service;
	}

	public void setService(FieldOperationService service) {
		this.service = service;
	} 

	
	
}
