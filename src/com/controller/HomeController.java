package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.EmployeeDao;
import com.model.Employee;

@Controller
public class HomeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping("/")
	public String home(){
		employeeDao.check();
		return "index";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam("id") int id,
			@RequestParam("name") String name, @RequestParam("salary") float salary){
		System.out.println("id="+id+"\nname="+name);
		employeeDao.update(new Employee(id, name, salary));
		return "update";
	}
}
