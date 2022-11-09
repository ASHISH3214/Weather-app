package com.assesment.weatherapi.model;

import lombok.Data;

@Data
public class City {
	
	private float id;
	private String name;
	private Coord coord;
	private String country;

}
