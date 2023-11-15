package com.luisfelipeluis49.portofacil;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("weather")
public record WeatherAPIConfigProperties(String apiKey, String apiUrl) {
}
