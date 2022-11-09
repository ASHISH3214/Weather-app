package com.assesment.weatherapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.weatherapi.model.WeatherResult;
import com.assesment.weatherapi.service.WeatherService;

@RestController
@RequestMapping("/api/v1")
public class WeatherController {
	
	@Autowired
	private WeatherService weatherservice;
	
	@GetMapping("/{city}")
	public ResponseEntity<List<WeatherResult>> getWeatherDetailsByCity(@PathVariable String city) throws Exception{
		
		if(city == null || city.isBlank()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		try {
			return new ResponseEntity<List<WeatherResult>>(
					weatherservice.getCityWeather(city), HttpStatus.OK);
		} catch (Exception e) {
			throw new Exception("city Not found"); 
		     
		}
		
	}

}
