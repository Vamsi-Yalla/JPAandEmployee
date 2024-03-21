package com.jpa.Controller;

import java.util.List;
import java.util.Map;
import org.hibernate.id.IntegralDataTypeHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Products;
import com.jpa.projections.ProductProjections;
import com.jpa.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping(value = "/add")
	public ResponseEntity<String> addProducts(@RequestBody Products products) {
	  return  productService.addProduct(products);
	}
	@PostMapping(value = "/update")
	public ResponseEntity<String> updateProducts(@RequestBody Products products) {
	return	productService.updateProducts(products);
	}
    @DeleteMapping(value = "/delete/{id}")
	public void delteProduct(@PathVariable Long id) {
		productService.deleteProduct(id);
	}
     @GetMapping(value = "/getAll")
	public List<Products> getAllProducts() {
		return productService.getProducts();
	}
  @PostMapping(value="/saveALL")
     public void multipleAddProducts(@RequestBody List<Products> products) {
		productService.multipleSaveProducts(products);
	}
  
  @GetMapping(value="/byloc/{location}")
    public List<Products> getByLocation(@PathVariable String location) {
	 return productService.getByLocation(location);
  }
  
  @GetMapping(value="/bypn/{pname}")
  public Map<String, Long> sumOfPricesByListUsingLocation(@PathVariable("pname") String productName) {
	 return productService.sumOfPricesByListUsingLocation(productName);
}
  @GetMapping(value = "/native/{price}")
  public List<Products> getByPrice(@PathVariable("price") Integer price ){
	return  productService.getByNative(price);
  }
  
  @GetMapping(value = "/projections")
  public List<ProductProjections> getProductProjections(){
	  return productService.getProductprojections();
  } 
  
  
}
