package com.demo.EmployeeManagement.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Frist name is mandatory")
	private String fristName;
	@NotBlank(message = "Last name is mandatory")
	private String lastName;
	@Email(message = "Envalid Emai format")
	private String email;
	@NotNull(message = "location is required")
	private String location;

	public Employee(Long id, String fristName, String lastName, String email, String location) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.location = location;
	}

	public Employee() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getFristName() {
		return fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getLocation() {
		return location;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
