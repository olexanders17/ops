package ua.ak.dao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping(value="/go")
	public String go() {

		return "go";
	}

}
