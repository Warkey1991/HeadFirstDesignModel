package com.core.head.model.observer.display;

/**
 * 观察者
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
