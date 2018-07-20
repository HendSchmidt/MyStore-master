package com.example.mystore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mystore.BO.ProductsBO;
import com.example.mystore.model.Product;

@RestController
public class ProductsController {
	
	@Autowired
	private ProductsBO productsBO;
	
	
	@RequestMapping(value = "/product/search/{venue}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> searchProducts(@PathVariable("venue")String venue) {
		return productsBO.searchByVenue(venue);
	}
	
	@RequestMapping(value = "/product/list", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Product>> allProducts(){
		return new ResponseEntity<List<Product>> (productsBO.getAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/product/by-id/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Product> findById(@PathVariable("id")Long id){
		Product product = productsBO.getById(id);
		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
}
