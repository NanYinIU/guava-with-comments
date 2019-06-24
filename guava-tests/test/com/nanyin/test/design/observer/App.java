package com.nanyin.test.design.observer;

public class App {
    public static void main(String[] args) {
        Weather weather = new BeijingWeather(WeatherState.SUNNY_DAY);
        weather.addObserver(new WeatherObserverA()).addObserver(new WeatherObserverB());
        weather.notifyObserver();
    }
}
