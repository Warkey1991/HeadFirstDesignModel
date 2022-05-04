package com.core.head.model.observer.impl;

import com.core.head.model.observer.interfa.DisplayElement;
import com.core.head.model.observer.Observer;
import com.core.head.model.observer.interfa.Subject;

/**
 * 根据气压显示天气预报
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("当前环境：" + pressure + " 气压 " + humidity + "% 湿度");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
