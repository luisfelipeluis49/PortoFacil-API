package com.luisfelipeluis49.portofacil.service;

import com.luisfelipeluis49.portofacil.WeatherAPIConfigProperties;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WeatherService {
    private final WeatherAPIConfigProperties weatherConfig;

    public WeatherService(WeatherAPIConfigProperties weatherConfig) {
        this.weatherConfig = weatherConfig;
    }

    public String getWeatherFromAPI(String locality) throws IOException {
        OkHttpClient ok = new OkHttpClient();
        Request request;
        String url = weatherConfig.apiUrl() + "?key=" + weatherConfig.apiKey() + "&lang=pt&q=" + locality;

        request = new Request.Builder()
                .url(weatherConfig.apiUrl())
                .get()
                .build();

        return getResponse(ok, request);
    }

    public String getResponse(OkHttpClient ok, Request request) throws IOException {
        Response response = ok.newCall(request).execute();
        String getResponseBody = response.body().string();
        return getResponseBody;
    }
}
