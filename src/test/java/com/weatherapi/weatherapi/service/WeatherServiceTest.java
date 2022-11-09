package com.weatherapi.weatherapi.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.assesment.weatherapi.model.WeatherResult;
import com.assesment.weatherapi.service.WeatherService;

@RunWith(SpringRunner.class)
public class WeatherServiceTest {
	
	@Autowired
	private WeatherService weatherService;
	
	@Test
	public void getCityWeatherList() {
		String city = "Delhi";
		List<WeatherResult> weatherResults = new ArrayList<>();
		Mockito.when(weatherService.getCityWeather(city)).thenReturn(weatherResults);
		Assert.assertNotNull(weatherResults);
		Assert.assertNotNull(city);
		
		
	}

}
