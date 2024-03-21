package com.jpa.service;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.jpa.entity.Products;
import com.jpa.projections.ProductProjections;

public interface ProductService {

	ResponseEntity<String> addProduct(Products products);
	ResponseEntity<String> deleteProduct(Long productId);
	ResponseEntity<String> updateProducts(Products products);
	List<Products> getProducts();
	void multipleSaveProducts(List<Products> products);
	List<Products> getByLocation(String location);
	Map<String, Long> sumOfPricesByListUsingLocation(String loc);
	List<Products> getByNative(Integer price);
	List<ProductProjections> getProductprojections();
	
}
