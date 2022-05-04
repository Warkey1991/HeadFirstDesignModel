package com.core.head.model.observer.impl;

import com.core.head.model.observer.interfa.DisplayElement;
import com.core.head.model.observer.Observer;
import com.core.head.model.observer.interfa.Subject;

/**
 * 显示基于观测值的其他内容
 */
public class ThirdPartyDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public ThirdPartyDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("ThirdPartyDisplay 最小气压：" + pressure + " 气压 " + humidity + "% 湿度");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
