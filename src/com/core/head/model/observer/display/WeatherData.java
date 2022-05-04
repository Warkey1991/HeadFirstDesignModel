package com.core.head.model.observer.display;

import com.core.head.model.observer.display.interfa.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 气象站数据平台，得到数据后要通知观察者用于显示
 */
public class WeatherData implements Subject {
    /**
     * 保存订阅者的对象
     */
    private List<Observer> observers;
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float humidity;
    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
        //构造方法中创建保存订阅者对象的集合
        this.observers = new ArrayList<>();
    }

    /**
     * 天气发生了变化就要通知观察者
     */
    private void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 设置数据源的变化
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        if (observers.contains(o)) { //如果已经订阅了，就无须再次订阅
            return;
        }
        observers.add(o);
    }

    @Override
    public void unRegisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }
}
