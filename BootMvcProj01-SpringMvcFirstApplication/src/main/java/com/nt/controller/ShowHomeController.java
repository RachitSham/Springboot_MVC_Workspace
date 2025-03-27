package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	// it take specified request
	@RequestMapping("/home")
	public String showHome() {
		return "welcome";
	}

	// it takes all the request
	/*@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}*/
	
	@RequestMapping("greet")
	public String showGreeting() {
		return "greeting";
	}
}
