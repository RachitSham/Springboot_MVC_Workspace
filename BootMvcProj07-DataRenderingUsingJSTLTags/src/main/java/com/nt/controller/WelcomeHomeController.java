package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;

@Controller
public class WelcomeHomeController {

	@RequestMapping("/report")
	public String sendData(Map<String, Object> map) {
		// create Model class object with data
		Employee emp = new Employee();
		emp.setEno(1001);
		emp.setEname("Veerababu Narmi");
		emp.setSalary(230000.89);
		emp.setVaccinated(true);

		// add model class object to model attribute
		map.put("empInfo", emp);
		return "show_data";
	}

	@GetMapping("/show")
	public String showData(Map<String, Object> map) {

		List<Employee> empsList = List.of(new Employee(1001, "Durga", 78900.89, true),
										  new Employee(1002, "Ravi", 89600.9, true),
										  new Employee(1003, "Krishna", 67800.90, true));

		map.put("empsListInfo", empsList);
		return "show_report";

	}
}
