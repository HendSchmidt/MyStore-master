package com.example.mystore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.mystore.model.Product;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Long>{
	
	@Query("select p.baseProduct, p.venue "
			+ "from Products p where p.venue = :venue")
	List<Product> getProductsByVenue (@Param("venue")String venue);
	
}
