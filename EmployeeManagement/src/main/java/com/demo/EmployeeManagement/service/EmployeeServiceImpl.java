package com.demo.EmployeeManagement.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.EmployeeManagement.model.Employee;
import com.demo.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> listEmployees= employeeRepository.findAll();
		Comparator<Employee> comparator=(e1,e2)->(int)(e1.getId()-e2.getId());
		Collections.sort(listEmployees,comparator);
		return listEmployees;
	}

	@Override
	public void saveEmployee(Employee employee) {
	  employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeById(long id) {
	Optional<Employee> optional=employeeRepository.findById(id);
	Employee employee=null;
	 if (optional.isPresent()) {
		employee= optional.get();
		
	}
	 else {
		 throw new RuntimeException("Employee not found for id :: "+ id);
	}
	 return employee;
	}
 
	@Override
	public void deleteEmployeeById(long id) {
		employeeRepository.deleteById(id);
	}
	
}
