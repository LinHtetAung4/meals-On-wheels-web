package com.educlaas.sociallogin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import com.educlaas.sociallogin.payload.Login;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class LoginTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void userLogInTest() throws Exception{
		Login logInRequest =new Login();
		logInRequest.setEmail("Lin@gmail.com");
		logInRequest.setPassword("12345");
		
		mockMvc.perform(MockMvcRequestBuilders.post("/merrymeals/login")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(logInRequest)))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$.accessToken").isString());
		
	}
	
	private String asJsonString(final Object obj) {
		try {
			return new ObjectMapper().writeValueAsString(obj);
		}catch(Exception e) {
		throw new RuntimeException(e);	
		
		}
	}
}
