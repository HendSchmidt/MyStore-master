package com.example.mystore.BO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.mystore.model.Products;
import com.example.mystore.repository.ProductsRepository;

public class ProductsBO {
	private final static String warningList = "There was a problem loading the list.";
	private final static String warningObject = "There was a problem loading the object.";
	
	@Autowired
	ProductsRepository productsRepository;
	
	Products products;
	
	public List<Products> searchByVenue(String venue) throws Exception {
		List<Products> productsList = productsRepository.getProductsByVenue(venue);
		
		if(productsList.isEmpty())
			throw new Exception(warningList); 
		
		return productsList;
	}
	
	public List<Products> getAll() throws Exception {
		List<Products> productsList = productsRepository.findAll();
		
		if(productsList.isEmpty())
			throw new Exception(warningList); 
		
		return productsList;
	}
	
	public Products getById(Long id) throws Exception {
		Products products = productsRepository.findOne(id);
		
		if(products.equals(null))
			throw new Exception(warningObject);
		
		return products; 
	}

}
