package com.luisfelipeluis49.portofacil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(WeatherAPIConfigProperties.class)
public class PortoFacilApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortoFacilApplication.class, args);
	}

}
