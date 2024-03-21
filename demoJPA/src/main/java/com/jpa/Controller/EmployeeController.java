package com.jpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.pk.EmployeePK;
import com.jpa.service.Employeeservice;
import com.jpa.streamer.serviceimpl.JPAStremarServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private Employeeservice employeeservice;
	
	@Autowired
	private JPAStremarServiceImpl japServiceImpl;
	
	@PostMapping(value = "/addEmployee")
	public ResponseEntity<String> createEmployee( @RequestBody Employee employee) {
		// if you add same id and department id it is not added. 
		//any one can unique either id or department id. for more see dataTable.
		return employeeservice.createEmployee(employee);
	}
	
	@GetMapping(value = "/getEmployee")
	public List<Employee> getAllEmployees(){
		return employeeservice.getEmployees();
	}
	
	@GetMapping(value ="/getById")
	public Employee getById(@RequestBody EmployeePK id){
		return employeeservice.getById(id);
	}
	
	
//	@GetMapping(value = "/getAllStreams")
//	public List<Employee> getAll(){
//		return japServiceImpl.getAllEmployeesByStreamer();
//	}
}



