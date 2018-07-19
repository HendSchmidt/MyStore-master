package com.example.mystore.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mystore.BO.ProductsBO;
import com.example.mystore.model.Products;

@RestController
@RequestMapping(value = "/product")
@ResponseBody
public class ProductsController {
	
	private ProductsBO productsBO;  
	
	@RequestMapping(value = "/search/{venue}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Products> searchProducts(@PathVariable("venue")String venue) throws Exception{
		return productsBO.searchByVenue(venue);
	}
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Products> allProducts() throws Exception{
		return productsBO.getAll();
	}
	
	@RequestMapping(value = "/by-id/{id}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public Products findById(@PathVariable("id")Long id) throws Exception{
		return productsBO.getById(id);
	}
}
