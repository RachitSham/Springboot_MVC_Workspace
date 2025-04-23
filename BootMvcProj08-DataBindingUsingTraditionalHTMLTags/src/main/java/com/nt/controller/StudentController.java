package com.nt.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.nt.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/")
	public String showHomePage() {
		System.out.println("StudentOperationController.studentData()");
		// LVN Name(home page --welcome.jsp)
		return "welcome";
	}

	@GetMapping("/register")
	public String showStudentFormPage() {
		// LVN Name(form page student_register.jsp)
		return "student_register";
	}

	@PostMapping("/register")
	public String registerStudent(Map<String, Object> map, @ModelAttribute("stud") Student st) {
		System.out.println(st);
		// return LVN
		return "show_result";
	}
}
