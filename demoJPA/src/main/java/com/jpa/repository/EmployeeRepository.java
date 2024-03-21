package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entity.Employee;
import com.jpa.pk.EmployeePK;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePK> {

}
