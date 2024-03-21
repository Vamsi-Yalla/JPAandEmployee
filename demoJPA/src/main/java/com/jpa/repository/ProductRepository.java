package com.jpa.repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jpa.entity.Products;
import com.jpa.projections.ProductProjections;


public interface ProductRepository extends JpaRepository<Products, Long>{

	@Query("select p from Products p where p.location=:loc")
	List<Products> findLocation(@Param("loc") String location);

	@Query("select sum(p.price) as TotalSum from Products p where p.productName=:pn")
	Map<String, Long> findSumOfPrice(@Param("pn") String productName);

	@Query(value = "select * from Products where price=?1", nativeQuery = true)
	List<Products> getBynative(@Param("price") Integer price);

    // if you are using multiple parameters.
//	
//	@Query("select * from Products where price=?1 and id=?2")
//	List<Products> getBynativeMultiple(@Param("price") Integer price, @Param("id") Long id);
//    
	@Query(value = "select id,product_name,price,location from products", nativeQuery = true)
	List<ProductProjections> getProductProjections();
	
}
