package com.example.mystore;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.mystore.BO.ProductsBO;
import com.example.mystore.controller.ProductsController;
import com.example.mystore.model.Product;
import com.example.mystore.repository.ProductsRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(ProductsController.class)
public class MystoreApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private ProductsRepository productsRepository;
	

	@Test
	public void productRequestedVersusReturned() throws Exception {
		Long number = 8796093054977L;
		Product product = new Product();
		product.setId(number);
		product.setVenue("hybris Munich, Germany");
		Mockito.when(productsRepository.findOne(number)).thenReturn(product);

		 mockMvc.perform(get("/product/by-id/" + number).accept(MediaType.APPLICATION_JSON_VALUE))
		 		.andExpect(status().isOk())
				.andExpect(jsonPath("$.id", is(number)));
						

	}

}
