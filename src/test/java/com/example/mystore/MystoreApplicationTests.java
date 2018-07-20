package com.example.mystore;

import org.junit.Test;
import org.junit.runner.RunWith;
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

@RunWith(SpringRunner.class)
@WebMvcTest(ProductsController.class)
public class MystoreApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;
	
	@MockBean
	private ProductsBO productsBO;

	@Test
	public void productRequestedVersusReturned() throws Exception {
		Long number = 8796093054977L;
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/product/by-id/"+ number).accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		System.out.println(result.getResponse());

	}

}
