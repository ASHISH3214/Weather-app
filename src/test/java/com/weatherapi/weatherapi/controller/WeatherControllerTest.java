package com.weatherapi.weatherapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.assesment.weatherapi.controller.WeatherController;
import com.assesment.weatherapi.model.WeatherResult;
import com.assesment.weatherapi.service.WeatherService;

@RunWith(SpringRunner.class)
public class WeatherControllerTest {
	
	@Autowired
	private MockMvc mvc;

	@Autowired
	private WebApplicationContext applicationContext;
	
	@InjectMocks
	private WeatherController controller;
	
	@Mock
	private RequestAttributes attribute;
	
	@Mock
	private WeatherService service;
	
//	@Before
//	public void setup() {
//		RequestContextHolder.setRequestAttributes(attribute);
//		this.mvc = MockMvcBuilders.standaloneSetup(controller).build();
//	}
//	
//	@Test
//	private void getWeatherDetailsByCity() {
//		String city = "Delhi";
//		List<WeatherResult> weatherResults = new ArrayList<>(); 
//		Mockito.when(service.getCityWeather(city)).thenReturn(weatherResults);
//		Assert.assertNotNull(weatherResults);
//		Assert.assertNotNull(city);
//		
//
//	} 

}
