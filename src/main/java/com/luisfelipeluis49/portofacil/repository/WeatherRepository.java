package com.luisfelipeluis49.portofacil.repository;

import com.luisfelipeluis49.portofacil.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
