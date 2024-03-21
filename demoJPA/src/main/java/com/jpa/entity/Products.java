package com.jpa.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Products {
    
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "genrateID")
	@SequenceGenerator(name = "genrateID", sequenceName = "sequence_generate")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "product_name", nullable = false)
	private String productName;
	
	@Column(precision = 10, scale = 2)
	private Integer price;
	
	@CreationTimestamp
	private LocalDateTime manufacturedDate;
	
	@UpdateTimestamp
	private LocalDateTime updatedDate;
	
	//@Column(unique = true)
	private String location;
	
}
