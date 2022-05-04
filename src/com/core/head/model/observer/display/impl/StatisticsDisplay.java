package com.core.head.model.observer.display.impl;

import com.core.head.model.observer.display.interfa.DisplayElement;
import com.core.head.model.observer.display.Observer;
import com.core.head.model.observer.display.interfa.Subject;

/**
 * 显示最小、平均和最大的观测值， 需要实现Observer 接口，代表该对象可以作为观察者
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("最小气压：" + pressure + " 气压 " + humidity + "% 湿度");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
