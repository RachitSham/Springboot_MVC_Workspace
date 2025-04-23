package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {

	// passing Single values
	@RequestMapping("/report")
	public String sendData(Map<String, Object> map) {
		System.out.println("ShowHomeController.sendData()");
		map.put("name", "Narendra Modi");
		map.put("age", 78);
		return "show_report";
	}

	// passing Collection and Arrys
	@RequestMapping("/show")
	public String dataHub(Map<String, Object> map) {
		// put array, collection as the model attributes values
		System.out.println("ShowHomeController.dataHub()");
		map.put("favColors", new String[] { "Red", "Blue", "Black", "Green" });
		map.put("nikNames", List.of("cheenu", "Kuku", "chum"));
		map.put("phoneNumbers", Set.of(987654321L, 6789065430L, 9988077654L));
		map.put("idDetails", Map.of("aadharNo", 98765432, "voterId", 9876543));

		return "show_data";

	}

	
}
