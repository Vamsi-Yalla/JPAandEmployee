package com.jpa.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.jpa.entity.Employee;
import com.jpa.pk.EmployeePK;

public interface Employeeservice {

	ResponseEntity<String> createEmployee(Employee employee);

	List<Employee> getEmployees();

	Employee getById(EmployeePK id);

}
