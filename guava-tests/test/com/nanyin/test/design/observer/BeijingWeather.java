package com.nanyin.test.design.observer;

public class BeijingWeather extends Weather {

    BeijingWeather(WeatherState weatherState) {
        this.weatherState = weatherState;
    }

    public void changeState(WeatherState we){
       this.weatherState = we;
    }

}
