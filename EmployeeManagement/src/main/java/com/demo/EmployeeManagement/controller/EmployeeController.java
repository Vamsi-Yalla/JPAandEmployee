package com.demo.EmployeeManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EmployeeManagement.model.Employee;
import com.demo.EmployeeManagement.service.EmployeeService;

import jakarta.validation.Valid;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// display list of employees method handler
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
	
		return "index";
	
	}

	@GetMapping("/shownewEmployeeForm")
	public String shownewEmployeeForm(Model model) {
		// create model attribute to bind from data

		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "new_employee";
	}
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute @Valid Employee employee) {
	    
		// save Employee to database
		employeeService.saveEmployee(employee);
		return "redirect:/";
	}
//	@PostMapping("/saveEmployee")
//	public String saveEmployee(@ModelAttribute @Valid Employee employee, BindingResult bindingResult) {
//	    if(bindingResult.hasErrors()) {
//	    	return "redirect:/shownewEmployeeForm";
//	    }
//		// save Employee to database
//		employeeService.saveEmployee(employee);
//		return "redirect:/";
//	}

	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

		// get employee from the service
		Employee employee = employeeService.getEmployeeById(id);

		// set employee as a model attribute to pre-populate the form
		model.addAttribute("employee", employee);
	
		return "update_employee";
	}

	@GetMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable(value = "id") long id) {
		// call delete employee method
		this.employeeService.deleteEmployeeById(id);
		        return "redirect:/";
		    }
		


	}
	

