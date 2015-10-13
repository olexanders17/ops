package ua.ak.webservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.ak.dao.FieldOperationDao;

@RestController
public class WebSeviceController {

	public WebSeviceController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	FieldOperationDao dao;

	public FieldOperationDao getDao() {
		return dao;
	}

	public void setDao(FieldOperationDao dao) {
		this.dao = dao;
	}

	@RequestMapping(value = "/folist")
	FieldOperationWSDto getAllfieldsOperstions() {

		FieldOperationWSDto fo = new FieldOperationWSDto();
		fo.list = dao.findAll();

		return fo;

	}

}
