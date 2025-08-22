package net.engineeringdigest.journalapp.service;

import net.engineeringdigest.journalapp.api.response.WeatherResponse;
import net.engineeringdigest.journalapp.cache.AppCache;
import net.engineeringdigest.journalapp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;


    private static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;


    public WeatherResponse getWeather(String city) {
        String urlTemplate = appCache.APP_CACHE.get("weather-api");
        if (urlTemplate == null) {
            throw new RuntimeException("weather-api URL not found in APP_CACHE");
        }
        if (apiKey == null || apiKey.isEmpty()) {
            throw new RuntimeException("API Key is missing. Check application.properties");
        }

        String finalAPI = urlTemplate.replace("CITY", city).replace("API_KEY", apiKey);
        ResponseEntity<WeatherResponse> response =
                restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        return response.getBody();
    }

}
