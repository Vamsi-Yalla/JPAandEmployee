package com.jpa.entity;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(indexName = "order")
public class Order {

	@Id
	private Long id;
	
	@Field(type=FieldType.Text)
	private String personName;
	
	@Field(type=FieldType.Long)
	private Long phNo;
	@Field(type=FieldType.Text)
	private String orderName;
	@Field(type=FieldType.Text)
	private String address;
	@Field(type=FieldType.Double)
	private Double productPrice;
}
