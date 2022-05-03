package com.core.head.model.strategy;

import com.core.head.model.strategy.base.Duck;

/**
 * 诱饵鸭
 */
public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("我是一只诱饵鸭");
    }
}
