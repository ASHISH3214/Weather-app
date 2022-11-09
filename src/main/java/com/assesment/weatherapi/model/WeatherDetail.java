package com.assesment.weatherapi.model;

import lombok.Data;

@Data
public class WeatherDetail {
	
	private float id;
	private String main;
	private String description;
	private String icon;

}
