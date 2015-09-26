package ua.ak.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import ua.ak.domain.FieldOperation;
import ua.ak.service.FieldOperationService;
import ua.ak.utils.JsonCalendarData;

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

	@RequestMapping(value = "/calendar")
	public String calendar(Model model) {

		List<FieldOperation> list = service.getAll();
		String calendarData = new JsonCalendarData().getJsonCalendarData(list);
		model.addAttribute("calendarData", calendarData);

		return "calendar";
	}

	@RequestMapping(value = "/fileLoadForm")
	public String fieldLoadForm() {

		return "fileLoadForm";
	}

	@RequestMapping(value = "/fileLoad", method = RequestMethod.POST)
	public String fieldLoad(Model model, @RequestParam("file") MultipartFile file) {

		String name = "ggg";
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(name)));
				stream.write(bytes);
				stream.close();
				// return "You successfully uploaded " + name + "!";
			} catch (Exception e) {
				// return "You failed to upload " + name + " => " +
				// e.getMessage();
			}
		} else {
			// return "You failed to upload " + name + " because the file was
			// empty.";
		}

		service.fromExceltoDatabse();
		return "redirect:/";

	}

	@RequestMapping(value = "/dataTable")
	public String dataTable(Model model) {
		service.fromExceltoDatabse();
		List<FieldOperation> list = service.getAll();
		model.addAttribute("fieldOperationList", list);
		return "data-table";

	}

}
