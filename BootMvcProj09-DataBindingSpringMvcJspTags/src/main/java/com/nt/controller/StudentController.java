package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.model.Student;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String viewHome() {
		System.out.println("StudentController.viewHome()");
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showFrom(@ModelAttribute("stud") Student st)  {
		
		System.out.println("StudentController.showFrom()");
		System.out.println("Model Class Object Data:: " + st);
		// LVN Name
		return "student_register";
		
	}
	
	@PostMapping("/register")
	public String processStudent(Map<String, Object> map, @ModelAttribute("stud") Student st) {
		System.out.println("StudentController.processStudent()");
		System.out.println("Model Class Object Data:: " + st);
		
		String grade = null;
		// generate result 
		if(st.getAvg()>=75)
			grade = "First Division and Distinct";
		else if (st.getAvg()>=60)
			grade =  "First Class";
		else if (st.getAvg()>=50)
			grade = "Second Class";
		else if (st.getAvg()>= 35)
			grade = "Thrid Class";
		else
			grade  = "Fail";

		// keep result in model attribute 
		map.put("result", grade);
		
		// return LVN
		return "show_result";
	}
}
