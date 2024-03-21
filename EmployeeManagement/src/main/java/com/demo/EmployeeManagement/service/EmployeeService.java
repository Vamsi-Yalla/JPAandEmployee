package com.demo.EmployeeManagement.service;

import java.util.List;

import com.demo.EmployeeManagement.model.Employee;

public interface EmployeeService {

 List<Employee> getAllEmployees() ;

void saveEmployee(Employee employee);

Employee getEmployeeById(long id);

void deleteEmployeeById(long id);

 

}
