package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.pojo.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/registrationForm")
	public String showRegistrationForm(Model theModel1) {

		Employee employee = new Employee();

		theModel1.addAttribute("employeeModel", employee);

		return "employee-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("employeeModel") Employee employee) {

		return "registration-conformed";
	}
}
