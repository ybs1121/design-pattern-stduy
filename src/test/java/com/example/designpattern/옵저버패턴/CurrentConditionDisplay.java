package com.example.designpattern.옵저버패턴;

import com.example.designpattern.옵저버패턴.observer.Observer;
import com.example.designpattern.옵저버패턴.subject.Subject;

public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay : Current temp : " + temperature + " humidity : " + humidity);
    }
}
