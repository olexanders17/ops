package ua.ak.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.ak.domain.FieldOperation;
import ua.ak.service.FieldOperationService;

@Controller
public class DefaultController {

	@Autowired
	FieldOperationService service;

	@RequestMapping(value = { "/", "/home" })
	public String mainPage() {

		return "base.definition";
	}

}
