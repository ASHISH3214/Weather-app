package com.assesment.weatherapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.assesment.weatherapi.model.Weather;
import com.assesment.weatherapi.model.WeatherObjectList;
import com.assesment.weatherapi.model.WeatherResult;

@Service
public class WeatherService {


	public final RestTemplate restTemplate = new RestTemplate();

	public List<WeatherResult> getCityWeather(String city) {

		Weather weather = restTemplate.getForObject(
				"https://api.openweathermap.org/data/2.5/forecast?q=" + city +"&appid=d2929e9483efc82c82c32ee7e02d563e", Weather.class);

		List<WeatherResult> weatherResults = new ArrayList<>();
		List<WeatherObjectList> threeDaysWeather = new ArrayList<>();

		List<WeatherObjectList> list = weather.getList();


		if(!list.get(0).getDt_txt().contains("00:00:00"))
			threeDaysWeather.add(list.get(0));

		for(WeatherObjectList li : list) {
			if(li.getDt_txt().contains("00:00:00")) {
				threeDaysWeather.add(li);
			}
		}


		for(WeatherObjectList objectList : threeDaysWeather.subList(0, 3)) {

			WeatherResult result = new WeatherResult();


			if(objectList.getMain() != null) {

				result.setHigh(objectList.getMain().getTemp_max() - 273.15F);
				result.setLow(objectList.getMain().getTemp_min() - 273.15F );
				result.setDate(objectList.getDt_txt());

				float temprature = (objectList.getMain().getTemp()) - 273.15F;

				if(temprature > 40.0) {
					result.setMessage("Use sunscreen lotion");
					System.out.println("Use sunscreen lotion");
				}
				else if(objectList.getWeather().get(0).getMain().equalsIgnoreCase("Rain")) {
					result.setMessage("Carry Umbrella");
					System.out.println("Carry Umbrella");
				}
				else {
					result.setMessage(objectList.getWeather().get(0).getMain());
					System.out.println(objectList.getWeather().get(0).getMain());
				}
			}

			weatherResults.add(result);
		}


		return weatherResults;
	}

}
