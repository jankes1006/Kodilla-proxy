package com.kodilla.proxy.weather;

public interface WeatherService {
    String getWeather() throws InterruptedException;
    String refreshData() throws InterruptedException;
}
