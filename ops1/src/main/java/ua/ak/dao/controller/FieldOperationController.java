package ua.ak.dao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ua.ak.domain.FieldOperation;
import ua.ak.service.FieldOperationService;

@Controller
public class FieldOperationController {

	@Autowired
	FieldOperationService service;

	public FieldOperationService getService() {
		return service;
	}

	public void setService(FieldOperationService service) {
		this.service = service;
	}

	@RequestMapping(value = "/fileLoad")
	public String fieldLoad(Model model) {
		service.fromExceltoDatabse();
		List<FieldOperation> list = service.getAll();
		model.addAttribute("fieldOperationList", list);
		return null;

	}

}
