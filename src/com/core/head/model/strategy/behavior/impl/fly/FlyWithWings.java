package com.core.head.model.strategy.behavior.impl.fly;

import com.core.head.model.strategy.behavior.FlyBehavior;

/**
 * 有翅膀的鸭子的飞行行为
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm wings");
    }
}
