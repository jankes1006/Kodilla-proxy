package com.kodilla.proxy.weather;

import java.util.Objects;

public class WeatherServiceProxy implements WeatherService {

    private WeatherService weatherService;

    @Override
    public String getWeather() throws InterruptedException {
        initWeatherService();
        return weatherService.getWeather();
    }

    @Override
    public String refreshData() throws InterruptedException {
        initWeatherService();
        return weatherService.refreshData();
    }

    private void initWeatherService() throws InterruptedException {
        if (Objects.isNull(weatherService)) {
            System.out.println("No hej");
            weatherService = new WeatherServiceImpl();
        }
    }
}
