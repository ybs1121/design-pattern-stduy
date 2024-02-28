package com.example.designpattern.옵저버패턴;

import com.example.designpattern.옵저버패턴.subject.WeatherData;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WeatherTest {

    @Test
    void test() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(11, 12, 13);
    }
}
