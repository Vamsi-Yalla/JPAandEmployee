package com.jpa.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jpa.entity.Products;
import com.jpa.projections.ProductProjections;
import com.jpa.repository.ProductRepository;
import com.jpa.service.ProductService;

@Service
public class ProductSerivceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	

	@Override
	public ResponseEntity<String> addProduct(Products products) {
			productRepository.save(products);
		return new ResponseEntity<>("The products are succefully created", HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<String> deleteProduct(Long productId) {
		productRepository.deleteById(productId);
		return new ResponseEntity("The product record id succefully deleted", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> updateProducts(Products products) {
		Optional<Products> product	=productRepository.findById(products.getId());
			if (product.isPresent()) {
				
				productRepository.save(products);
				return new ResponseEntity<String>("The Data is updated Successfully", HttpStatus.OK);
			} else {
				addProduct(products);
			return new ResponseEntity<>("The products are succefully created", HttpStatus.CREATED);
			}
	}
	@Override
	public List<Products> getProducts() {
		List<Products> products = productRepository.findAll();
	long size=	productRepository.count();
	System.out.println(size);
		return products;
	}

	@Override
	public void multipleSaveProducts(List<Products> products) {
		productRepository.saveAll(products);
	}

	@Override
	public List<Products> getByLocation(String location) {
		
	return	productRepository.findLocation(location);
	}

	@Override
	public Map<String, Long> sumOfPricesByListUsingLocation(String ProductName) {
	return	productRepository.findSumOfPrice(ProductName);
		
	}

	@Override
	public List<Products> getByNative(Integer price) {
		return productRepository.getBynative(price);
	}
	
	@Override
	public List<ProductProjections> getProductprojections() {
		return productRepository.getProductProjections();
	}
          
}
