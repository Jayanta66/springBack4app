package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
	
	

	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping(method=RequestMethod.GET, value="/getemp")
	@ResponseBody
	public Employee getEmployee() {

		return new Employee(101,"VIVEk","AA");	
	}
	
	@GetMapping(value="/hello", produces="text/html")
	@ResponseBody
	public String getHello() {
		return "<body bgcolor='cyan'>Hello!!!!</body>";
	}

	
	@GetMapping("/hellojsp")
	public String getHellojsp() {
		return "hello";
	}
	
	@PostMapping("/addemp")
	@ResponseBody
	public Employee addEmployee(@RequestBody Employee emp) {
		return dao.addEmployee(emp);
	}
/*----------------------- */	
	@RequestMapping("/empform")
	public String showform(Model m) {
		m.addAttribute("command", new Employee());
		return "empform";
	}



	

	

	

	
}
