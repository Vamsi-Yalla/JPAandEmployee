package com.jpa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.jpa.pk.EmployeePK;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(EmployeePK.class)
public class Employee {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long departId;
	private String emplyeeName;
	private String departmentName;
	private Double salaryDouble;
	@CreationTimestamp
	private LocalDateTime joing;
}
