package com.kodilla.proxy.weather;

import java.util.Random;

import static java.lang.String.format;

public class WeatherServiceImpl implements WeatherService {

    private final static String WEATHER_MESSAGE = "Aktualna temperatura wynosi: %d";
    private final static String WEATHER_UPDATE = "Pobrano nową temperaturę. Wynosi ona: %d";
    private int temperature = 20;

    public WeatherServiceImpl() throws InterruptedException {
        this.refreshData();
    }

    @Override
    public String getWeather() {
        return format(WEATHER_MESSAGE, temperature);
    }

    @Override
    public String refreshData() throws InterruptedException {
        Thread.sleep(5000);
        temperature = new Random().nextInt(20);
        return format(WEATHER_UPDATE, temperature);
    }
}
