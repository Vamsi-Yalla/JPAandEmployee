package com.jpa.projections;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductProjectionsDto {

	private Long id;

	private String productName;

	private Integer price;

	private String location;
	
}
