package com.nanyin.test.design.observer;

public class WeatherObserverB implements Observer {
    @Override
    public void update(WeatherState weatherState) {
        System.out.println("observer B get new weather message is " + weatherState.toString());
    }
}
