package com.core.head.model.strategy.behavior.impl.fly;

import com.core.head.model.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是利用火箭飞行的鸭子");
    }
}
