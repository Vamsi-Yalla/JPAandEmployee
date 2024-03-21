package com.jpa.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jpa.entity.Employee;
import com.jpa.pk.EmployeePK;
import com.jpa.repository.EmployeeRepository;
import com.jpa.service.Employeeservice;

@Service
public class EmployeeServiceImpl implements Employeeservice{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public ResponseEntity<String> createEmployee(Employee employee) {
		Employee employee2= employeeRepository.save(employee);
		return new ResponseEntity<String>("The Employee data is succefully created", HttpStatus.CREATED);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getById(EmployeePK id) {
  Optional<Employee> employees = employeeRepository.findById(id);
       return employees.get();
	}

}
