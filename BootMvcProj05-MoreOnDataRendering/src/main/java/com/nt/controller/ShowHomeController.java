package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShowHomeController {

	// "/" is the default handler method in the controller class
	/*@RequestMapping("/")
	public String homeWokspace() {
	// return LVN	
		return "welcome";
	}*/

	// if no request path is given to handler method the default request path will
	// be "/"
	/*@RequestMapping
	public String showPath() {
		// return LVN
		return "welcome";
	}*/

	// request path is case sensitive in the handeler method of one or more
	// controller class
	@RequestMapping("/REPORT")
	public String shoeReportData() throws Exception {
		// return LVN
		return "show_report_data";
	}

	// one handler method can mapped with multiple request Path
	@RequestMapping({ "/report1", "/report2", "/report3" })
	public String showReports() {
		// return LVN
		return "multiple_report";
	}

	// request path of handeler method must start with "/"
	@RequestMapping("report")
	public String showReport() throws Exception {
		// return LVN
		return "show_report";
	}

	// Multiple request path on same handler method havimg both GET and POST
	@GetMapping("/reports")
	@PostMapping("/reports")
	public String showReprotPath() {
		// return LVN
		return "show_report";
	}
	
	
}
