package com.core.head.model.observer.impl;

import com.core.head.model.observer.interfa.DisplayElement;
import com.core.head.model.observer.Observer;
import com.core.head.model.observer.interfa.Subject;

/**
 * 天气布告板---相当于每个电视台，都需要播报天气，他们都从国家气象局获取到天气信息，然后展示给观众
 * 次布告板根据WeatherData 对象显示当前观测值
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
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
        System.out.println("当前环境：" + temperature + " F华氏度 " + humidity + "% 湿度");
    }
}
