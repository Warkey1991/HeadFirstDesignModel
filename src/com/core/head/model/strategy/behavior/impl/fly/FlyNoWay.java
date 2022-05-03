package com.core.head.model.strategy.behavior.impl.fly;

import com.core.head.model.strategy.behavior.FlyBehavior;

/**
 * 不会飞的鸭子
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm not fly");
    }
}
