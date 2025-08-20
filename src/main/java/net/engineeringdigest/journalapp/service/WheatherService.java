package net.engineeringdigest.journalapp.service;

import net.engineeringdigest.journalapp.api.response.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WheatherService {

    private static final String apiKey = "123ad54f882d858146f94667e93ee98e";

    private static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&querry_CITY";

    @Autowired
    private RestTemplate restTemplate;

    public String getWeather(String city){
        String finalAPI = API.replace("CITY",city).replace("API_KEY",apiKey);
        restTemplate.exchange(finalAPI, HttpMethod.GET,null, WeatherResponse.class);

    }

}
