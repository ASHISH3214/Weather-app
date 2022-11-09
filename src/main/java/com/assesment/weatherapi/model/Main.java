package com.assesment.weatherapi.model;

import lombok.Data;

@Data
public class Main {
	
	private float temp;
	private float temp_min;
	private float temp_max;
	private float pressure;
	private float sea_level;
	private float grnd_level;
	private float humidity;
	private float temp_kf;

}
//"temp": 287.44,
//"temp_min": 287.31,
//"temp_max": 287.44,
//"pressure": 1003,
//"sea_level": 1003,
//"grnd_level": 1001,
//"humidity": 88,
//"temp_kf": 0.13