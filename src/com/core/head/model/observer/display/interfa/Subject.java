package com.core.head.model.observer.display.interfa;

import com.core.head.model.observer.display.Observer;

/**
 * 主题
 * 订阅和取消订阅需要的是同一个对象，就相当于你订阅了报纸，也需要你自己去取消订阅。
 */
public interface Subject {
    /**
     * 订阅
     */
    void registerObserver(Observer o);

    /**
     * 取消订阅
     */
    void unRegisterObserver(Observer o);

    /**
     * 通知所有的观察者，当主题状态改变时，就会通知所有的观察者
     */
    void notifyObservers();
}
