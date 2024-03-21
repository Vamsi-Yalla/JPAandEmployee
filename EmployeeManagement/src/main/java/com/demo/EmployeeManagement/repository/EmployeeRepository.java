package com.demo.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.EmployeeManagement.model.Employee;

// By defalut its provide the @Repository @Transctional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
