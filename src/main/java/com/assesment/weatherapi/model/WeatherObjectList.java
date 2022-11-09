package com.assesment.weatherapi.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class WeatherObjectList {
	
	private float dt;
	private Main main;
	private List<WeatherDetail> weather = new ArrayList<>();
	private Clouds clouds;
	private Wind wind;
	private Sys sys;
	private String dt_txt;

}
