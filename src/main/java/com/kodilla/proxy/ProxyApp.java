package com.kodilla.proxy;

import com.kodilla.proxy.db.DbDataRetriever;
import com.kodilla.proxy.db.LazyDataRetrieverProxy;
import com.kodilla.proxy.weather.WeatherService;
import com.kodilla.proxy.weather.WeatherServiceProxy;

import java.util.Random;

public class ProxyApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();
        for (int n = 0; n < 5; n++) {
            WeatherService weatherService = new WeatherServiceProxy();
            int number = new Random().nextInt(100);
            if (number < 10)
                System.out.println(weatherService.refreshData());
            else if(number<40)
                System.out.println(weatherService.getWeather());
        }

        long end = System.currentTimeMillis();
        System.out.println("Czas działania programu wynosił: " + (end - begin) + " [ms]");
    }
}
