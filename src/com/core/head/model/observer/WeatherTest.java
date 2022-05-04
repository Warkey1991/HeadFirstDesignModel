package com.core.head.model.observer;

import com.core.head.model.observer.impl.CurrentConditionDisplay;
import com.core.head.model.observer.impl.StatisticsDisplay;
import com.core.head.model.observer.impl.ThirdPartyDisplay;

public class WeatherTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ThirdPartyDisplay thirdPartyDisplay = new ThirdPartyDisplay(weatherData);

        weatherData.setMeasurements(60.0f, 30.4f, 22.3f);
        weatherData.setMeasurements(120.0f, 40.4f, 43.3f);

        //取消订阅
        weatherData.unRegisterObserver(thirdPartyDisplay);
        weatherData.setMeasurements(90.0f, 32.4f, 123.3f);
    }
}
