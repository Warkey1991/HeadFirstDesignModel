package com.core.head.model.strategy;

import com.core.head.model.strategy.base.Duck;
import com.core.head.model.strategy.behavior.impl.fly.FlyNoWay;
import com.core.head.model.strategy.behavior.impl.quack.Quack;

/**
 * 模型鸭
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
