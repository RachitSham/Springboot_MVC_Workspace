package com.nt.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowHomeController {

	@RequestMapping("/home")
	public String showHomePage() {
		return "welcome";
	}

	// Best way of repersenting shared memory because it make the code non-invasive
	@RequestMapping("/process")
	public String process(Map<String, Object> map) {
		System.out.println("ShowHomeController.process():: share memory Object class name:: " + map.getClass());
		// add model attribute to shared memory
		map.put("attr1", "Map");
		map.put("sysdate", LocalDateTime.now());
		
		// return Logical view name
		return "mapdata";
	
	}

	// the bad practice because the model(I) is spring api specific Interface , make the code as invasive ciode
	@RequestMapping("/model")
	public String process(Model model) {
		System.out.println("ShowHomeController.process():: shared Memory Object class name:: " + model.getClass());

		// add model attribute to shared memory
		model.addAttribute("attr1", "Model");
		model.addAttribute("sysdate", LocalDateTime.now());
		
		// return Logical view name
		return "modeldata";
	}
	
	// not good practice because model map is spring api class
	@RequestMapping("/modelmap")
	public String process(ModelMap map) {
		System.out.println("ShowHomeController.process():: shared Memory Onjects class name:: " + map.getClass());
		
		// add attribute to shared memory
		map.addAttribute("attr1","ModelMap" );
		map.addAttribute("sysdate", LocalDateTime.now());
		
		// return Logical view name
		return "modelmap";
	}
	
	
	//if controller class handler method is not returning logical view namethe handler method request path itself become the default LVN 
	@RequestMapping("/bindmap")
	public Model process() {
		// manually created shared memory
		Model bindmap  = new BindingAwareModelMap();
		
		bindmap.addAttribute("attr1", "BindingAwareModelMap");
		bindmap.addAttribute("sysdate", LocalDateTime.now());
		return bindmap;
	}
	
	/*
	 *If handler method is not having "String" return type and finds no facility for returning LVN then it takes the request path itself 
	 *as the LVN 
	 */ 
	@RequestMapping("logicalpath")
	public Map<String, Object>logicView() {
		// create shared memory
		Map<String, Object> map = new HashMap<String, Object>();
		// add model Attribute to shared memory
		map.put("attr1", "The LVN is the Request Path");
		map.put("sysdate", LocalDateTime.now());
		return map;
		
	}
	
	// taking the modelandview(legacy style)as the return type of handler method [Old Style]
	@RequestMapping("/view")
	public ModelAndView viewname() {
		// create shared memory
		ModelAndView mav = new ModelAndView();
		// add model attribute to shared memory
		mav.addObject("attr1", "The ModelAndView Name Act as a Shared Memory");
		mav.addObject("sysdate", LocalDateTime.now());
		// place the LVN to MAV Object
		mav.setViewName("model_view");
		return mav;
	}
	
	/*
	 * what happen if the return type of handler method is void  
	 * the request path of the handler method will be taken as logical view name
	 */
	@RequestMapping("/handler")
	public void handler(Map<String, Object> map) {
		// add the model attribute to shared memory
		map.put("attr1", "Request Method method will taken as LVN");
		map.put("sysdate", LocalDateTime.now());
		
	}
	
	/*
	 * what happen if the handler method return null
	 * the request path of the handler method will be taken as logical view name
	 */
	@RequestMapping("/handlernull")
	public String logical(Map<String, Object> map) {
		// add the model attribute to shared memory
		map.put("attr1", "If The handler Method return null");
		map.put("sysdate", LocalDateTime.now());
		
		return null;
	}
	
	/*
	 * this is called handler method chaining.the request given to one handler method will communicate with another handler method 
	 * of same or different controller class
	 */
	/*@RequestMapping("/request")
	public String source() {
		System.out.println("ShowHomeController.source()"); //source handler method 
		return "forward:report";
	}
	
	@RequestMapping("/report")
	public String showReport() {
		System.out.println("ShowHomeController.showReport()"); // destination handler method
		return "show_report";
	}*/
	
	/*
	 *this is called handler method chaining.but the source handler method redirect the request to destination
	 *handler method after having network round trip with browser... 
	 */
	@RequestMapping("/request")
	public String source() {
		System.out.println("ShowHomeController.source()");
		return "redirect:report";
	}
	
	@RequestMapping("report") 
	public String showReport() {
		System.out.println("ShowHomeController.showReport()");
		return "show_report";
	}
}
