package com.example.mystore.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.mystore.ProductInvalidExeception;
import com.example.mystore.model.Product;
import com.example.mystore.repository.ProductsRepository;

@Component
public class ProductsBO {
	private final static String WARNING_LIST = "THERE WAS A PROBLEM LOADING THE LIST.";
	private final static String WARNING_OBJECT = "THERE WAS A PROBLEM LOADING THE OBJECT.";
	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Transactional
	public List<Product> searchByVenue(String venue)  {
		List<Product> productsList = productsRepository.getProductsByVenue(venue);
		
		if(productsList.isEmpty())
			throw new ProductInvalidExeception(WARNING_LIST); 
		
		return productsList;
	}
	
	@Transactional
	public List<Product> getAll()  {
		List<Product> productsList = productsRepository.findAll();
		
		if(productsList.isEmpty())
			throw new ProductInvalidExeception(WARNING_LIST); 
		
		return productsList;
	}
	
	@Transactional
	public Product getById(Long id) {
		Product product = new Product();
		product = productsRepository.findOne(id);
		
		if(product == null)
			throw new ProductInvalidExeception(WARNING_OBJECT);
		
		return product; 
	}

}
