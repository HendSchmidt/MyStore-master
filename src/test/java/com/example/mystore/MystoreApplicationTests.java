package com.example.mystore;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.mystore.controller.ProductsController;

@RunWith(SpringRunner.class)

@WebMvcTest(ProductsController.class)
public class MystoreApplicationTests {
	
	@Autowired
    private MockMvc mockMvc;

	@Test
	public void productRequestedVersusReturned() throws Exception {
		Long number = 8796093054977L;
		this.mockMvc.perform(get("/product/by-id/" + number))
        .andExpect(status().isOk());
	}

}
