package com.kodilla.proxy;

import com.kodilla.proxy.db.DbDataRetriever;
import com.kodilla.proxy.db.LazyDataRetrieverProxy;
import com.kodilla.proxy.weather.WeatherService;
import com.kodilla.proxy.weather.WeatherServiceProxy;

import java.util.Random;

public class ProxyApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        WeatherService weatherService = new WeatherServiceProxy();
        for (int n = 0; n < 5; n++) {
            int number = new Random().nextInt(100);
            System.out.println(weatherService.getWeather());
            if (number < 20)
                System.out.println(weatherService.refreshData());
        }

        long end = System.currentTimeMillis();
        System.out.println("Czas działania programu wynosił: " + (end - begin) + " [ms]");
    }
}
